package remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import data.Cancion;
import data.Usuario;
import dto.UsuarioFavDTO;

public class GlobalService extends UnicastRemoteObject implements IGlobalService2 {
	
	private static final long serialVersionUID = 1L;
	
	private static GlobalService instance;

	
	public String name;
	
	protected GlobalService() throws RemoteException {
		super();
		
	}
	
	public static GlobalService getInstance() {
		if (instance == null) {
			try {
				instance = new GlobalService();
			} catch (Exception ex) {
				System.err.println("# Error creating GlobalService: " + ex);
			}
		}
		
		return instance;
	}

	@Override
	public boolean login(String nombreUsu, String usuPayPal, String contraPayPal, int numTarjCred, boolean ventajoso) {
		
		return UsuarioService.getInstance().registrarUsuario(nombreUsu, usuPayPal, contraPayPal, numTarjCred, ventajoso);
		
		
	}

	@Override
	public boolean reproducirCancion(Cancion cancion) {
		
		return ReproduccionService.getInstance().reproducirCancion(cancion);
	}
	
	public UsuarioFavDTO getUsuarioDTO(Usuario usuario){
		return UsuarioService.getInstance().getUsuarioFav(usuario);
	}
	
	

}
