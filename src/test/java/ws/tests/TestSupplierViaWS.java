package ws.tests;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import inventory.ws.DALException;
import inventory.ws.DALService;
import inventory.ws.DALServiceService;
import inventory.ws.Item;
import inventory.ws.Supplier;
/**
 * Test the CRUD operations on Supplier via the DAL SOAP interface
 * @author Jerome Boyer
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSupplierViaWS {

	static DALService serv;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 serv= (new DALServiceService()).getDALServicePort();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	private static long supplierId=0;
	

	@Test
	public void testAddNewSupplier() {
		System.out.println("Add new supplier via DAL WS");
		Supplier s1= new Supplier();
		s1.setName("SupplierTestA");
		s1.setStatus("NEW");
		s1.setType("ORGANIZATION");
		s1.setZipcode("95000");
		try {
			Supplier sOut=serv.newSupplier(s1);
			Assert.assertNotNull(sOut);
			supplierId=sOut.getId().getValue();
		} catch (DALException e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
	@Test
	public void testGetOneSupplier(){
		System.out.print("Get newly created supplier via DAL WS "+supplierId);;
		try {
			Supplier sOut=serv.supplierById(supplierId);
			Assert.assertNotNull(sOut);
			Assert.assertEquals("SupplierTestA", sOut.getName());
		} catch(DALException e) {
			e.printStackTrace();
			Assert.fail();
		}
		System.out.println(" --> success");
	}

	@Test
	public void testGetSuppliers(){
		System.out.print("Add another supplier, get all, delete all");
		Supplier s1= new Supplier();
		s1.setName("SupplierTestB");
		s1.setStatus("NEW");
		s1.setType("ORGANIZATION");
		s1.setZipcode("95000");
		
		List<Supplier> suppliers;
		try {
			Supplier sOut=serv.newSupplier(s1);
			System.out.print("... get all, delete all");
			suppliers = serv.suppliers();
			Assert.assertTrue(suppliers.size()>=2);
			for (Supplier s : suppliers){
				   System.out.println(s.getName());	
			}
			System.out.print("... delete all the created test suppliers");
			serv.deleteSupplier(sOut.getId().getValue());
			serv.deleteSupplier(supplierId);
		} catch (DALException e) {
			e.printStackTrace();
			Assert.fail();
		}
		System.out.println(" --> success");
	}
	
}
