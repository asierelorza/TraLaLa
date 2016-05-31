package gateway;

public abstract class Gateway {
	
	protected String mensaje;
	
	public abstract String efectuarPago(String numTarjeta, int importe);
	
	public String getMensaje(){
		return mensaje;
	}

}
