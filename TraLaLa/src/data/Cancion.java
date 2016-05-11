package data;

import java.util.ArrayList;

import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Cancion {
	
	@PrimaryKey
	private int id_cancion; // Clave primaria
	
	private String titulo;
	private String album;
	private int precio; // Precio que se debe pagar por canción, necesario para el desarrollo de los algoritmos de pago.
	
	@Join
//	@Persistent(mappedBy="cancion", dependentElement="true")
	private ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>(); // Guardara cuantas veces aparece cada cancion en una lista de reproduccion de cada usuario
	
	@Join
//	@Persistent(mappedBy="cancion", dependentElement="true")
	private ArrayList<Reproduccion> listaReproduccion = new ArrayList<Reproduccion>(); // Guardara las reproducciones que se han dado de cada cancion
	
	private Artista artista;
	private Usuario usuario;
	public Cancion(String titulo, int id_cancion, String album, int precio, Artista artista){
		this.titulo = titulo;
		this.id_cancion = id_cancion;
		this.album = album;
		this.precio= precio;
		this.artista = artista;
	}
	
	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
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
	
	public int getPrecio(){
		return precio;
	}
	
	public void setPrecio(int precio){
		this.precio=precio;
	}
	
	public int getReproduccionesCancion(){
		return this.listaReproduccion.size();
	}
	
	public void anyadirRepACancion(Reproduccion rep){
		this.listaReproduccion.add(rep);
	}

}
