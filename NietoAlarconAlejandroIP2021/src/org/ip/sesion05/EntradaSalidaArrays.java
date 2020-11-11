package org.ip.sesion05;

import java.util.Scanner;

public class EntradaSalidaArrays {

	private static Scanner entrada;

	public static double[] leerRealesArrays1D() {

		entrada = new Scanner(System.in);

		System.out.println("Introduce el número de componentes del array de reales");

		int numElementos = entrada.nextInt();
		double[] array = new double[numElementos];

		System.out.println("Introduce valores enteros en el array ");

		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce valor " + (i + 1) + " => ");
			array[i] = entrada.nextDouble();
		}

		return array;

	}

	public static int[] leerEnterosArray1D() {

		entrada = new Scanner(System.in);

		System.out.println("Introduce el número de componentes del array de enteros");

		int numElementos = entrada.nextInt();
		int[] array = new int[numElementos];

		System.out.println("Introduce valores enteros en el array ");

		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce valor " + (i + 1) + " => ");
			array[i] = entrada.nextInt();
		}

		return array;
	}

	public static int[] inicializarEnterosArray1D() {

		entrada = new Scanner(System.in);

		System.out.println("Introduce el número de componentes del array de enteros para inicializar");

		int numElementos = entrada.nextInt();
		int[] array = new int[numElementos];

		int valorMaximo = 15;
		int valorMinimo = -15;

		for (int i = 0; i < array.length; i++) {
			int valorEntero = (int) Math.floor(Math.random() * (valorMaximo - valorMinimo + 1) + valorMinimo);

			array[i] = valorEntero;
		}

		return array;

	}

	public static double[] inicializarRealesArray1D() {
		entrada = new Scanner(System.in);

		System.out.println("Introduce el número de componentes del array de reales para inicializar");

		int numElementos = entrada.nextInt();
		double[] array = new double[numElementos];

		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random();
		}

		return array;

	}

	public static void mostrarArray1D(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
	}

	public static void mostrarArray1D(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
	}

	public static int[][] leerEnterosMatriz2D() {
		entrada = new Scanner(System.in);

		System.out.println("Introduce el número de filas de una matriz de enteros");
		int filas = entrada.nextInt();

		System.out.println("Introduce el número de columnas de una matriz de enteros");
		int columnas = entrada.nextInt();

		int[][] matriz = new int[filas][columnas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Introduce valor " + (i + 1) + " " + (j + 1) + "=> ");
				matriz[i][j] = entrada.nextInt();
			}
		}

		return matriz;

	}

	public static int[][] inicializarEnterosMatriz() {
		entrada = new Scanner(System.in);

		System.out.println("Introduce el número de filas de una matriz de enteros");
		int filas = entrada.nextInt();

		System.out.println("Introduce el número de columnas de una matriz de enteros");
		int columnas = entrada.nextInt();

		int[][] matriz = new int[filas][columnas];

		int valorMaximo = 15;
		int valorMinimo = -15;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int valorEntero = (int) Math.floor(Math.random() * (valorMaximo - valorMinimo + 1) + valorMinimo);
				matriz[i][j] = (int) Math.random();
			}
		}

		return matriz;

	}

	public static void mostrarMatriz2D(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println();
	}

	public static void mostrarMatriz2D(double[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println();
	}

	public static void main(String[] args) {

		double [] arrayReales = leerRealesArrays1D();
		int [] arrayEnteros = leerEnterosArray1D();

		int [] arrayEnterosInicializado = inicializarEnterosArray1D();
		double [] arrayRealesInicializado = inicializarRealesArray1D();

		mostrarArray1D(arrayEnterosInicializado);
		mostrarArray1D(arrayRealesInicializado);

		int [][] matrizEnteros = leerEnterosMatriz2D();
		int [][] matrizEnterosInicializado = inicializarEnterosMatriz();

		mostrarMatriz2D(matrizEnteros);

	}

}
