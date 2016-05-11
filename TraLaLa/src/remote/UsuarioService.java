package remote;

import dao.IDB_DAO;

public class UsuarioService implements IUsuarioService {
	
	public IDB_DAO db_dao;

	@Override
	public String registrarUsuario(String nombre_usu, String usuario_paypal, String contra_paypal, int numTarjCred,
			boolean ventajoso, int importeMensual) {
		
		
		return null;
	}

}
