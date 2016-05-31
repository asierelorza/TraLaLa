package remote;

import java.rmi.Remote;

import data.Cancion;

public interface IGlobalService extends Remote {
	
	public boolean login(String nombreUsu, String usuPayPal, String contraPayPal, int numTarjCred, boolean ventajoso);
	public boolean reproducirCancion(Cancion cancion);
	
}
