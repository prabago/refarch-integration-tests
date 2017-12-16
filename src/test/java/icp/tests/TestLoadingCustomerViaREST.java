package icp.tests;

import static org.junit.Assert.fail;

import java.lang.reflect.Type;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import inventory.test.CustomerRestClient;
import po.model.Account;
import po.model.Customer;

/*
 * You need to get the microservice deployed
 */
public class TestLoadingCustomerViaREST {

	protected static CustomerRestClient client;
	protected static Gson parser = new GsonBuilder()
			   .setDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz").create();;
			   
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
	 client = new CustomerRestClient();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	public static Customer buildCustomer(){
		Customer c = new Customer();
		c.setFirstName("Paul");
		c.setLastName("LeBoulanger");
		c.setAge(40);
		c.setCarOwner(false);
		c.setChildren(2);
		c.setEmailAddress("bp@supersite.com");
		c.setCreationDate(new Date());
		c.setEstimatedIncome(90000);
		c.setGender("M");
		c.setType("PERSON");
		Account a = new Account();
		a.setAccountNumber("acct001");
		a.setDropped(0);
		a.setInternational(10);
		a.setLocal(200);
		a.setLongDistance(30);
		a.setPaymentMethod("CC");
		a.setRatePlan("A");
		c.setAccount(a);
		return c;
	}
	
	//@Test 
	public void tesAddCustomer(){
		 Customer c = buildCustomer();
		 String s= parser.toJson(c);
		 System.out.println(s);
        try {
			client.executePostMethodAsJson("api/customers", s);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Exception in test");
		}
	}
	
	@Test
	public void testGetCustomers() {
		try {
			String rep=client.executeGetMethod("api/customers", null);
			JsonDeserializer<Date> deser = new JsonDeserializer<Date>() {
				  @Override
				  public Date deserialize(JsonElement json, Type typeOfT,
				       JsonDeserializationContext context) throws JsonParseException {
				    return json == null ? null : new Date(json.getAsLong());
				  }
				};
			Gson parser = new GsonBuilder().registerTypeAdapter(Date.class, deser).create();
			Customer[] l = parser.fromJson(rep, Customer[].class);
			for (Customer c: l){
				System.out.println(c.getName()+" "+c.getCreationDate().toString());
			}
		} catch (Exception e) {

			e.printStackTrace();
			fail("Exception in test");
		}
	}

}
