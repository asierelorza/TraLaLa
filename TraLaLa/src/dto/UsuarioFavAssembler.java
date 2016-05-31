package dto;

import java.util.ArrayList;

import data.Cancion;
import data.Reproduccion;
import data.Usuario;

public class UsuarioFavAssembler {
	
	private static UsuarioFavAssembler instance;
	
	public UsuarioFavAssembler(){
		
	}
	
	public static UsuarioFavAssembler getInstance() {
		if (instance == null) {
			instance = new UsuarioFavAssembler();
		}

		return instance;
	}
	
	public UsuarioFavDTO generarDTO(Usuario usuario){
		
		String nombre = usuario.getNombreUsu();
		ArrayList<Cancion> listaFav = new ArrayList<Cancion>();
		ArrayList<Reproduccion> histoRep = usuario.getHistorialRep();
		
		int aCont [] = new int[histoRep.size()];
		
		for(int i = 0; i < histoRep.size(); i++){
			aCont[i] = 0;
		}
		
		// for del algoritmo
		for(int i = 0; i < histoRep.size(); i++){
			for(int j = 0; j < histoRep.size(); i++){
				if(i != j || aCont[i] != -1){
					if(histoRep.get(i).getCancion().getId_cancion() == histoRep.get(j).getCancion().getId_cancion()){
						aCont[i]++;
						aCont[j] = -1;
					}
				}
			}
		}
		
		for(int i = 0; i < aCont.length; i++){ // Tenemos la lista de las canciones que se han reproducido mas de una vez
			if(aCont[i] > 0){
				listaFav.add(histoRep.get(i).getCancion());
			}
		}
		
		return new UsuarioFavDTO(nombre, listaFav);
		
	}

}
