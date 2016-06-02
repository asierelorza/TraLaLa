package visitor;

import data.Pago;
import data.PagoConvencional;
import data.PagoVentajoso;
import factory.FactoryPagos;

public class Descuento implements Visitor {

	private final double sinDescuento = 0.85;
	private final double conDescuento = 0.54;
	
	
	
	@Override
	public double visit(PagoVentajoso pagoV) {

		return  pagoV.getUsuario().getImporteMensual() + pagoV.getPagoStrategy().importePago(pagoV.getUsuario()) * conDescuento;
	}

	@Override
	public double visit(PagoConvencional pagoC) {
		
		Pago pago = FactoryPagos.getInstance().crearPago(pagoC.getUsuario().getVentajoso());
		int pasta = pago.getPagoStrategy().importePago(pagoC.getUsuario());
		return pagoC.getUsuario().getImporteMensual() + pagoC.getPagoStrategy().importePago(pagoC.getUsuario()) * sinDescuento;
	}

}
