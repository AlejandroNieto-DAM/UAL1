package org.mp.sesion01;

/**
 * Fraction class.
 * 
 * @author alejandronietoalarcon
 * @version 11.02.2021
*/
public class Fraccion implements Comparable<Object> {

	private int numerador;
	private int denominador;

	/**
	 * Default constructor.
	 */
	public Fraccion() {
		numerador = 0;
		denominador = 1;
	}

	/**
	 * Constructor by parameters.
	 * @param numerador = numerator of the fraction.
	 * @param denominador = denominator of the fraction.
	 */
	public Fraccion(int numerador, int denominador) {

		this.numerador = ((denominador > 0) ? 1 : -1) * numerador;
		this.denominador = Math.abs(denominador);

	}

	/**
	 * Check if two fractions are equals.
	 * If they are true it returns true, if no, it returns false.
	 */
	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Fraccion))
			return false;
		Fraccion otro = (Fraccion) obj;
		if (denominador != otro.denominador)
			return false;
		if (numerador != otro.numerador)
			return false;
		return true;
	}

	/**
	 * Getter.
	 * @return returns the numerator of the fraction.
	 */
	public int getNumerador() {
		return numerador;
	}
	
	/**
	 * Getter.
	 * @return returns the denominator of the fraction.
	 */
	public int getDenominador() {
		return denominador;
	}

	/**
	 * Method that prints in text format the fraction, if the denominator is 1 it will print only the number.
	 * Example = 3/4
	 */
	@Override
	public String toString() {
		if (denominador == 1)
			return numerador + "";
		else
			return numerador + "/" + denominador;
	}

	/**
	 * Method that performs the addition of two fractions.
	 * @param b = is the fraction that we want to sum.
	 * @return returns the new fraction with the new numerator and denominator.
	 */
	public Fraccion sumar(Fraccion b) {
		int num = numerador * b.getDenominador() + denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);

	}

	/**
	 * Method that performs the subtraction of two fractions.
	 * @param b = is the fraction that we want to subtract.
	 * @return returns the new fraction with the new numerator and denominator.
	 */
	public Fraccion restar(Fraccion b) {
		int num = numerador * b.getDenominador() - denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);
	}

	/**
	 * Method that performs the multiplication of two fractions.
	 * @param b = is the fraction that we want to multiply with ours.
	 * @return returns the new fraction with the new numerator and denominator.
	 */
	public Fraccion multiplicar(Fraccion b) {
		return new Fraccion(numerador * b.getNumerador(), denominador * b.getDenominador());
	}

	/**
	 * Method that performs the division of two fractions.
	 * @param b = is the fraction that we want to divide with ours.
	 * @return returns the new fraction with the new numerator and denominator.
	 */
	public Fraccion dividir(Fraccion b) {
		return new Fraccion(numerador * b.getDenominador(), denominador * b.getNumerador());
	}

	/**
	 * Method that finds the mcd of two numbers.
	 * @param u = number one to find the mcd.
	 * @param v = number two to find the mcd.
	 * @return returns the mcd of two numbers.
	 */
	private static int mcd(int u, int v) {
		u = Math.abs(u);
		v = Math.abs(v);
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

	/**
	 * This method simplifies the fraction that calls this method.
	 * @return returns the pointer of the fraction that has called the method.
	 */
	public Fraccion simplificar() {
		int dividir = mcd(numerador, denominador);
		numerador /= dividir;
		denominador /= dividir;
		return this;
	}

	/**
	 * Compares two fractions.
	 */
	public int compareTo(Object o) {

		Fraccion otro = (Fraccion) o;

		double valorFraccion = (double) numerador / denominador;
		double valorOtro = (double) otro.getNumerador() / otro.getDenominador();

		if (valorFraccion > valorOtro)
			return 1;
		else if (valorFraccion < valorOtro)
			return -1;
		else
			return 0;

	}

}
