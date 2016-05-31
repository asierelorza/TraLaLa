package remote;

import dao.DB_DAO;
import data.Cancion;

public class ReproduccionService {
	
	
	private static ReproduccionService instance;
	
	public static ReproduccionService getInstance() {
		if (instance == null) {
			instance = new ReproduccionService();
		}
		
		return instance;
	}
	
	public boolean reproducirCancion(Cancion cancion){
		
		return DB_DAO.getInstance().reproducirCancion(cancion);		
	}


}
