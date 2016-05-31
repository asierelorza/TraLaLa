package strategy;

import data.Usuario;

public interface PagoStrategy {
	public int importePago(Usuario usuario);
	int mes = 1;
	int porcentaje = 4;
}
