package remote;


public class PagoService {
	
		
	public static PagoService instance;
	
	public static PagoService getInstance() {
		if (instance == null) {
			instance = new PagoService();
		}
		
		return instance;
	}


}
