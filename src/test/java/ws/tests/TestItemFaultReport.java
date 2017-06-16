package ws.tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import inventory.ws.DALException;
import inventory.ws.InventoryService;
import inventory.ws.InventoryServiceService;
import inventory.ws.Item;


/**
 * Test the fault reporting
 * @author Jerome Boyer
 *
 */
public class TestItemFaultReport {

	static InventoryService serv;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 serv= (new InventoryServiceService()).getInventoryServicePort();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testgetItemWithBadInputOperation() {
		Item item;
		boolean gotIt=false;
		try {
			item = serv.itemByName("");
		} catch (DALException e) {
			Assert.assertTrue("ERRDAO3002".equals(e.getFaultInfo().getCode()));
			System.out.println(e.getFaultInfo().getMessage());
			gotIt=true;
		}
		if (!gotIt) {
			Assert.fail();
		}
	}

	@Test
	public void testgetItemByIdWithBadId() {
		Item item;
		boolean gotIt=false;
		try {
			item = serv.itemById(-3);
		} catch (DALException e) {
			Assert.assertTrue("ERRDAO3001".equals(e.getFaultInfo().getCode()));
			System.out.println(e.getFaultInfo().getMessage());
			gotIt=true;
		}
		if (!gotIt) {
			Assert.fail();
		}
	}
	
	@Test
	public void testCreateItemWithNoName(){
		
		Item item = new Item();
		boolean gotIt=false;
		try {
			item = serv.newItem(item);
		} catch (DALException e) {
			Assert.assertTrue("ERRDAO1000".equals(e.getFaultInfo().getCode()));
			System.out.println(e.getFaultInfo().getMessage());
			gotIt=true;
		}
		if (!gotIt) {
			Assert.fail();
		}
	}
	
	
	@Test
	public void testUpdateItemWithNoName(){
		// create a new item to avoid spoiling the existing one
		Item itemOut =null;
		Item item = new Item();
		item.setName("A test item");
		item.setDescription("item description");
		item.setPrice(new Double(1000));
		item.setImg("image url");
		boolean gotIt=false;
		try {
			itemOut=serv.newItem(item);
			Assert.assertTrue(itemOut.getId()>0);
			// unset name
			itemOut.setName("");
			item = serv.updateItem(itemOut);
		} catch (DALException e) {
			Assert.assertTrue("ERRDAO2000".equals(e.getFaultInfo().getCode()));
			System.out.println(e.getFaultInfo().getMessage());
			gotIt=true;
		}
		if (gotIt) {
			try {
				serv.deleteItem(itemOut.getId());
			} catch (DALException e) {
				e.printStackTrace();
				Assert.fail();
			}
		} else {
			Assert.fail();
		}
	}

	@Test
	public void testUpdateItemWithNoId(){
		// create a new item to avoid spoiling the existing one
		Item itemOut =null;
		Item item = new Item();
		item.setName("A test item");
		item.setDescription("item description");
		item.setPrice(new Double(1000));
		item.setImg("image url");
		boolean gotIt=false;
		Long keepIdToDelete= new Long(0);
		try {
			itemOut=serv.newItem(item);
			Assert.assertTrue(itemOut.getId()>0);
			keepIdToDelete=itemOut.getId();
			// unset name
			itemOut.setId(null);
			item = serv.updateItem(itemOut);
		} catch (DALException e) {
			Assert.assertTrue("ERRDAO2001".equals(e.getFaultInfo().getCode()));
			System.out.println(e.getFaultInfo().getMessage());
			gotIt=true;
		}
		if (gotIt) {
			try {
				serv.deleteItem(keepIdToDelete);
			} catch (DALException e) {
				e.printStackTrace();
				Assert.fail();
			}
		} else {
			Assert.fail();
		}
	}

	@Test
	public void testNonExistantItem(){
		Item item;
		try {
			item = serv.itemById(1);
			Assert.assertNull(item);
		} catch (DALException e) {
			Assert.fail();
		}
	}
}
