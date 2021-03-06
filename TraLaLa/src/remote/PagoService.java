package remote;

import data.Pago;
import data.Usuario;
import factory.FactoryGateways;
import factory.FactoryPagos;
import gateway.IGateway;
import visitor.Descuento;

public class PagoService {
	
		
	private static PagoService instance;
	
	private IGateway igteway;
	
	public static PagoService getInstance() {
		if (instance == null) {
			instance = new PagoService();
		}
		
		return instance;
	}
	
	public int importePago(Usuario usuario){
		Pago pago = FactoryPagos.getInstance().crearPago(usuario.getVentajoso());
		pago.getPagoStrategy().importePago(usuario);
		Descuento des = new Descuento();
		pago.aceptar(des);
		return pago.getPago();
		
	}
	
	public String efectuarPago(String numTarj, int importe, String tipo){
		this.igteway = FactoryGateways.getInstance().crearGateway(tipo);
		return this.igteway.efectuarPago(numTarj, importe);
		
	}


}
