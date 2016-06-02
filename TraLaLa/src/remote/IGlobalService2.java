package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

import data.Cancion;

public interface IGlobalService2 extends Remote{
	
	public boolean login(String nombreUsu, String usuPayPal, String contraPayPal, int numTarjCred, boolean ventajoso) throws RemoteException;
	public boolean reproducirCancion(Cancion cancion) throws RemoteException;

}
