package org.mp.sesion02;

public class Estudiante extends Persona{

	protected String grado;
	
	/**
	 * Constructor por parametros d e la clase Estudiante
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 * @param correoElectronico
	 * @param grado es el grado de estudios del estudiante.
	 */
	public Estudiante (String nombre, String direccion, String telefono, String correoElectronico, int grado) {
		super(nombre, direccion, telefono, correoElectronico);
		
		if(grado == 1) {
			this.grado = "Grado";
		} else if (grado == 2) {
			this.grado = "Máster";
		} else if (grado == 3) {
			this.grado = "Doctorado";
		}
		
	}
	
	/**
	 * Retorna el grado de estudios del estudiante como un string
	 * @return la grado de estudios del estudiante
	 */
	public String getGrado() {
		return grado;
	}


	/**
	 * Sobreescritura del metodo toString para retornar todos los atributos del objeto.
	 * @return una cadena con todos los atributos. 
	 */
	@Override
	public String toString() {
		String cadena = "Estudiante de " + this.getGrado() + "\n" + super.toString();
		return cadena;
	}
	
	
}
