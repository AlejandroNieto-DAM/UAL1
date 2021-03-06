package org.mp.sesion02;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado extends Persona{

	protected String despacho;
	protected int salario;
	protected GregorianCalendar fechaContratacion;
	
	/**
	 * Constructor por parametros de la clase Empleado
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 * @param correoElectronico
	 * @param despacho es el despacho del profesor
	 * @param salario es el salario que cobra el profesor
	 * @param fechaContratacion es la fecha en la que contrataron al profesor
	 */
	public Empleado (String nombre, String direccion, String telefono, String correoElectronico, String despacho, int salario, GregorianCalendar fechaContratacion) {
		super(nombre, direccion, telefono, correoElectronico);
		this.despacho = despacho;
		this.salario = salario;
		this.fechaContratacion = fechaContratacion;
	}
	
	
	/**
	 * Retorna el despacho del empleado como un string
	 * @return el despacho del empleado
	 */
	public String getDespacho() {
		return despacho;
	}


	/**
	 * Retorna el salario del empleado como un string
	 * @return el salario del empleado
	 */
	public int getSalario() {
		return salario;
	}


	/**
	 * Retorna la fecha de contratacion a partir de un objeto GregorianCalendar
	 * del cual nos debemos traer el dia mes y anio para forma la fecha correctamente
	 * creando una nueva instancia del mismo y haciendo un setTime de nuestro atributo fechaContratacion
	 * finalizando haremos un string haciendo un get de los datos que queremos.
	 * @return la fecha de contratacion del empleado como un String
	 */
	public String getFechaContratacion() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(this.fechaContratacion.getTime());
		String date = calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1)  + "/" + calendar.get(Calendar.YEAR);
		return date;
	}

	
	/**
	 * Sobreescritura del metodo toString para retornar todos los atributos del objeto.
	 * @return una cadena con todos los atributos. 
	 */
	@Override
	public String toString() {
		String cadena = super.toString() + "\n"
				+ "Despacho = " + this.getDespacho() + ", salario = " + this.getSalario() + ", Fecha de contratación = " + this.getFechaContratacion();
 		return cadena;
	}
}
