package remote;

import java.rmi.Remote;

import data.Cancion;

public interface ICancionService extends Remote {
	
	public Cancion getCancion(int id_cancion);

}
