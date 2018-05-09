package org.servicios.practica;

import java.io.Serializable;

public class DTOArticulos implements Serializable{
	
	
	private String Nombre;
	private String boton;
	private int id;
	private float precio;
	
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getBoton() {
		return boton;
	}
	public void setBoton(String boton) {
		this.boton = boton;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public DTOArticulos(String nombre, int id, float precio, String boton) {
		super();
		this.Nombre = nombre;
		this.id = id;
		this.precio = precio;
		this.boton = boton;
	}
	
	public DTOArticulos() {
		super();
	}
	
	
}
