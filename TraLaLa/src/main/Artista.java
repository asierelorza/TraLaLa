package main;

import java.util.ArrayList;

public class Artista {
	
	private int id_artista; // Clave primaria
	private String nomArtista;
	private ArrayList<Cancion> listaCanciones = new ArrayList<Cancion>();
	
	public Artista(int id_artista, String nomArtista){
		this.id_artista = id_artista;
		this.nomArtista = nomArtista;
	}

	public int getId_artista() {
		return id_artista;
	}

	public void setId_artista(int id_artista) {
		this.id_artista = id_artista;
	}

	public String getNomArtista() {
		return nomArtista;
	}

	public void setNomArtista(String nomArtista) {
		this.nomArtista = nomArtista;
	}

	public ArrayList<Cancion> getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

}