package factory;

import gateway.GatewayBanco;
import gateway.GatewayPayPal;
import gateway.IGateway;

public class FactoryGateways {
	
private static FactoryGateways instance;
	
	public static FactoryGateways getInstance() {
		if (instance == null) {
			instance = new FactoryGateways();
		}
		
		return instance;
	}
	
	public IGateway crearGateway(String tipo){
		if(tipo.equals("PayPal")){ // Se le pasara por el CheckBox del GUI
			
			return new GatewayPayPal();
		}
		else{
			return new GatewayBanco();
		}
	}

}
