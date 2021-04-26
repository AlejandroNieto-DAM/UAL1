package org.lya.sesion08;

public class Potencia {
	private int base;
	private int exponente;
	
	public Potencia() {
		base = 1;
		exponente = 0;
	}
	
	public Potencia(int a,  int n) {
		this.base = a;
		this.exponente = n;
	}
	
	public double exponenFuerzaBruta() {
		
		double result = 1;
		
		for(int i = 0; i < this.exponente; i++) {
			result *= this.base;
		}
		
		return result;
	}
	
	public double exponenRecursivoDyV() {
		if (this.exponente == 0) {
			return 1;
		}
		
		return exponenRecursivoDyV(this.base, this.exponente);
	}
	
	private double exponenRecursivoDyV(int a, int n) {
		
		if(n == 1) return a;
		else if(n % 2 == 0) {
			return Math.pow(exponenRecursivoDyV(a, n/2), 2);
		} else {
			return a * exponenRecursivoDyV(a, n - 1);
		}
		
	}

	public void setExponente(int expon) {
		this.exponente = expon;
	}
	
	public int getExponente() {
		return this.exponente;
	}
}
