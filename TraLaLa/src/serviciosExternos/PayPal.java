package serviciosExternos;

public class PayPal implements IPayPal {

	@Override
	public String efectuarPago(String usuarioPayPal, int importe) {
		
		return "Pago efectuado del usuario " + usuarioPayPal + " e importe " + importe;
	}

}
