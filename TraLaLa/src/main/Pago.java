package main;

public abstract class Pago {

	protected int pago;
	protected int importeMensual;
	protected int porcentaje;
	int mes;

	 abstract int importePagoConvencional(Usuario usuario);
	 abstract int importePagoVentajoso (Usuario usuario);
	 abstract void setMes(int mes);
}
