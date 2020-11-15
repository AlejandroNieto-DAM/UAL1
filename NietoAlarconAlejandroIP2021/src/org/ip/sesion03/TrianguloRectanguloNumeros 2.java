package org.ip.sesion03;

import java.util.Scanner;

public class TrianguloRectanguloNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numerosTriangulo = 0;
		String salida = "";
		String espacios = "";

		do {
			System.out.print("Triangulo rectangulo de numeros para un valor de lado = ");
			numerosTriangulo = entrada.nextInt();
		} while (numerosTriangulo < 1 || numerosTriangulo > 10);

		for (int i = 0; i < numerosTriangulo; i++) {
			for (int j = 0; j < (numerosTriangulo - i); j++) {
				espacios += " " + " ";

			}

			salida = i + " " + salida;
			System.out.println(espacios + salida);
			espacios = "";
		}
	}

}
