package main;

import java.util.ArrayList;

public class Usuario {
	
	private String nombreUsu; // Clave primaria
	private String usuario_paypal;
	private String contrasenya_paypal;
	private int numTarjCred;
	private ArrayList<Cancion> listaReproduccion = new ArrayList<Cancion>();
	private ArrayList<Reproduccion> historialRep = new ArrayList<Reproduccion>();
	private ArrayList<Usuario> listaAmigos = new ArrayList<Usuario>();
	
	public Usuario(String nombreUsu, String usuario_paypal, String contrasenya_paypal, int numTarjCred){
		this.nombreUsu = nombreUsu;
		this.usuario_paypal = usuario_paypal;
		this.contrasenya_paypal = contrasenya_paypal;
		this.numTarjCred = numTarjCred;
	}

	public String getNombreUsu() {
		return nombreUsu;
	}

	public void setNombreUsu(String nombreUsu) {
		this.nombreUsu = nombreUsu;
	}

	public String getUsuario_paypal() {
		return usuario_paypal;
	}

	public void setUsuario_paypal(String usuario_paypal) {
		this.usuario_paypal = usuario_paypal;
	}

	public String getContrasenya_paypal() {
		return contrasenya_paypal;
	}

	public void setContrasenya_paypal(String contrasenya_paypal) {
		this.contrasenya_paypal = contrasenya_paypal;
	}

	public int getNumTarjCred() {
		return numTarjCred;
	}

	public void setNumTarjCred(int numTarjCred) {
		this.numTarjCred = numTarjCred;
	}
	
	public int calculoNumAmigos(){
		return this.listaAmigos.size();
	}

	public ArrayList<Cancion> getListaReproduccion() {
		return listaReproduccion;
	}

	public void setListaReproduccion(ArrayList<Cancion> listaReproduccion) {
		this.listaReproduccion = listaReproduccion;
	}

	public ArrayList<Reproduccion> getHistorialRep() {
		return historialRep;
	}

	public void setHistorialRep(ArrayList<Reproduccion> historialRep) {
		this.historialRep = historialRep;
	}

	public ArrayList<Usuario> getListaAmigos() {
		return listaAmigos;
	}

	public void setListaAmigos(ArrayList<Usuario> listaAmigos) {
		this.listaAmigos = listaAmigos;
	}
	
	public void añadirCancionALista(Cancion cancion){
		this.listaReproduccion.add(cancion);
	}
	

}
