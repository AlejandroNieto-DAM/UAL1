package org.ip.sesion06;

public class EcuacionCuadratica {

	private double a;
	private double b;
	private double c;
	
	static private int numEcuacionesCuadraticas = 0;
	
	public EcuacionCuadratica(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public EcuacionCuadratica(EcuacionCuadratica ecuacion) {
		this.a = ecuacion.a;
		this.b = ecuacion.b;
		this.c = ecuacion.c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public static int getNumEcuacionesCuadraticas() {
		return numEcuacionesCuadraticas;
	}

	@Override
	public String toString() {
		return "Ecuacion Cuadratica; (a=" + this.a + ", b=" + this.b + ", c=" + this.c + ")";
	}
	
	public double getDiscriminante() {
		double discriminante = Math.pow(this.b, 2) - 4 * this.a * this.c;
		return discriminante;
	}
	
	public double getRaiz1(){
		double a = this.a;
		double b = this.b;
		double c = this.c;
		
		double raiz = 0;
		double solucion1 = 0;
		
		double monstruo = this.getDiscriminante();
		
		raiz = Math.sqrt(monstruo);
		
		solucion1 = (-(b) + raiz) / (2 * a);
		
		return solucion1;
	}
	
	public double getRaiz2(){
		double a = this.a;
		double b = this.b;
		double c = this.c;
		
		double raiz = 0;
		double solucion2 = 0;
		
		double monstruo = this.getDiscriminante();
		
		raiz = Math.sqrt(monstruo);
		solucion2 = (-(b) - raiz) / (2 * a);
	
		return solucion2;
	
	}
	
}
