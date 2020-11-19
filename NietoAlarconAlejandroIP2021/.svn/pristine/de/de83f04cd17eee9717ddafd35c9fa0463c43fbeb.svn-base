package org.ip.sesion07;


public class Disco extends Multimedia {

	private Genero genero;
	
	private int numeroCanciones;
	
	public Disco(String titulo, String autor, Formato formato, double duracion, Genero genero, int numeroCanciones) {
		super(titulo, autor, formato, duracion);
		this.genero = genero;
		this.numeroCanciones = numeroCanciones;
	}
	
	
	public Disco(Disco objeto) {
		super(objeto);
		this.genero = objeto.genero;
		this.numeroCanciones = objeto.numeroCanciones;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public int getNumeroCanciones() {
		return numeroCanciones;
	}


	public void setNumeroCanciones(int numeroCanciones) {
		this.numeroCanciones = numeroCanciones;
	}

	@Override
	public String toString() {
		String salida = super.toString();
		salida += "\n Disco {genero: " + this.getGenero() + " y numero de canciones: " + this.getNumeroCanciones() + "}";
		return salida;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
