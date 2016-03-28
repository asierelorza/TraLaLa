package main;

public class Reproduccion {
	
	private int fecha_rep;
	private int hora_rep;
	
	public Reproduccion(int fecha_rep, int hora_rep){
		this.fecha_rep = fecha_rep;
		this.hora_rep = hora_rep;
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
