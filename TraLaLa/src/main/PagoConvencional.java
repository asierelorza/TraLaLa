package main;

import java.util.ArrayList;

public class PagoConvencional extends Pago {
	//Habr� que ver como se pone el formato de fecha para hacer que dicha igualdad funcione. 

	@Override
	int importePagoConvencional(Usuario usuario) {
		// TODO Auto-generated method stub
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
		return pago;
	}

	@Override
	int importePagoVentajoso(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void setMes(int mes) {
		this.mes=mes;
		
	}

}
