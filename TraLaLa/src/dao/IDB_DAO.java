package dao;

import data.Usuario;

public interface IDB_DAO {
	
	public void registrarUsuario(Usuario usuario);
	public void modificarUsuario(Usuario usuario); // Pasar todo el usuario, recuperar el objeto de la BD y actualizar todos los campos (menos clave primaria)

}
