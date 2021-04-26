package org.mp.sesion02;

public class Octogono extends ObjetoGeometrico implements Comparable<Object>, Cloneable, DeColor {
	
	protected double lado;

	public Octogono() {
		super();
		this.lado = 0;
	}
	
	public Octogono(String color, boolean relleno, double lado) {
		super(color, relleno);
		this.lado = lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	@Override
	public double getPerimetro() {
		return 8 * this.getLado();
	}

	@Override
	public double getArea() {
		double result = (2 + (4 / Math.sqrt(2))) * this.getLado() * this.getLado();
		return result;
	}

	@Override
	public int compareTo(Object arg0) {
		Octogono otro = (Octogono) arg0;
		
		if (this.getLado() > otro.getLado())
			return 1;
		else if (this.getLado() < otro.getLado())
			return -1;
		else
			return 0;
		
	}

	@Override
	public String comoColorear() {
		String cadena = "Colorear los 8 lados de " + this.getColor();
		return cadena;
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
