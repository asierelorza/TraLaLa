package remote;


public class ReproduccionService {
	
	
	private static ReproduccionService instance;
	
	public static ReproduccionService getInstance() {
		if (instance == null) {
			instance = new ReproduccionService();
		}
		
		return instance;
	}


}
