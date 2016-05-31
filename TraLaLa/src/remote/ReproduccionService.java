package remote;

import dao.IDB_DAO;

public class ReproduccionService {
	
	public IDB_DAO db_dao;
	
	private static ReproduccionService instance;
	
	public static ReproduccionService getInstance() {
		if (instance == null) {
			instance = new ReproduccionService();
		}
		
		return instance;
	}


}
