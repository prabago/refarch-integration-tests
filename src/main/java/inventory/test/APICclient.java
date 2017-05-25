package inventory.test;

import java.util.List;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class APICclient extends RestClient{
	protected Gson parser = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
	protected String hostName= "172.16.254.89";
	
    public APICclient(){
    	setHost( new HttpHost(hostName,this.getPort(),"https"));
    	setHttpClient(HttpClientBuilder.create().build());	
    }
    
    public APICclient(String hn){
    	setHost( new HttpHost(hn,this.getPort(),"https"));
    	setHttpClient(HttpClientBuilder.create().build());	
    }

    public APICclient(String hn,int port){
    	setPort(port);
    	setHost( new HttpHost(hn,this.getPort(),"https"));
    	setHttpClient(HttpClientBuilder.create().build());	
    }
    
    @Override
    public String executeGetMethod(String url,List<NameValuePair> nvps) throws Exception {
    	HttpGet request = new HttpGet(buildCompleteUrl(url,nvps));
    	request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
    	request.setHeader(HttpHeaders.ACCEPT, "application/json");
    	request.setHeader("x-ibm-client-Id","1dc939dd-c8dc-4d7e-af38-04f9afb78f60");
    	
		return executeMethod(request);
	}
}
