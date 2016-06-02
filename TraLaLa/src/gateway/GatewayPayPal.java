package gateway;

import serviciosExternos.IPayPal;

public class GatewayPayPal implements IGateway {
	
	private IPayPal paypal;
	private String mensaje;
	
	private static GatewayPayPal instance;
	
	public static GatewayPayPal getInstance() {
		if (instance == null) {
			instance = new GatewayPayPal();
		}
		
		return instance;
	}

	@Override
	public String efectuarPago(String usuarioPayPal, int importe) {
		
		this.mensaje = paypal.efectuarPago(usuarioPayPal, importe);
		
		return this.mensaje;
	}

}
