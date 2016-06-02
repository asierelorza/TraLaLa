package visitor;

import data.PagoConvencional;
import data.PagoVentajoso;

public interface Visitor {

	public double visit(PagoVentajoso pagoV);
	public double visit(PagoConvencional pagoC);
}
