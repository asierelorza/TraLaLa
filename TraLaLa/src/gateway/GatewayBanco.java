package gateway;

import serviciosExternos.IBanco;

public class GatewayBanco implements IGatewayBanco {
	
	public IBanco banco;

	@Override
	public String efectuarPago(int numTarjeta, int importe) {
		
		String mensaje = banco.efectuarPago(numTarjeta, importe);
		
		return mensaje;
	}

}
