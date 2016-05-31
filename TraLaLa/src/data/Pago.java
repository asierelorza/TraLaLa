package data;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.persistence.InheritanceType;

import strategy.PagoStrategy;

@PersistenceCapable
//@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public abstract class Pago {

	protected int pago; // El numero de pago, clave primaria
	protected int importeMensual;
	protected int porcentaje;
	int mes;
	protected Usuario usuario;
	
	protected PagoStrategy pstrat;
	
	public Pago(PagoStrategy pstrat){
		this.pstrat = pstrat;
	}

	
	 public abstract void setMes(int mes);
	 public abstract PagoStrategy getPagoStrategy();
	 
	 public int getPago(){
		 return this.pago;
	 }
}
