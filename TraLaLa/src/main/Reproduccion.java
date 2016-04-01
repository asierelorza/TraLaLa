package main;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Reproduccion { // Una reproduccion se creara en el main, y luego se guardara como historial tanto en cancion como en usuario
	// Cual es la clave primaria?
	private int fecha_rep;
	private int hora_rep;
	private Usuario usuario;
	private Cancion cancion;
	private int precio;
	
	public Reproduccion(int fecha_rep, int hora_rep, Usuario usuario, Cancion cancion){
		this.fecha_rep = fecha_rep;
		this.hora_rep = hora_rep;
		this.usuario = usuario;
		this.cancion = cancion;
	
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cancion getCancion() {
		return cancion;
	}

	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}

	public int getFecha_rep() {
		return fecha_rep;
	}

	public void setFecha_rep(int fecha_rep) {
		this.fecha_rep = fecha_rep;
	}

	public int getHora_rep() {
		return hora_rep;
	}

	public void setHora_rep(int hora_rep) {
		this.hora_rep = hora_rep;
	}
	


}
