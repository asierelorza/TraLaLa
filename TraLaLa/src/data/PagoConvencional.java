package data;

import java.util.ArrayList;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;

import strategy.PagoStrategy;
import visitor.Visitor;

@PersistenceCapable
//@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class PagoConvencional extends Pago {
	//Habrá que ver como se pone el formato de fecha para hacer que dicha igualdad funcione. 

	public PagoConvencional(PagoStrategy pstrat) {
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
