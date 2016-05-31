package factory;

import gateway.Gateway;
import gateway.GatewayBanco;
import gateway.GatewayPayPal;

public class FactoryGateways {
	
private static FactoryGateways instance;
	
	public static FactoryGateways getInstance() {
		if (instance == null) {
			instance = new FactoryGateways();
		}
		
		return instance;
	}
	
	public Gateway crearGateway(String tipo){
		if(tipo.equals("PayPal")){ // Se le pasara por el CheckBox del GUI
			
			return new GatewayPayPal();
		}
		else{
			return new GatewayBanco();
		}
	}

}
