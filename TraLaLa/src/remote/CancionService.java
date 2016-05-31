package remote;

import dao.IDB_DAO;
import data.Cancion;

public class CancionService {
	
	public IDB_DAO db_dao;
	
	private static CancionService instance;
	
	Cancion cancion; // En funcion de lo que se obtiene de la BD (DAO)
	
	public static CancionService getInstance() {
		if (instance == null) {
			instance = new CancionService();
		}
		
		return instance;
	}


	
	public Cancion getCancion(int id_cancion) {
	
		// Se tendra que hacer la conexion con el DAO para obtener la cancion y devolver
		
		// 2 opciones: la de hacer new aqui (parametros null) y que se pase al DAO para rellenar los parametros
		// Crear el new alli con los parametros y luego devolverlo
		
		return null;
	}

}
