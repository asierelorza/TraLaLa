package main;

import java.util.ArrayList;

public class PagoVentajoso extends Pago{

	@Override
	int importePagoConvencional(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int importePagoVentajoso(Usuario usuario) {
		// TODO Auto-generated method stub

		int local;		
		ArrayList<Reproduccion> listaReproduccion = usuario.getHistorialRep();
		ArrayList<Cancion> listaCancion = usuario.getListaReproduccion();
		int id_cancion;
		
		for(int i = 0; i<listaReproduccion.size();i++){
			if(listaReproduccion.get(i).getFecha_rep()== mes){
				id_cancion = listaReproduccion.get(i).getId_cancion();
				for(int j = 0; j<listaCancion.size();j++){
					if(id_cancion==listaCancion.get(j).getId_cancion()){
						pago= pago+listaCancion.get(j).getPrecio();
						break;
					}
				}
			}
		}
		
		local = pago;
		pago = importeMensual + (local*(porcentaje/100));
		
		
		return pago;
	}

	@Override
	void setMes(int mes) {
		this.mes=mes;
		
	}
	
	
}
