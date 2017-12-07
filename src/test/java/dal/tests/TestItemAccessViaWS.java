package dal.tests;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import inventory.ws.DALException;
import inventory.ws.DALService;
import inventory.ws.DALServiceService;
import inventory.ws.Inventory;
import inventory.ws.Item;
/**
 * Test the CRUD operations on Item via the DAL SOAP interface
 * @author Jerome Boyer
 *
 */
public class TestItemAccessViaWS {

	static DALService serv;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 serv= (new DALServiceService()).getDALServicePort();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetItems() {
		System.out.println("Get all items via DAL WS");
		List<Item> items;
		try {
			items = serv.items();
			Assert.assertTrue(items.size()>10);
			for (Item item : items){
				   System.out.println(item.getName());	
			}
		} catch (DALException e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@Test
	public void testGetItem(){
		System.out.print("Get item 13403 via DAL WS ");
		Item item = null;
		try {
			item=serv.itemById(13403);
			Assert.assertNotNull(item);
			Assert.assertTrue(13403== item.getId());
			Assert.assertEquals("Computing Scale", item.getName());
		} catch(DALException e) {
			e.printStackTrace();
			Assert.fail();
		}
		System.out.println(" --> success");
	}

	@Test
	public void testCreateDeleteItem(){
		System.out.println("create new item via DAL WS ");
		Item item = new Item();
		item.setName("A test item");
		item.setDescription("item description");
		item.setPrice(new Double(1000));
		item.setImg("image url");
		
		
		try {
			Item itemOut=serv.newItem(item);
			Assert.assertNotNull(itemOut);
			Assert.assertTrue(itemOut.getId()>0);
			Assert.assertNotNull(itemOut.getName());
			Assert.assertEquals("A test item", itemOut.getName());
			System.out.print("...now delete it via DAL WS ");
			String r=serv.deleteItem(itemOut.getId());
			Assert.assertNotNull(r);
			Assert.assertEquals("Success",r);
		} catch (DALException e) {
			e.printStackTrace();
			Assert.fail();
		}
		System.out.println(" --> success");
	}
	
	@Test
	public void testUpdateQuantity(){
		System.out.println("Update inventory for item 13404 via DAL WS ");
		Inventory iv=null;
		try {
			iv=serv.addItemToSite(13404, 5, "Site_B", 1, 1000);
			Assert.assertNotNull(iv);
		    
		} catch (DALException e) {
			e.printStackTrace();
			Assert.fail();
		}
		System.out.println(" --> success");
	}
}
