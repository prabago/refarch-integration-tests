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
			props.setProperty("x-ibm-client-Id","1dc939dd-c8dc-4d7e-af38-04f9afb78f60");
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
    	request.setHeader("x-ibm-client-Id",props.getProperty("x-ibm-client-Id"));
    	
		return executeMethod(request);
	}
}
