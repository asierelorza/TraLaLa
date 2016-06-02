package data;

import javax.jdo.annotations.PersistenceCapable;

import strategy.PagoStrategy;
import visitor.Visitor;

@PersistenceCapable
//@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class PagoVentajoso extends Pago{

	public PagoVentajoso(PagoStrategy pstrat) {
		super(pstrat);
		
	}

	@Override
	public void setMes(int mes) {
		this.mes=mes;
		
	}

	@Override
	public PagoStrategy getPagoStrategy() {
		return this.pstrat;
	}

	@Override
	public double aceptar(Visitor visitante) {
		
		return visitante.visit(this);
	}
	
	
}
