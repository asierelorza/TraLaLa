package gateway;

import serviciosExternos.IBanco;

public class GatewayBanco implements IGateway {
	
	private IBanco banco;
	
	private String mensaje;
	
	
	private static GatewayBanco instance;
	
	public static GatewayBanco getInstance() {
		if (instance == null) {
			instance = new GatewayBanco();
		}
		
		return instance;
	}

	@Override
	public String efectuarPago(String numTarjeta, int importe) {
		
		this.mensaje = banco.efectuarPago(Integer.parseInt(numTarjeta), importe);
		
		return this.mensaje;
	}

}
