package remote;

import data.Pago;
import data.Usuario;
import factory.FactoryGateways;
import factory.FactoryPagos;
import gateway.Gateway;

public class PagoService {
	
		
	private static PagoService instance;
	
	public static PagoService getInstance() {
		if (instance == null) {
			instance = new PagoService();
		}
		
		return instance;
	}
	
	public int importePago(Usuario usuario){
		Pago pago = FactoryPagos.getInstance().crearPago(usuario.getVentajoso());
		pago.getPagoStrategy().importePago(usuario);
		return pago.getPago();
		
	}
	
	public String efectuarPago(String numTarj, int importe, String tipo){
		Gateway gteway = FactoryGateways.getInstance().crearGateway(tipo);
		gteway.efectuarPago(numTarj, importe);
		return gteway.getMensaje();
		
	}


}
