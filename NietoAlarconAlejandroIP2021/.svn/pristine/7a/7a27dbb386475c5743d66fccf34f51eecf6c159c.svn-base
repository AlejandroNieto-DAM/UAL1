package org.ip.sesion05;

public class MatrizAsteriscos {

	static int filas = 13;
	
	public static char [][] matrizAsteriscos(int numeroFilas) {
		int columnas = filas * 2  - 1;
		char [][] matriz = new char [filas][columnas];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = ' ';
			}
		}
		
		int espacios = 0;
		
		for(int fila = filas - 1; fila >= 0; fila--) {
			
			for(int columna = espacios; columna < columnas - espacios; columna++) {
				matriz[fila][columna] = '*';
			}
			
			espacios += 1;
		}
		
		return matriz;
	}
	
	public static void main(String[] args) {

		char [][] matriz = matrizAsteriscos(filas);
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
