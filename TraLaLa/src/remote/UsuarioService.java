package remote;

import dao.DB_DAO;
import data.Usuario;

public class UsuarioService {
	
	
	private static UsuarioService instance;
	
	public static UsuarioService getInstance() {
		if (instance == null) {
			instance = new UsuarioService();
		}
		
		return instance;
	}

	
	public boolean registrarUsuario(String nombre_usu, String usuario_paypal, String contra_paypal, int numTarjCred, boolean ventajoso) {
		
		Usuario nuevoUsu = new Usuario(nombre_usu, usuario_paypal, contra_paypal, numTarjCred, ventajoso);
		
		return DB_DAO.getInstance().registrarUsuario(nuevoUsu);
		
		
	}

}
