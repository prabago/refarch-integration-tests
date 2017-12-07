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

public class IIBclient extends RestClient {
	
	protected static Properties props = new Properties();

	static {
		InputStream fin=APICclient.class.getClassLoader().getResourceAsStream("env.properties");
		 try {
			props.load(fin);
		} catch (IOException e) {
			e.printStackTrace();
			props.setProperty("iib", "172.16.254.83");
		}
	}

	public IIBclient(){
		init();
	}

	private void init(){
		setHost( new HttpHost(props.getProperty("iib"),this.getPort(),"https"));
		setHttpClient(HttpClients.custom().setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE).build());
	}
	
	 @Override
	    public String executeGetMethod(String url,List<NameValuePair> nvps) throws Exception {
	    	HttpGet request = new HttpGet(buildCompleteUrl(url,nvps));
	    	request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
	    	request.setHeader(HttpHeaders.ACCEPT, "application/json");
			return executeMethod(request);
		}

}
