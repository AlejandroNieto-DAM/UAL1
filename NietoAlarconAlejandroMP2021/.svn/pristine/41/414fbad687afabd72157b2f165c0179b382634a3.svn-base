package org.mp.sesion02;

import java.util.GregorianCalendar;

public class Administrativo extends Empleado {

	protected String unidadDestino;
	
	public Administrativo(String nombre, String direccion, String telefono, String correoElectronico, String despacho,
			int salario, GregorianCalendar fechaContratacion, String unidadDestino) {
		super(nombre, direccion, telefono, correoElectronico, despacho, salario, fechaContratacion);
		this.unidadDestino = unidadDestino;
	}
	
	public String getUnidadDestino() {
		return unidadDestino;
	}

	@Override
	public String toString() {
		String cadena = "Administrativo\n" 
				+ super.toString() + "\n"
				+ "Destinado en la unidad " + this.getUnidadDestino();
		return cadena;
	}
	
}
