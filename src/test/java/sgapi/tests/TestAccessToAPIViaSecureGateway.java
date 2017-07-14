package sgapi.tests;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.google.gson.Gson;

import inventory.test.APICclient;
import inventory.test.LoginRep;
import inventory.ws.Item;

/**
 * Test the Inventory API 
 * @author Jerome Boyer
 *
 * We are using the name to sort the test so login is performed first to get the Oath security token so other calls
 * can work
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAccessToAPIViaSecureGateway {
	static APICclient client;
	static String token="";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		client = new APICclient("cap-sg-prd-5.integration.ibmcloud.com",16582);
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	@Test
	public void aTestLoginAccess(){
		try {
			List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			nvps.add(new BasicNameValuePair("username", "case@usibm"));
			nvps.add(new BasicNameValuePair("password", "case01"));
			String rep=client.executeLogin("csplab/sb/sample-inventory-api/login", nvps);
			Gson parser = new Gson();
			token=parser.fromJson(rep, LoginRep.class).getAccess_token();
			System.out.println(token);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testBluemixSecureGatewayAccess() {
		try {
			String itemArray=client.executeGetWithToken("csplab/sb/sample-inventory-api/item/13402", null,token);
			Gson parser = new Gson();
			@SuppressWarnings("unchecked")
			Item l = parser.fromJson(itemArray, Item.class);
			Assert.assertTrue("Hollerith Tabulator".equals(l.getName()));
			System.out.println(itemArray);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
