package org.mp.sesion02;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado extends Persona{

	protected String despacho;
	protected int salario;
	protected GregorianCalendar fechaContratacion;
	
	public Empleado (String nombre, String direccion, String telefono, String correoElectronico, String despacho, int salario, GregorianCalendar fechaContratacion) {
		super(nombre, direccion, telefono, correoElectronico);
		this.despacho = despacho;
		this.salario = salario;
		this.fechaContratacion = fechaContratacion;
	}
	
	

	public String getDespacho() {
		return despacho;
	}



	public int getSalario() {
		return salario;
	}



	public String getFechaContratacion() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(this.fechaContratacion.getTime());
		String date = calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1)  + "/" + calendar.get(Calendar.YEAR);
		return date;
	}

	
	@Override
	public String toString() {
		String cadena = super.toString() + "\n"
				+ "Despacho = " + this.getDespacho() + ", salario = " + this.getSalario() + ", Fecha de contratación = " + this.getFechaContratacion();
 		return cadena;
	}
}
