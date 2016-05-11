package data;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;
import javax.persistence.InheritanceType;

@PersistenceCapable
//@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public abstract class Pago {

	protected int pago; // El numero de pago, clave primaria
	protected int importeMensual;
	protected int porcentaje;
	int mes;
	protected Usuario usuario;

	 abstract int importePago(Usuario usuario);
	 abstract void setMes(int mes);
}
