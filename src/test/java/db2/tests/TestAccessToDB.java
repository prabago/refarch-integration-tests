package db2.tests;

import static org.junit.Assert.fail;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import inventory.model.ItemEntity;
import inventory.test.InventoryPersistenceManager;

public class TestAccessToDB {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testListItems() {
		EntityManager em = InventoryPersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
		List<ItemEntity> results = new ArrayList<ItemEntity>();
		try{ 
			Query query =em.createNamedQuery("Item.findAll");
			results = query.getResultList ();
			Assert.assertTrue(results.size() > 10);
			for (ItemEntity ie : results){
				System.out.println(ie.getId()+" "+ie.getName());
			}
		} catch (Exception w){
			fail("Exception reported " + w.getMessage());
			
		}   finally {
			em.close();
		}	
	}
	
	@Test
	public void testModifyUpdateDate(){
		EntityManager em = InventoryPersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
		 
		List<ItemEntity> results = new ArrayList<ItemEntity>();
		try{ 
			em.getTransaction().begin();
			Query query =em.createNamedQuery("Item.findAll");
			results = query.getResultList ();
			for (ItemEntity ie : results){
				ie.setUpdateDate(new Timestamp((new Date()).getTime()));
				em.merge(ie);
			}
			 em.getTransaction().commit();
		} catch (Exception w){
			fail("Exception reported " + w.getMessage());
			
		}   finally {
			em.close();
		}	
	}

}
