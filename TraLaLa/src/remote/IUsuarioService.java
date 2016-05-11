package remote;

public interface IUsuarioService {
	
	public String registrarUsuario(String nombre_usu, String usuario_paypal, String contra_paypal, int numTarjCred, boolean ventajoso, int importeMensual);

}
