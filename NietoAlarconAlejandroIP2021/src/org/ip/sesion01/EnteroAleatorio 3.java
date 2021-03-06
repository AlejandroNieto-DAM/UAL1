package org.ip.sesion01;

public class EnteroAleatorio {

	public static void main(String[] args) {

		System.out.println("Vamos a generar un entero aleatorio entre -15 y 15");

		int valorMaximo = 15;
		int valorMinimo = -15;

		int valorEntero = (int) Math.floor(Math.random() * (valorMaximo - valorMinimo + 1) + valorMinimo);

		System.out.println("El entero generado aleatoriamente es: " + valorEntero);

	}
}
