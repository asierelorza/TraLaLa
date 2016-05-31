package gateway;

import serviciosExternos.IBanco;

public class GatewayBanco extends Gateway implements IGatewayBanco {
	
	public IBanco banco;
	
	private static GatewayBanco instance;
	
	public static GatewayBanco getInstance() {
		if (instance == null) {
			instance = new GatewayBanco();
		}
		
		return instance;
	}

	@Override
	public String efectuarPago(String numTarjeta, int importe) {
		
		String mensaje = banco.efectuarPago(Integer.parseInt(numTarjeta), importe);
		
		return mensaje;
	}

}
