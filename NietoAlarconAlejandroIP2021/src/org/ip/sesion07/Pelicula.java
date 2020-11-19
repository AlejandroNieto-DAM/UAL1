package org.ip.sesion07;

public class Pelicula extends Multimedia{

	private String actorPrincipal;
	private String actrizPrincipal;
	
	public Pelicula(String titulo, String autor, Formato formato, double duracion, String actor, String actriz) {
		super(titulo, autor, formato, duracion);
		this.actorPrincipal = actor;
		this.actrizPrincipal = actriz;
	}
	
	public Pelicula(Pelicula pelicula) {
		super(pelicula);
		this.actorPrincipal = pelicula.actorPrincipal;
		this.actrizPrincipal = pelicula.actrizPrincipal;
	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}

	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}
	
	@Override
	public String toString() {
		String salida = super.toString();
		salida += "\n Pelicula {protagonizada por: {" + this.getActorPrincipal() + " y " + this.getActrizPrincipal() + "}";
		return salida;
	}
	
	@Override 
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}
