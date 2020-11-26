package org.ip.examenprimerparcial2021;

import java.util.Scanner;

public class MatricesCuadradas {

	static double[][] matriz;

	public static double[][] inicializarMatrizCuadrada(int dimension) {
		double[][] matriz = new double[dimension][dimension];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Math.pow(i + 1, j);
			}
		}

		return matriz;
	}

	public static double[] sumarDiagonales(double[][] matriz) {
		
		double diagonal1[] = new double[matriz.length];
		double diagonal2[] = new double[matriz.length];
		double suma[] = new double[matriz.length];
		
		int util = 0;
		for (int i = 0; i < matriz.length; i++) {
			diagonal1[util] = matriz[i][i];
			diagonal2[util] = matriz[(matriz.length - 1) - i][i];
			util++;
		}
	
		for (int i = 0; i < diagonal1.length; i++) {
			suma[i] = Math.abs(diagonal1[i] + diagonal2[i]);
		}

		return suma;
	}

	public static double diferenciaMedia(double[] array) {

		double dM = 0.0;
		double numerador = 0.0;
		for (int i = 0; i < array.length - 1; i++) {
			numerador += Math.abs(array[i + 1] - array[i]);
		}

		dM = numerador / Double.valueOf(array.length - 1);
		
		return dM;
	}

	public static void mostrarMatriz(double[][] matriz) {
		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j != matriz[matriz.length - 1].length - 1) {
					System.out.print(matriz[i][j] + "\t");
				} else {
					System.out.print(matriz[i][j]);
				}
			}

			if (i != matriz.length - 1) {
				System.out.println();
			}
		}

		System.out.println();
	}

	public static void mostrarArray(double[] array) {
		System.out.print("Array: [");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + "\t");
		}

		System.out.println(array[array.length - 1] + "]");
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int dimension = 0;
		System.out.println("*** MATRICES CUADRADAS ***");
		do {
			System.out.print("Introduzca el valor de la dimension (valor >= 2): ");
			dimension = entrada.nextInt();
		} while (dimension < 2);

		matriz = inicializarMatrizCuadrada(dimension);
		mostrarMatriz(matriz);
		mostrarArray(sumarDiagonales(matriz));
		System.out.println("Diferencia media: " + diferenciaMedia(sumarDiagonales(matriz)));

		entrada.close();
	}

}
