package ws.tests;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import inventory.ws.InventoryService;
import inventory.ws.InventoryServiceService;
import inventory.ws.Item;

public class TestAccessToWS {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetItems() {
		InventoryService serv= (new InventoryServiceService()).getInventoryServicePort();
		List<Item> items=serv.items();
		for (Item item : items){
		   System.out.println(item.getName());	
		}
	}

}
