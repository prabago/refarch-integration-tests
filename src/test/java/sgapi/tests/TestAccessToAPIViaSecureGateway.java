package sgapi.tests;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import inventory.test.APICclient;

/**
 * Test the Inventory API 
 * @author Jerome Boyer
 *
 */
public class TestAccessToAPIViaSecureGateway {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	@Test
	public void testBluemixSecureGatewayAccess() {
		APICclient client = new APICclient("cap-sg-prd-5.integration.ibmcloud.com",16582);
		try {
			String itemArray=client.executeGetMethod("csplab/sb/sample-inventory-api/items", null);
			System.out.println(itemArray);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
