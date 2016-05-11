package remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GlobalService extends UnicastRemoteObject implements IGlobalService {
	
	private static final long serialVersionUID = 1L;
	public IUsuarioService usuario;
	public ICancionService cancion;
	public IPagoService pago;
	public IReproduccionService reproduccion;
	
	protected GlobalService() throws RemoteException {
		super();
		
	}
	
	@Override
	public IUsuarioService getUsuarioService() {
		
		return this.usuario;
	}
	@Override
	public ICancionService getCancionService() {
		
		return this.cancion;
	}
	@Override
	public IReproduccionService getReproduccionService() {
		
		return this.reproduccion;
	}
	@Override
	public IPagoService getPagoService() {
		
		return this.pago;
	}

}
