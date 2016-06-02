package data;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.persistence.InheritanceType;

import strategy.PagoStrategy;
import visitor.Visitable;

@PersistenceCapable
//@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public abstract class Pago implements Visitable {

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


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	 
	 
}
