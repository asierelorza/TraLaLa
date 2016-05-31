package data;

import java.sql.Date;
import java.sql.Time;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Reproduccion { // Una reproduccion se creara en el main, y luego se guardara como historial tanto en cancion como en usuario

	@PrimaryKey
	private Date fecha_rep;
	@PrimaryKey
	private Time hora_rep;
	@PrimaryKey
	private Cancion cancion;
	
	private int precio;//Mirarlo mejor. Si tenerlo en canción o en Reproducción. Pendiente... 
	
	public Reproduccion(Date fecha_rep, Time hora_rep, Cancion cancion){
		this.fecha_rep = fecha_rep;
		this.hora_rep = hora_rep;
		this.cancion = cancion;
	
	}

	public Cancion getCancion() {
		return cancion;
	}

	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}

	public Date getFecha_rep() {
		return fecha_rep;
	}

	public void setFecha_rep(Date fecha_rep) {
		this.fecha_rep = fecha_rep;
	}

	public Time getHora_rep() {
		return hora_rep;
	}

	public void setHora_rep(Time hora_rep) {
		this.hora_rep = hora_rep;
	}
	


}
