package org.ip.sesion05;

public class MatricesBinarias {
	
	static int [][] matriz = {{1, 3, 5, 7, 9}, {12, 8, 37, 50, 11}, {2, 4, 6, 8, 10}, {77, 12, 21, 31, 28}, {47, 2, 84, 87, 83}};

	public static boolean esBinaria(int [][] matriz) {
		
		boolean esBinaria = true;
		
		for(int i = 0;  i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] != 1 && matriz[i][j] !=0) {
					esBinaria = false;
				}
			}
		}
		
		return esBinaria;
	}
	
	public static int [][] transformaBinaria(int [][] matriz){
		
		for(int i = 0;  i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] % 2 == 0) {
					matriz[i][j] = 0;
				} else {
					matriz[i][j] = 1;
				}
			}
		}
		
		return matriz;
		
	}
	
	public static int numeroDeUnos(int [][] matriz) {
		int sumatoria = 0;
		
		for(int i = 0;  i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == 1 ) {
					sumatoria += 1;
				}
			}
		}
		
		return sumatoria;
	}
	
	public static boolean tieneNumeroParCeros(int [][] matriz) {
		int sumatoria = 0;
		
		for(int i = 0;  i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == 0 ) {
					sumatoria += 1;
				}
			}
		}
		
		boolean cerosPar = false;
		
		if(sumatoria % 2 == 0) {
			cerosPar = true;
		}
		
		return cerosPar;
		
	}
	
	public static int [] sumaFilas(int [][] matriz) {
		int [] filasSumadas = new int [matriz.length];
		
		int sumatoria = 0;
		for(int i = 0; i < matriz.length; i++) {
			
			sumatoria = 0;
			
			for(int j = 0; j < matriz[i].length; j++) {
				sumatoria += matriz[i][j];
			}
			
			filasSumadas[i] = sumatoria;
		}
		
		return filasSumadas;
	}
	
	public static int [] sumaColumnas(int [][] matriz) {
		int [] columnasSumadas = new int [matriz.length];
		
		int sumatoria = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			
			sumatoria = 0;
			
			for(int j = 0; j < matriz[i].length; j++) {
				sumatoria += matriz[j][i];
			}
			
			columnasSumadas[i] = sumatoria;
		}
		
		return columnasSumadas;
	}
	
	public static int [] extraerFila(int [][] matriz, int numFila) {
		return matriz[numFila];
	}
	
	public static int [] extraerColumna(int [][] matriz, int numColumna) {
		
		int [] columna = new int [matriz[0].length];
		
		for(int j = 0; j < matriz.length; j++) {
			columna[j] = matriz[j][numColumna];
		}
			
		
		
		return columna;
	}
	
	public static int [][] obtenerLaterales(int [][] matriz){
		
		int [][] laterales = new int [4][matriz[0].length];
		
		int [] lateralSuperior = extraerFila(matriz, 0);
		int [] lateralInferior = extraerFila(matriz, 4);
		int [] lateralDerecha = extraerColumna(matriz, 4);
		int [] lateralIzquierda = extraerColumna(matriz, 0);
		
		int fila = 0;
		for(int i = 0; i < matriz[0].length; i++) {
			laterales[fila][i] = lateralSuperior[i];
		}
		
		fila++;
		
		for(int i = 0; i < matriz[0].length; i++) {
			laterales[fila][i] = lateralDerecha[i];
		}
		
		fila++;
		
		for(int i = 0; i < matriz[0].length; i++) {
			laterales[fila][i] = lateralInferior[i];
		}
		
		fila++;

		for(int i = 0; i < matriz[0].length; i++) {
			laterales[fila][i] = lateralIzquierda[i];
		}
		
 		return laterales;
	}
	
	public static void mostrarMatriz(int [][] matriz) {
		System.out.println("Matriz:");
		System.out.print("[");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(j != matriz[matriz.length - 1].length - 1) {
					System.out.print(matriz[i][j] + "\t");
				} else {
					System.out.print(matriz[i][j]);
				}
			}
			
			if(i !=  matriz.length - 1) {
				System.out.println();
			}
		}
		
		System.out.print("]");
		
		System.out.println();
	}
	
	public static void mostrarArray(int [] array) {
		System.out.print("Array: [");
		for(int i = 0;  i < array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println(array[array.length - 1] + "]");
	}
	
	public static void main(String[] args) {
		mostrarMatriz(matriz);
		
		if(esBinaria(matriz)) {
			System.out.println("La matriz es binaria");
		} else {
			System.out.println("La matriz no es binaria");
		}
		
		System.out.print("Fila 2 => ");
		mostrarArray(extraerFila(matriz, 2));
		
		System.out.print("Columna 3 => ");
		mostrarArray(extraerColumna(matriz, 3));
		
		System.out.print("Suma de las filas => ");
		mostrarArray(sumaFilas(matriz));
		
		System.out.print("Suma de las columnas => ");
		mostrarArray(sumaColumnas(matriz));
		
		transformaBinaria(matriz);
		System.out.println("Transformando la matriz de enteros en matriz binaria ...");
		
		mostrarMatriz(matriz);

		if(esBinaria(matriz)) {
			System.out.println("La matriz es binaria");
		} else {
			System.out.println("La matriz no es binaria");
		}
		
		System.out.println("El numeros de 1s es: " + numeroDeUnos(matriz));
		
		if(tieneNumeroParCeros(matriz)) {
			System.out.println("La matriz binaria tiene un numero par de ceros");
		} else {
			System.out.println("La matriz binaria no tiene un numero par de ceros");
		}

		System.out.print("Fila 3 => ");
		mostrarArray(extraerFila(matriz, 3));
		
		System.out.print("Columna 2 => ");
		mostrarArray(extraerColumna(matriz, 2));
		
		System.out.print("Suma de las filas => ");
		mostrarArray(sumaFilas(matriz));
		
		System.out.print("Suma de las columnas => ");
		mostrarArray(sumaColumnas(matriz));
		
		System.out.print("Laterales => ");
		mostrarMatriz(obtenerLaterales(matriz));
	}

}
