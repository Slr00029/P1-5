package org.servicios.practica;

import java.util.List;


public interface DAOUsuariosInterfaz {

	public List<DTOUsuarios> LeeUsuarios();
	
	public void insertaUsuario(DTOUsuarios user);
	
	public boolean existUser(String user, String pass, String dni);
	
	public DTOUsuarios buscarUsuario(String user, String pass);
	
	public DTOUsuarios buscarAdmin(String user, String pass);
	
	public DTOUsuarios buscarUsuario(String dni);
	
	public void ModificaUsuarios(DTOUsuarios usuario, String dni);
}
