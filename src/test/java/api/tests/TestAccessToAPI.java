package api.tests;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import inventory.test.APICclient;

public class TestAccessToAPI {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		APICclient client = new APICclient();
		try {
			String itemArray=client.executeGetMethod("csplab/sb/InventoryService/items", null);
			System.out.println(itemArray);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}


}
