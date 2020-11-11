package org.ip.sesion05;

public class PracticasConArrays {

	static int [] arrayEnteros = {5, 10, 15, 2, 4, 23, 7, 13, 8, 17, 27};
	static int numeroDesplazamientos = 1;
	
	public static int [] invertir(int [] array) {
		
		int [] arrayInvertido = new int [array.length];
		
		for(int i = 1; i <= array.length; i++) {
			arrayInvertido[i - 1] = array[array.length - i];
		}
		
		return arrayInvertido;
		

	}
	
	public static void desplazar(int [] array) {
		
		for(int j = 0; j < numeroDesplazamientos; j++){
			
			int primerNumero = array[0];

			for(int i = 0; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
			
			array[array.length - 1] = primerNumero;

		}
		
		mostrarArray(array);
	}
	
	public static int indiceMaximoValor(int [] array) {
		int mayor = array[0];
		int indice = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(mayor < array[i]) {
				mayor = array[i];
				indice = i;
			}
		}
		

		
		return indice;
	}
	
	public static int indiceMinimoValor(int [] array) {
		int min = array[0];
		int indice = 0;
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
				indice = i;
			}
		}
		
		return indice;
	}
	
	public static int [] eliminarDuplicados(int [] array) {
		
		int [] arrayAuxiliar = new int [array.length];
		int util = 0;
		
		for(int i = 0; i < arrayAuxiliar.length; i++) {
			arrayAuxiliar[i] = -1;
		}
			
		for(int i = 0; i < array.length; i++) {
			
			boolean encontrado = false;
			
			for(int j = 0; j < array.length; j++) {
				if(array[i] == arrayAuxiliar[j]) {
					encontrado = true;
				}
			}
			
			if(!encontrado) {
				arrayAuxiliar[util] = array[i];
				util++;
			}
		}
		
		int [] arraySinDuplicados = new int [util];
		
		for(int i = 0; i < arraySinDuplicados.length; i++) {
			arraySinDuplicados[i] = arrayAuxiliar[i];
			
		}
		
		return arraySinDuplicados;
	}
	
	public static void mostrarArray(int [] array) {
		System.out.print("Array de Enteros: [");
		for(int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		
		System.out.print(array[array.length - 1] + "]");
		
		System.out.println();
	}
	
	public static void main(String[] args) {

		mostrarArray(arrayEnteros);
		System.out.println("Indice del menor valor del array de enteros: " + indiceMinimoValor(arrayEnteros));
		System.out.println("Indice del mayor valor del array de enteros: " + indiceMaximoValor(arrayEnteros));
		
		int [] arrayInvertido = invertir(arrayEnteros);
		mostrarArray(arrayInvertido);
		System.out.println("Indice del menor valor del array de enteros: " + indiceMinimoValor(arrayEnteros));
		System.out.println("Indice del mayor valor del array de enteros: " + indiceMaximoValor(arrayEnteros));
		
		System.out.println("Desplazando el array una posicion...");
		desplazar(arrayEnteros);
		
		numeroDesplazamientos = 5;
		System.out.println("Desplazando el array 5 posiciones...");
		desplazar(arrayEnteros);
		
		int [] arrayDuplicados = {1, 1, 3, 2, 1, 6, 3, 4, 4, 4, 5, 2, 1, 2, 6, 4, 7, 5, 6, 7, 1, 8};
		mostrarArray(arrayDuplicados);
		arrayDuplicados = eliminarDuplicados(arrayDuplicados);
		mostrarArray(arrayDuplicados);
		
		
	}

}
