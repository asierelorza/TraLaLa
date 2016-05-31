package dao;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import data.Cancion;
import data.Usuario;

public class DB_DAO {
	
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
	PersistenceManager pm = null;
	Transaction tx = null;
	
	private static DB_DAO instance;
		
	public static DB_DAO getInstance() {
		if (instance == null) {
			instance = new DB_DAO();
		}		
		
		return instance;
	}
	
	
	public boolean registrarUsuario(String nombreUsu, String usuPayPal, String contraPayPal, int numTarjCred, boolean ventajoso){	
						
		try {
			System.out.println("- Store objects in the DB");			
			//Get the Persistence Manager
			pm = pmf.getPersistenceManager();
			//Obtain the current transaction
			tx = pm.currentTransaction();		
			//Start the transaction
			tx.begin();
			
			Usuario usuario = new Usuario(nombreUsu, usuPayPal, contraPayPal, numTarjCred, ventajoso);
		
			pm.makePersistent(usuario);
			
			
			
			//End the transaction
			tx.commit();
			
			return true;

		} catch (Exception ex) {
			System.err.println(" $ Error storing objects in the DB: " + ex.getMessage());
			ex.printStackTrace();
			
			return false;
			
		} finally {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			
			if (pm != null && !pm.isClosed()) {
				pm.close();
				// ATTENTION -  Datanucleus detects that the objects in memory were changed and they are flushed to DB
			}
		}
	}

	
	public void modificarUsuario(Usuario usuario) {
		
		try {
			System.out.println("Modificar valor usuario 1 ...");			
			//Get the Persistence Manager
			pm = pmf.getPersistenceManager();
			//Obtain the current transaction
			tx = pm.currentTransaction();		
			//Start the transaction
			tx.begin();
			
			Usuario bat = pm.getObjectById(Usuario.class, usuario.getNombreUsu());
			bat = new Usuario(usuario);


			//End the transaction
			tx.commit();
			
		} catch (Exception ex) {
			System.err.println(" $ Error retrieving accounts using a 'Query': " + ex.getMessage());
		} finally {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			
			if (pm != null && !pm.isClosed()) {
				pm.close();
			}
		}
		
		
	}
	
	public boolean reproducirCancion(Cancion cancion){
		
		try{
			
			pm = pmf.getPersistenceManager();
			//Obtain the current transaction
			tx = pm.currentTransaction();		
			//Start the transaction
			tx.begin();

			Cancion kantu = pm.getObjectById(Cancion.class, cancion.getId_cancion());

			tx.commit();

			if(kantu.equals(null)){
				return false;
			}
			else{
				return true;
			}
			
		}
		catch (Exception ex){
			System.err.println(" $ Error retrieving accounts using a 'Query': " + ex.getMessage());
			return false;
		} finally {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			
			if (pm != null && !pm.isClosed()) {
				pm.close();
			}
		}		
	}
}
