package org.mp.sesion02;

public class Persona {

	protected String nombre;
	protected String direccion;
	protected String telefono;
	protected String correoElectronico;
	
	public Persona (String nombre, String direccion, String telefono, String correoElectronico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	@Override 
	public String toString() {
		String cadena = "Nombre = " + this.getNombre() + ", Dirección = " + this.getDireccion() + ", Teléfono = " + this.getTelefono() + ", email = " + this.getCorreoElectronico();
		return cadena;
	}
	
}
