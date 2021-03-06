package org.ip.sesion07;

public class Complejo {

	private double real;
	private double imaginaria;
	
	public Complejo(double real, double imaginaria) {
		this.real = real;
		this.imaginaria = imaginaria;
	}
	
	public Complejo(double real) {
		this.real = real;
		this.imaginaria = 0;
	}
	
	public Complejo(Complejo complejo) {
		this.real = complejo.real;
		this.imaginaria = complejo.imaginaria;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginaria() {
		return imaginaria;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}
	
	@Override
	public String toString() {
		String salida = "";
		
		if(this.imaginaria == 0) {
			salida = String.valueOf(this.real);
		} else if(this.real == 0) {
			salida = String.valueOf(this.imaginaria);
		} else if(this.imaginaria < 0) {
			salida = String.valueOf(this.real) + " - " + String.valueOf(Math.abs(this.imaginaria)) + "i";
		} else {
			salida = String.valueOf(this.real) + " + " + String.valueOf(this.imaginaria) + "i";
		}
		
		return salida;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;

		if(obj instanceof Complejo) {
			Complejo complejo = (Complejo) obj;
			
			if(complejo.real == this.real && complejo.imaginaria == this.imaginaria) {
				iguales = true;
			}
		}
		
		return iguales;
	}
	
	public Complejo sumar(Complejo comp) {
		Complejo out = new Complejo(this.real + comp.real, this.imaginaria + comp.imaginaria);
		return out;
	}
	
	public Complejo restar(Complejo comp) {
		Complejo out = new Complejo(this.real - comp.real, this.imaginaria - comp.imaginaria);
		return out;	
	}
	
	public Complejo multiplicar(Complejo comp) {
		Double pReal = this.real * comp.real - this.imaginaria * comp.imaginaria;
		Double pImg = this.imaginaria * comp.real + this.real * comp.imaginaria;
		
		Complejo out = new Complejo(pReal, pImg);
		
		return out;
	}
	
	public Complejo productoPorEscalar(double valorEscalar) {
		Complejo out = new Complejo(this.real * valorEscalar, this.imaginaria * valorEscalar);
		return out;	
	}
	
	public Complejo dividir(Complejo comp) {
		Double pReal = ((this.real * comp.real + this.imaginaria * comp.imaginaria) / (Math.pow(comp.real, 2) + Math.pow(comp.imaginaria, 2)));
		Double pImg = ((this.imaginaria * comp.real - this.real * comp.imaginaria) / (Math.pow(comp.real, 2) + Math.pow(comp.imaginaria, 2)));
		
		Complejo out = new Complejo(pReal, pImg);
		
		return out;
	}
	
	public Complejo modulo() {
		double mod = Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginaria, 2));
		
		Complejo out = new Complejo(mod);
		
		return out;
	}
	
	public double argumento() {
		return Math.atan(this.imaginaria/this.real);
	}
	
	public Complejo conjugado() {
		Complejo out = new Complejo(this.real, this.imaginaria * -1);
		return out;
	}
}
