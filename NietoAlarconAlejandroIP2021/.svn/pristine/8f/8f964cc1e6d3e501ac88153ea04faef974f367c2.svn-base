package org.ip.sesion06;

public class Fraccion {

	private int numerador;
	private int denominador;
	private static int numFracciones;
	
	public Fraccion() {
		this.numerador = 0;
		this.denominador = 1;
		Fraccion.numFracciones += 1;
	}
	
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
		Fraccion.numFracciones += 1;
	}
	
	public Fraccion(Fraccion fraccion) {
		this.numerador = fraccion.numerador;
		this.denominador = fraccion.denominador;
		Fraccion.numFracciones += 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean iguales = false;

		if(obj instanceof Fraccion) {
			Fraccion fraccion = (Fraccion) obj;
			
			if(this.numerador == fraccion.numerador  && this.denominador == fraccion.denominador) {
				iguales = true;
			}
		}
		
		return iguales;
	}
	
	public int getNumerador() {
		return this.numerador;
	}
	
	public int getDenominador() {
		return this.denominador;
	}
	
	public static int getNumFracciones() {
		return Fraccion.numFracciones;
	}
	
	public String toString() {
		return this.numerador + "/" + this.denominador;
	}
	
	public Fraccion sumar(Fraccion fraccion) {
		int numerador1 = fraccion.denominador * this.numerador;
		int numerador2 = fraccion.numerador * this.denominador;
		int denominador = this.denominador * fraccion.denominador;
		
		Fraccion auxiliar = new Fraccion();
		auxiliar.numerador = numerador1 + numerador2;
		auxiliar.denominador = denominador;
		return auxiliar;
	}
	
	public static Fraccion sumar(Fraccion fraccion1, Fraccion fraccion2) {
		int numerador1 = fraccion1.denominador * fraccion2.numerador;
		int numerador2 = fraccion1.numerador * fraccion2.denominador;
		int denominador = fraccion1.denominador * fraccion2.denominador;
		
		Fraccion auxiliar = new Fraccion();
		auxiliar.numerador = numerador1 + numerador2;
		auxiliar.denominador = denominador;
		return auxiliar;
		
	}
	
	public Fraccion restar(Fraccion fraccion) {
		int numerador1 = fraccion.denominador * this.numerador;
		int numerador2 = fraccion.numerador * this.denominador;
		int denominador = this.denominador * fraccion.denominador;
		
		Fraccion auxiliar = new Fraccion();
		auxiliar.numerador = numerador1 - numerador2;
		auxiliar.denominador = denominador;
		return auxiliar;
	}
	
	public Fraccion multiplicar(Fraccion fraccion) {
		Fraccion auxiliar = new Fraccion();
		auxiliar.numerador = this.numerador * fraccion.numerador;
		auxiliar.denominador = fraccion.denominador * this.denominador;
		return auxiliar;
	}
	
	public Fraccion dividir(Fraccion fraccion) {
		Fraccion auxiliar = new Fraccion();
		auxiliar.numerador = this.numerador * fraccion.denominador;
		auxiliar.denominador = fraccion.numerador * this.denominador;
		return auxiliar;
	}
	
	private int mcd(int u, int v) {
		int dividendo = Math.abs(u);
		int divisor = Math.abs(v);
		
		if (v > u){
			int auxiliar  = u;
			u = v;
			v = auxiliar;
		}
		
		while(dividendo % divisor != 0) {
			int auxiliar = divisor;
			divisor = dividendo % divisor;
			dividendo = auxiliar;
		}
		
		return divisor;
	}
	
	public Fraccion simplificar() {
		
		int mcd = this.mcd(this.numerador, this.denominador);
		this.numerador /= mcd;
		this.denominador /= mcd;
	
		return this;
	}
	
}
