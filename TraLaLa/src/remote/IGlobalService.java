package remote;

import java.rmi.Remote;

public interface IGlobalService extends Remote {
	
	public IUsuarioService getUsuarioService();
	public ICancionService getCancionService();
	public IReproduccionService getReproduccionService();
	public IPagoService getPagoService();

}
