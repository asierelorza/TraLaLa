package data;

import java.util.ArrayList;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;

import strategy.PagoStrategy;

@PersistenceCapable
//@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class PagoVentajoso extends Pago{

	public PagoVentajoso(PagoStrategy pstrat) {
		super(pstrat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setMes(int mes) {
		this.mes=mes;
		
	}

	@Override
	public PagoStrategy getPagoStrategy() {
		return this.pstrat;
	}
	
	
}
