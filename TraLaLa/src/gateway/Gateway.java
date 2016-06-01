package gateway;

public abstract class Gateway implements IGateway {
	
	protected String mensaje;
	
	@Override
	public abstract String efectuarPago(String numTarjeta, int importe);
	
	@Override
	public String getMensaje(){
		return mensaje;
	}

}
