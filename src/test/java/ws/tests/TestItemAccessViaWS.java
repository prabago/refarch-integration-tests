package ws.tests;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import inventory.ws.DALException;
import inventory.ws.InventoryService;
import inventory.ws.InventoryServiceService;
import inventory.ws.Item;
/**
 * Test the CRUD operations on Item via the DAL SOAP interface
 * @author Jerome Boyer
 *
 */
public class TestItemAccessViaWS {

	static InventoryService serv;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 serv= (new InventoryServiceService()).getInventoryServicePort();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetItems() {
	
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
		Item item = null;
		try {
			item=serv.itemById(13403);
			Assert.assertNotNull(item);
			Assert.assertTrue(13403== item.getItemId());
			Assert.assertEquals("Computing Scale", item.getName());
		} catch(DALException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testCreateDeleteItem(){
		Item item = new Item();
		item.setName("A test item");
		item.setDescription("item description");
		item.setPrice(new Double(1000));
		item.setImg("image url");
		
		try {
			Item itemOut=serv.newItem(item);
			Assert.assertNotNull(itemOut);
			Assert.assertTrue(itemOut.getItemId()>0);
			Assert.assertNotNull(itemOut.getName());
			Assert.assertEquals("A test item", itemOut.getName());
			String r=serv.deleteItem(itemOut.getItemId());
			Assert.assertNotNull(r);
			Assert.assertEquals("Success",r);
		} catch (DALException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testUpdateQuantity(){
		Item item;
		try {
			item=serv.itemById(13403);
			long currentQuantity=item.getQuantity();
			System.out.println(currentQuantity);
			item.setQuantity(item.getQuantity()+1);
			serv.updateItem(item);
			Item itemOut=serv.itemById(13403);
			System.out.println(itemOut.getQuantity());
			Assert.assertTrue(itemOut.getQuantity()==currentQuantity +1);
		} catch (DALException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
