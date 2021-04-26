package org.lya.sesion06;

public class MatrizEnterosCuadrada {
	
	private int [][] matriz;

	public MatrizEnterosCuadrada(int[][] matriz1) {
		matriz = new int [matriz1[0].length][matriz1.length];
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[0].length; j++) {
				matriz[i][j] = matriz1[i][j];
			}
		}
	}

	public MatrizEnterosCuadrada(int numeroFilasColumnas) {
		matriz = new int [numeroFilasColumnas][numeroFilasColumnas];
		for(int i = 0; i < numeroFilasColumnas; i++) {
			for(int j = 0; j < numeroFilasColumnas; j++) {
				matriz[i][j] = (int) Math.random() * 50;
			}
		}
	}

	public static void burbujaMejora(int[] array) {
	
		boolean cambiado = true;
		int i = 1;

		while (cambiado && (i < array.length)) {
			cambiado = false;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > (array[j + 1])) {
					// Intercambio
					int aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
					cambiado = true;
				}
			}
			i++;
		}
		
	}

	public int getNumeroDeFilas() {
		return matriz[0].length;
	}

	public int getNumeroDeColumnas() {
		return matriz.length;
	}

	public MatrizEnterosCuadrada matrizOrdenadaPorFilas() {
		MatrizEnterosCuadrada matrizOutput = new MatrizEnterosCuadrada(matriz);
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				matrizOutput.matriz[i][j] = this.matriz[i][j];
			}
		}
		
		for(int i = 0; i < matrizOutput.matriz.length; i++) {
			burbujaMejora(matrizOutput.matriz[i]);
		}
				
		return matrizOutput;
	}
	
	@Override
	public  String toString() {
		String salida = "Matriz:\n";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j != matriz[i].length - 1)
					salida += matriz[i][j] + "\t";
				else
					salida += matriz[i][j];
			}
			if (i != matriz.length - 1)
				salida += "\n";
		}
		return salida;
	}


}
