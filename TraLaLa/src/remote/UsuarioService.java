package remote;

import dao.DB_DAO;
import data.Usuario;
import dto.UsuarioFavAssembler;
import dto.UsuarioFavDTO;

public class UsuarioService {
	
	
	private static UsuarioService instance;
	
	public static UsuarioService getInstance() {
		if (instance == null) {
			instance = new UsuarioService();
		}
		
		return instance;
	}

	
	public boolean registrarUsuario(String nombre_usu, String usuario_paypal, String contra_paypal, int numTarjCred, boolean ventajoso) {
		
		
		return DB_DAO.getInstance().registrarUsuario(nombre_usu, usuario_paypal, contra_paypal, numTarjCred, ventajoso);
		
		
	}
	
	public UsuarioFavDTO getUsuarioFav(Usuario usuario){
		return UsuarioFavAssembler.getInstance().generarDTO(usuario);
	}

}
