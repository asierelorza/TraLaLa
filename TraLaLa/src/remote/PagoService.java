package remote;

import dao.IDB_DAO;

public class PagoService {
	
	public IDB_DAO db_dao;
	
	public static PagoService instance;
	
	public static PagoService getInstance() {
		if (instance == null) {
			instance = new PagoService();
		}
		
		return instance;
	}


}
