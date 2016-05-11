package data;

import java.util.ArrayList;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
//@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class PagoConvencional extends Pago {
	//Habrá que ver como se pone el formato de fecha para hacer que dicha igualdad funcione. 

	@Override
	int importePago(Usuario usuario) {
		// TODO Auto-generated method stub
		ArrayList<Reproduccion> listaReproduccion = usuario.getHistorialRep();
		ArrayList<Cancion> listaCancion = usuario.getListaReproduccion();
		int id_cancion;
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

	
	@Override
	void setMes(int mes) {
		this.mes=mes;
		
	}

}
