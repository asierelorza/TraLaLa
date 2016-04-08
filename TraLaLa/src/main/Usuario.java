package main;

import java.util.ArrayList;

import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Usuario {
	
	@PrimaryKey
	private String nombreUsu; // Clave primaria
	
	private String usuario_paypal;
	private String contrasenya_paypal;
	private int numTarjCred;
	private boolean ventajoso; //Para saber si para un usuario en concreto el método de pago es uno u otro. 
	private int importeMensual; //Puede que para todos los usuarios el importe mensual no sea el mismo.
	
	@Join
	@Persistent(mappedBy="Usuario", dependentElement="true")
	private ArrayList<Cancion> listaReproduccion = new ArrayList<Cancion>(); // Lista de reproduccion de canciones de cada usuario. Solo puede tener una lista de rep.
	
	@Join
	@Persistent(mappedBy="Usuario", dependentElement="true")
	private ArrayList<Reproduccion> historialRep = new ArrayList<Reproduccion>(); // Historial de reproduccion de cada usuario
	
	@Join
	@Persistent(mappedBy="Usuario", dependentElement="true")
	private ArrayList<Usuario> listaAmigos = new ArrayList<Usuario>(); // Lista de amigos de cada usuario
	
	@Join
	@Persistent(mappedBy="Usuario", dependentElement="true")
	private ArrayList <Pago> listaPagos;
	
	public Usuario(String nombreUsu, String usuario_paypal, String contrasenya_paypal, int numTarjCred, boolean ventajoso){
		this.nombreUsu = nombreUsu;
		this.usuario_paypal = usuario_paypal;
		this.contrasenya_paypal = contrasenya_paypal;
		this.numTarjCred = numTarjCred;
		this.ventajoso=ventajoso;
		if(ventajoso == true){
			listaPagos = new ArrayList<PagoVentajoso>();
		}
		else{
			listaPagos = new ArrayList<PagoConvencional>();
		}
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
	
	public boolean getVentajoso(){
		return ventajoso;
	}
	
	public void setVentajoso(boolean ventajoso){
		this.ventajoso=ventajoso;
	}
	
	public int importeMensual(){
		return importeMensual;
	}
	
	public void setimporteMensual(int importeMensual){
		this.importeMensual= importeMensual;
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
	
	public ArrayList<?> getListaPagos() {
		return listaPagos;
	}

	public void setListaPagos(ArrayList<?> listaPagos) {
		this.listaPagos = listaPagos;
	}
	
	public void anyadirCancionALista(Cancion cancion){
		this.listaReproduccion.add(cancion);
	}
	
	public void anyadirAmigo(Usuario usuario){
		this.listaAmigos.add(usuario);
	}
	
	public void anyadirRepAUsuario(Reproduccion rep){
		this.historialRep.add(rep);
	}
	

}
