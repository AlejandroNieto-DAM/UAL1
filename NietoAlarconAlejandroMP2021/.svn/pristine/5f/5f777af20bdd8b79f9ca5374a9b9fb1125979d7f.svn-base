package org.mp.sesion05;

public class Carta implements Comparable<Object> {

	private String palo;
	private int numero;
	private int valor;

	public Carta(String palo, int i) {
		this.palo = palo;
		this.numero = i;

		int firstValue = 0;

		if (palo.equals("C")) {
			firstValue = 12;
		} else if (palo.equals("E")) {
			firstValue = 24;
		} else if (palo.equals("B")) {
			firstValue = 36;
		}

		this.valor = firstValue + this.numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	@Override
	public int compareTo(Object arg0) {
		Carta otro = (Carta) arg0;

		if (this.getValor() > otro.getValor())
			return 1;
		else if (this.getValor() < otro.getValor())
			return -1;
		else 
			return 0;

	}
	
	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Carta))
			return false;
		
		Carta otro = (Carta) obj;
		if (this.getValor() == otro.getValor())
			return true;
		else
			return false;
		
	}
	

}
