package ws.tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import inventory.ws.DALException;
import inventory.ws.InventoryService;
import inventory.ws.InventoryServiceService;
import inventory.ws.Item;


public class TestFault {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testBadInputOperation() {
		InventoryService serv= (new InventoryServiceService()).getInventoryServicePort();
		Item item;
		boolean gotIt=false;
		try {
			item = serv.itemByName("");
		} catch (DALException e) {
			Assert.assertTrue("ERR002".equals(e.getFaultInfo().getCode()));
			System.out.println(e.getFaultInfo().getMessage());
			gotIt=true;
		}
		if (!gotIt) {
			Assert.fail();
		}
	}

	@Test
	public void testBadId() {
		InventoryService serv= (new InventoryServiceService()).getInventoryServicePort();
		Item item;
		boolean gotIt=false;
		try {
			item = serv.itemById(-3);
		} catch (DALException e) {
			Assert.assertTrue("ERR001".equals(e.getFaultInfo().getCode()));
			System.out.println(e.getFaultInfo().getMessage());
			gotIt=true;
		}
		if (!gotIt) {
			Assert.fail();
		}
	}
	

}
