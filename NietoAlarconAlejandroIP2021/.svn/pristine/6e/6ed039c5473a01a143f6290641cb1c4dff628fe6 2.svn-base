package org.ip.sesion07;

public class Multimedia {

	private String titulo;
	private String autor;
	
	
	private Formato formato;
	
	private double duracion;

	public Multimedia(String titulo, String autor, Formato formato, double duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}
	
	public Multimedia(Multimedia objeto) {
		this.titulo = objeto.titulo;
		this.autor = objeto.autor;
		this.formato = objeto.formato;
		this.duracion = objeto.duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	@Override
	public String toString() {
		String salida = "Objeto Multimedia [titulo: " + this.titulo + ",  de: " + this.autor + ", con formato: " 
				+ this.formato + ", duracion: " + this.duracion + "]";
		return salida;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean iguales = false;

		if(obj instanceof Multimedia) {
			Multimedia mult = (Multimedia) obj;
			
			if(mult.getTitulo() == this.getTitulo() && mult.getAutor() == this.getAutor()) {
				iguales = true;
			}
		}
		
		return iguales;
	}
	
	
}
