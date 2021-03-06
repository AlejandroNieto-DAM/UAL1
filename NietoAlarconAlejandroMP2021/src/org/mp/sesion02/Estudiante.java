package org.mp.sesion02;

public class Estudiante extends Persona{

	protected String grado;
	
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
	

	public String getGrado() {
		return grado;
	}


	@Override
	public String toString() {
		String cadena = "Estudiante de " + this.getGrado() + "\n" + super.toString();
		return cadena;
	}
	
	
}
