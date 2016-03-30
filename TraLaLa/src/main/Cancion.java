package main;

import java.util.ArrayList;

public class Cancion {
	
	private String titulo;
	private int id_cancion; // Clave primaria
	private String album;
	private ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>(); // Guardara cuantas veces aparece cada cancion en una lista de reproduccion de cada usuario
	private ArrayList<Reproduccion> listaReproduccion = new ArrayList<Reproduccion>(); // Guardara las reproducciones que se han dado de cada cancion
	
	public Cancion(String titulo, int id_cancion, String album){
		this.titulo = titulo;
		this.id_cancion = id_cancion;
		this.album = album;
	}
	
	public ArrayList<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public ArrayList<Reproduccion> getListaReproduccion() {
		return listaReproduccion;
	}

	public void setListaReproduccion(ArrayList<Reproduccion> listaReproduccion) {
		this.listaReproduccion = listaReproduccion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId_cancion() {
		return id_cancion;
	}

	public void setId_cancion(int id_cancion) {
		this.id_cancion = id_cancion;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
	public int getReproduccionesCancion(){
		return this.listaReproduccion.size();
	}
	
	public void anyadirRepACancion(Reproduccion rep){
		this.listaReproduccion.add(rep);
	}

}
