package main;

import java.util.List;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;





public class Main {

	public static void main(String[] args) {
		
		Usuario uno = new Usuario("Asier", "AxiElorza", "1234", 943781219, false);
		Usuario dos = new Usuario("Iker", "IkerCalzada", "5678", 943008503, true);
		Usuario tres = new Usuario ("Mikel", "MikelLarrea", "91011", 943556699, false);
		
		// Load Persistence Manager Factory - referencing the Persistence Unit defined in persistence.xml
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		// Persistence Manager
		PersistenceManager pm = null;
		//Transaction to group DB operations
		Transaction tx = null;		
		
		try {
			System.out.println("- Store objects in the DB");			
			//Get the Persistence Manager
			pm = pmf.getPersistenceManager();
			//Obtain the current transaction
			tx = pm.currentTransaction();		
			//Start the transaction
			tx.begin();
			
			pm.makePersistent(uno);
			pm.makePersistent(dos);		
			pm.makePersistent(tres);	
			
			//End the transaction
			tx.commit();			

		} catch (Exception ex) {
			System.err.println(" $ Error storing objects in the DB: " + ex.getMessage());
			ex.printStackTrace();
		} finally {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			
			if (pm != null && !pm.isClosed()) {
				pm.close();
				// ATTENTION -  Datanucleus detects that the objects in memory were changed and they are flushed to DB
			}
		}
		
//		try {
//			System.out.println("Obtener todos los usuarios ...");			
//			//Get the Persistence Manager
//			pm = pmf.getPersistenceManager();
//			//Obtain the current transaction
//			tx = pm.currentTransaction();		
//			//Start the transaction
//			tx.begin();
//		
//			Extent<Usuario> extent = pm.getExtent(Usuario.class, true);
//			
//			for (Usuario usuario : extent) {
//				System.out.println("  -> " + usuario);
//			}
//			// Notice the change in the accounts' balances
//			//End the transaction
//			tx.commit();
//		} catch (Exception ex) {
//			System.err.println(" $ Error retrieving accounts using an 'Extent': " + ex.getMessage());
//		} finally {
//			if (tx != null && tx.isActive()) {
//				tx.rollback();
//			}
//			
//			if (pm != null && !pm.isClosed()) {
//				pm.close();
//			}
//		}
//
//		try {
//			System.out.println("Modificar valor usuario 1 ...");			
//			//Get the Persistence Manager
//			pm = pmf.getPersistenceManager();
//			//Obtain the current transaction
//			tx = pm.currentTransaction();		
//			//Start the transaction
//			tx.begin();
//
//			Query query = pm.newQuery(Usuario.class);
//			query.setFilter("this.nombreUsu == 'Asier'");
//			
//			@SuppressWarnings("unchecked")
//			List<Usuario> usuarios = (List<Usuario>) query.execute();
//
//			for (Usuario i : usuarios) {
//				i.setNombreUsu("Javier");
//				pm.makePersistent(i);
//				
//			}
//			
//			//End the transaction
//			tx.commit();
//		} catch (Exception ex) {
//			System.err.println(" $ Error retrieving accounts using a 'Query': " + ex.getMessage());
//		} finally {
//			if (tx != null && tx.isActive()) {
//				tx.rollback();
//			}
//			
//			if (pm != null && !pm.isClosed()) {
//				pm.close();
//			}
//		}
//
//		try {
//			System.out.println("Borrar Usuario 2 ...");			
//			//Get the Persistence Manager
//			pm = pmf.getPersistenceManager();
//			//Obtain the current transaction
//			tx = pm.currentTransaction();		
//			//Start the transaction
//			tx.begin();
//
//			Query query = pm.newQuery(Usuario.class);
//			
//			query.setFilter("this.nombreUsu == 'iker'");
//			Long number = (Long)query.deletePersistentAll();
//			
//			
//			
//			//End the transaction
//			tx.commit();
//		} catch (Exception ex) {
//			System.err.println(" $ Error deleting Usuario 2: " + ex.getMessage());
//		} finally {
//			if (tx != null && tx.isActive()) {
//				tx.rollback();
//			}
//			
//			if (pm != null && !pm.isClosed()) {
//				pm.close();
//			}
//		}
//
//		try {
//			System.out.println("- Cleaning the DB...");			
//			//Get the Persistence Manager
//			pm = pmf.getPersistenceManager();
//			//Obtain the current transaction
//			tx = pm.currentTransaction();
//			//Start the transaction
//			tx.begin();
//			
//			//Delete users from DB
//			// As we are considering accounts as dependents on user - CASCADING BEHAVIOUR - ACCOUNTS DELETED
//			Query query1 = pm.newQuery(Usuario.class);
//			System.out.println(" * '" + query1.deletePersistentAll() + "' users and their accounts deleted from the DB.");
//			//Delete addresses from DB
//			
//			
//			//End the transaction
//			tx.commit();
//		} catch (Exception ex) {
//			System.err.println(" $ Error cleaning the DB: " + ex.getMessage());
//			ex.printStackTrace();
//		} 
//		finally {
//			if (tx != null && tx.isActive()) {
//				tx.rollback();
//			}
//			
//			if (pm != null && !pm.isClosed()) {
//				pm.close();
//			}
//		}
		

		System.out.println("End of the Datanucleus + JDO example");
		System.out.println("====================================");
		
	}

	

}
