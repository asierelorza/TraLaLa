package gateway;

import serviciosExternos.IPayPal;

public class GatewayPayPal implements IGatewayPayPal {
	
	public IPayPal paypal;

	@Override
	public String efectuarPago(String usuarioPayPal, int importe) {
		
		String mensaje = paypal.efectuarPago(usuarioPayPal, importe);
		
		return mensaje;
	}

}
