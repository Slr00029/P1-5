package org.servicios.practica;

import java.io.Serializable;

public class DTOUsuarios implements Serializable{

	private String user;
	private String pass;
	private String dni;
	private String email;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public DTOUsuarios(String user, String pass, String dni, String email) {
		super();
		this.user = user;
		this.pass = pass;
		this.dni = dni;
		this.email = email;
	}
	public DTOUsuarios() {
		super();
	}
	
	
	
}
