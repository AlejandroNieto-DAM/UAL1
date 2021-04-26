package org.mp.sesion02;

import java.util.GregorianCalendar;

public class Profesor extends Empleado{

	protected String horario;
	protected String categoria;

	public Profesor(String nombre, String direccion, String telefono, String correoElectronico, String despacho, int salario,
			GregorianCalendar fechaContratacion, String horario, int categoria) {
		super(nombre, direccion, telefono, correoElectronico, despacho, salario, fechaContratacion);
		this.horario = horario;
		
		if(categoria == 1) {
			this.categoria = "Ayudante";
		} else if(categoria == 2) {
			this.categoria = "Titular de Universidad";
		} else if(categoria == 3) {
			this.categoria = "Catedrático de Universidad";
		}
		
	}
	
	
	
	public String getHorario() {
		return horario;
	}



	public String getCategoria() {
		return categoria;
	}



	@Override
	public String toString() {
		String cadena = "Profesor " + this.getCategoria() + "\n" 
				+ super.toString() + "\n"
				+ "Horario = " + this.getHorario();
		return cadena;
	}

}
