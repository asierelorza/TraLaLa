package factory;

import data.Pago;
import data.PagoConvencional;
import data.PagoVentajoso;
import strategy.PagoConvencionalStrategy;
import strategy.PagoVentajosoStrategy;

public class FactoryPagos {
	
private static FactoryPagos instance;
	
	public static FactoryPagos getInstance() {
		if (instance == null) {
			instance = new FactoryPagos();
		}
		
		return instance;
	}
	
	public Pago crearPago(boolean ventajoso){
		if(ventajoso){
			
			return new PagoVentajoso(new PagoVentajosoStrategy());
		}
		else{
			return new PagoConvencional(new PagoConvencionalStrategy());
		}
	}

}
