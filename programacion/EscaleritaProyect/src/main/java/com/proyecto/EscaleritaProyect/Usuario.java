package com.proyecto.EscaleritaProyect;

public class Usuario {
	private String nombre;
	private String apellido;
	private String userName;
	private String contrasena;
	
	public Usuario(String nombre, String apellido, String userName, String contrasena) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.userName = userName;
		this.contrasena = contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getUserName() {
		return userName;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	
	
	
	
	
}
