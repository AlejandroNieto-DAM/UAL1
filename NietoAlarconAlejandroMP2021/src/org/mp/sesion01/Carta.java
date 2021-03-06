package org.mp.sesion01;

public class Carta implements Comparable<Object> {

	private String palo;
	private int numero;
	private int valor;

	/**
	 * Constructor por parametros
	 * @param palo es el palo al que pertenece la carta
	 * @param i es el valor numerico de la carta
	 */
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

	/**
	 * Devuelve el palo de la carta
	 * @return palo que es el palo al que pertenece la carta
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 * Cambia el valor del palo de la carta por uno nuevo
	 * @param palo es el nuevo valor de palo que le vamos a poner a la carta
	 */
	public void setPalo(String palo) {
		this.palo = palo;
	}

	/**
	 * Devuelve el valor numerico de la carta.
	 * @return numero que es el numero de la carta
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Cambia el valor numerico de la carta por uno nuevo
	 * @param numero es el nuevo valor que se le va a poner al numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Devuelve "la posicion" de la carta en la baraja
	 * @return devuelve el valor de la carta en la baraja
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * Cambia el valor de la carta por uno nuevo
	 * @param valor es la nueva "posicion" de la carta en la baraja.
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	/**
	 * Override del metodo compareTo
	 * @param arg0 que es el objeto con el que queremos comparar este objeto
	 * @return retorna 1 en caso de que este sea mayor que el otro objeto, retorna -1 si es menor y 0 en otro caso
	 */
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
	
	/**
	 * Override del metodo equals
	 * @param obj que es el objeto con el que queremos ver si es igual
	 * @return true en caso de que sean iguales y false en otro caso
	 */
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
