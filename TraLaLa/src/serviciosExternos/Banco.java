package serviciosExternos;

public class Banco implements IBanco {

	@Override
	public String efectuarPago(int numTarjeta, int importe) {
		
		return "Pago efectuado de numero de tarjeta " + numTarjeta + " e importe " + importe;
	}

}
