package dto;

import java.io.Serializable;
import java.util.ArrayList;

import data.Cancion;

public class UsuarioFavDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombreUsu;
	private ArrayList<Cancion> listaFav = new ArrayList<Cancion>();
	
	public UsuarioFavDTO(String nombreUsu, ArrayList<Cancion> listaFav){
		this.nombreUsu = nombreUsu;
		this.listaFav = listaFav;
	}
	
	
	public String getNombreUsu() {
		return nombreUsu;
	}
	public void setNombreUsu(String nombreUsu) {
		this.nombreUsu = nombreUsu;
	}
	public ArrayList<Cancion> getListaFav() {
		return listaFav;
	}
	public void setListaFav(ArrayList<Cancion> listaFav) {
		this.listaFav = listaFav;
	}
	

}
