package inventory.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class APICclient extends RestClient{
	protected Gson parser = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
	protected String hostName;

	protected static Properties props = new Properties();

	static {
		InputStream fin=APICclient.class.getClassLoader().getResourceAsStream("env.properties");
		 try {
			props.load(fin);
		} catch (IOException e) {
			e.printStackTrace();
			props.setProperty("apigateway", "172.16.50.8");
			props.setProperty("x-ibm-client-Id","5d2a6edb-793d-4193-b9b0-0a087ea6c123");
		}
	}

	public APICclient(){
		init();
	}

	private void init(){
		setHost( new HttpHost(props.getProperty("apigateway"),this.getPort(),"https"));
    setHttpClient(HttpClients.custom().setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE).build());
	}

	public APICclient(String name,int port){
		this.setPort(port);
		props.setProperty("apigateway", name);
		init();
	}



    @Override
    public String executeGetMethod(String url,List<NameValuePair> nvps) throws Exception {
    	HttpGet request = new HttpGet(buildCompleteUrl(url,nvps));
    	request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
    	request.setHeader(HttpHeaders.ACCEPT, "application/json");
    	request.setHeader("X-IBM-Client-Id",props.getProperty("x-ibm-client-Id"));
		return executeMethod(request);
	}

    public String executeLogin(String url,List<NameValuePair> nvps) throws Exception{
    	HttpGet request = new HttpGet(buildCompleteUrl(url,nvps));
    	request.setHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
    	request.setHeader(HttpHeaders.ACCEPT, "application/json");
    	request.setHeader("X-IBM-Client-Id",getProps().getProperty("x-ibm-client-Id"));
    	return executeMethod(request);
    }


    public String executeGetWithToken(String url,List<NameValuePair> nvps,String token) throws Exception{
    	HttpGet request = new HttpGet(buildCompleteUrl(url,nvps));
    	request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
    	request.setHeader(HttpHeaders.ACCEPT, "application/json");
    	request.setHeader(HttpHeaders.AUTHORIZATION,"Bearer "+token);
    	request.setHeader("X-IBM-Client-Id",getProps().getProperty("x-ibm-client-Id"));

    	return executeMethod(request);
    }
	public static Properties getProps() {
		return props;
	}

	public static void setProps(Properties props) {
		APICclient.props = props;
	}
}
