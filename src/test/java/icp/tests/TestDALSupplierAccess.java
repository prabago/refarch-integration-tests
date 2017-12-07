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
import inventory.ws.Item;
import inventory.ws.Supplier;
/**
 * Test the CRUD operations on Item via the DAL SOAP interface
 * @author Jerome Boyer
 *
 */
public class TestDALSupplierAccess {

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
	public void testGetSuppliers() {
		System.out.println("Get all supplier via DAL WS");
		List<Supplier> suppliers;
		try {
			suppliers = serv.suppliers();
			Assert.assertTrue(suppliers.size()>1);
			for (Supplier s : suppliers){
				   System.out.println(s.getName());	
			}
		} catch (DALException e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@Test
	public void testGetItem(){
		System.out.print("Get supplier id 1 via DAL WS ");
		Supplier s = null;
		try {
			s=serv.supplierById(1);
			Assert.assertNotNull(s);
			Assert.assertTrue(1 == s.getId().getValue());
			Assert.assertEquals("IBM", s.getName());
		} catch(DALException e) {
			e.printStackTrace();
			Assert.fail();
		}
		System.out.println(" --> success");
	}

	
}
