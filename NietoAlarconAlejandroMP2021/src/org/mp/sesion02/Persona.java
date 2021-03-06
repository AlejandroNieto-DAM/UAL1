package org.mp.sesion02;

public class Persona {

	protected String nombre;
	protected String direccion;
	protected String telefono;
	protected String correoElectronico;
	
	/**
	 * Constructor por paramatros de la clase Persona
	 * @param nombre que es el nombre que le pondremos a la persona
	 * @param direccion que es la direccion donde vive la persona
	 * @param telefono es el telefono que pertenece a la persona
	 * @param correoElectronico perteneciente a la persona
	 */
	public Persona (String nombre, String direccion, String telefono, String correoElectronico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}
	
	/**
	 * Retorna el nombre de la persona como un string
	 * @return el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Retorna la direccion de la persona como un string
	 * @return la direccion de la persona
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Retorna el telefono de la persona como un string
	 * @return el telefono de la persona
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Retorna el correo de la persona como un string
	 * @return el correo de la persona
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * Sobreescritura del metodo toString para retornar todos los atributos del objeto.
	 * @return una cadena con todos los atributos. 
	 */
	@Override 
	public String toString() {
		String cadena = "Nombre = " + this.getNombre() + ", Dirección = " + this.getDireccion() + ", Teléfono = " + this.getTelefono() + ", email = " + this.getCorreoElectronico();
		return cadena;
	}
	
}
