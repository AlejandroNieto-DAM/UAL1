package org.ip.sesion03;

import java.util.Scanner;

public class TrianguloNumeros {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int ladoTriangulo = 0;
		String salida = "";
		String espacios = "";
		int suma = 0;
		String medio = "";
		String salida2 = "";

		do {
			System.out.print("Triangulo rectangulo de numeros para un valor de lado = ");
			ladoTriangulo = entrada.nextInt();
		} while (ladoTriangulo < 1 || ladoTriangulo > 10);

		for (int i = 1; i <= ladoTriangulo; i++) {

			for (int j = 1; j <= (ladoTriangulo - i); j++) {
				espacios += " " + " ";
			}

			for (int x = 0; x < salida.length() - 1; x++) {
				if (salida.charAt(x) != ' ') {

					int valor = Integer.valueOf(String.valueOf(salida.charAt(x)));

					if ((valor + 2) >= 10) {
						salida2 += String.valueOf(valor + 2).charAt(1) + " ";
					} else {
						salida2 += valor + 2 + " ";
					}

				}
			}

			salida = salida2;

			if (i == 1) {
				salida = i + " ";
			} else if (i >= 10) {
				salida = String.valueOf(i).charAt(1) + " " + salida + String.valueOf(i).charAt(1) + " ";
			} else {
				salida = i + " " + salida + i + " ";
			}

			System.out.println(espacios + salida + espacios);
			espacios = "";
			salida2 = "";
		}
	}

}
