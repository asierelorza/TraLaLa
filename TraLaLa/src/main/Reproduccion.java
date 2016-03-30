package main;

public class Reproduccion { // Una reproduccion se creara en el main, y luego se guardara como historial tanto en cancion como en usuario
	
	private int fecha_rep;
	private int hora_rep;
	private int id_cancion;
	private String nombreUsu;
	private int precio;
	
	public Reproduccion(int fecha_rep, int hora_rep, int id_cancion, String nombreUsu){
		this.fecha_rep = fecha_rep;
		this.hora_rep = hora_rep;
		this.id_cancion = id_cancion;
		this.nombreUsu = nombreUsu;
		
	}

	public int getId_cancion() {
		return id_cancion;
	}

	public void setId_cancion(int id_cancion) {
		this.id_cancion = id_cancion;
	}

	public String getNombreUsu() {
		return nombreUsu;
	}

	public void setNombreUsu(String nombreUsu) {
		this.nombreUsu = nombreUsu;
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
