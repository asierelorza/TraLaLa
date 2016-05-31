package gateway;

import serviciosExternos.IPayPal;

public class GatewayPayPal extends Gateway implements IGatewayPayPal {
	
	public IPayPal paypal;
	
	private static GatewayPayPal instance;
	
	public static GatewayPayPal getInstance() {
		if (instance == null) {
			instance = new GatewayPayPal();
		}
		
		return instance;
	}

	@Override
	public String efectuarPago(String usuarioPayPal, int importe) {
		
		String mensaje = paypal.efectuarPago(usuarioPayPal, importe);
		
		return mensaje;
	}

}
