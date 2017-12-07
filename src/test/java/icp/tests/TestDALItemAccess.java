package icp.tests;

import java.net.URL;
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
public class TestDALItemAccess {

	static DALService serv;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		URL dalOnICPUrl = new URL("http://dal.brown.case/inventory/ws?wsdl");;
		 serv= (new DALServiceService(dalOnICPUrl)).getDALServicePort();
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

	
}
