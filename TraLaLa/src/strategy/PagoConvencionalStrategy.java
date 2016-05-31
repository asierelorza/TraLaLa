package strategy;

import java.util.ArrayList;

import data.Cancion;
import data.Reproduccion;
import data.Usuario;

public class PagoConvencionalStrategy implements PagoStrategy {

	@Override
	public int importePago(Usuario usuario) {
		ArrayList<Reproduccion> listaReproduccion = usuario.getHistorialRep();
		ArrayList<Cancion> listaCancion = usuario.getListaReproduccion();
		int id_cancion;
		int pago = 0;
		for(int i = 0; i<listaReproduccion.size();i++){
			if(listaReproduccion.get(i).getFecha_rep().getMonth()== mes){
				id_cancion = listaReproduccion.get(i).getCancion().getId_cancion();
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

}
