package org.mp.sesion05;

public class NumerosAleatorios {

	public String randomInt(int M, int N) {
		int valorEntero = (int) Math.floor(Math.random()*(N-M+1)+M);
		return String.valueOf(valorEntero);
	}

}
