package api.tests;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.gson.Gson;

import inventory.test.APICclient;
import inventory.ws.Item;

/**
 * Test the API Connect Inventory API using the API Connect Gateway end point.
 * @author Jerome Boyer
 *
 */
public class TestAccessToAPI {
	static APICclient client;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		client = new APICclient();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	

	@Test
	public void testGetItemsDirectAccessToAPIC() {
		
		try {
			String itemArray=client.executeGetMethod("csplab/sb/sample-inventory-api/items", null);
			Gson parser = new Gson();
			@SuppressWarnings("unchecked")
			Item[] l = parser.fromJson(itemArray, Item[].class);
			Assert.assertTrue(l.length>0);
			Assert.assertTrue(l[0].getItemId() == 13402);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testGetOneItemDirectAccessToAPIC() {
		
		try {
			String itemArray=client.executeGetMethod("csplab/sb/sample-inventory-api/item/13402", null);
			Gson parser = new Gson();
			@SuppressWarnings("unchecked")
			Item l = parser.fromJson(itemArray, Item.class);
			Assert.assertTrue(l.getItemId() == 13402);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	
	@Test
	public void testLoginAccess(){
		try {
			String token=client.executeGetMethod("csplab/sb/sample-inventory-api/login?username=irazabal@us.ibm.com&password=Passw0rd!", null);
			System.out.println(token);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
