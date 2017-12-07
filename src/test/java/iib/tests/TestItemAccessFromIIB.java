package iib.tests;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.gson.Gson;

import inventory.test.APICclient;
import inventory.test.IIBclient;
import inventory.ws.Item;

public class TestItemAccessFromIIB {

	static IIBclient client;
	static String urlapi="/inventory-api-iib";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		client = new IIBclient();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetItems() throws Exception {
		
    	
    	String itemArray=client.executeGetMethod(urlapi+"/items",null);
		Gson parser = new Gson();
		@SuppressWarnings("unchecked")
		Item[] l = parser.fromJson(itemArray, Item[].class);
		Assert.assertTrue(l.length>0);
	}

}
