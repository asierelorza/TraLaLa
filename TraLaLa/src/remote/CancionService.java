package remote;

import data.Cancion;

public class CancionService {
	
	
	private static CancionService instance;
	
	Cancion cancion; 
	
	public static CancionService getInstance() {
		if (instance == null) {
			instance = new CancionService();
		}
		
		return instance;
	}


	
	public Cancion getCancion(int id_cancion) {		
		
		return null;
	}

}
