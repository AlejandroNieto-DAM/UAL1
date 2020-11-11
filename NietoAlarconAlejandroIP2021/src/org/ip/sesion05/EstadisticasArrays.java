package org.ip.sesion05;

public class EstadisticasArrays {
	
	static int [] arrayEnteros = {5, 10, 15, 20};
	static double [] arrayReales = {5.0, 25.5, 15.75, 10.25, 12.5};

	public static double max(double[] array) {
		double max = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	public static int max(int [] array) {
		int max = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	public static double min(double[] array) {
		double min = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
	}
	
	public static int min(int [] array) {
		int min = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
	}
	
	public static double media(double[] array) {
		double sumatoria = 0.0;
		
		for(int i = 0; i < array.length; i++) {	
			sumatoria += array[i];	
		}
		
		double media = sumatoria / Double.valueOf(array.length);
		
		return media;
	}
	
	public static double media(int [] array) {
		double sumatoria = 0.0;
		
		for(int i = 0; i < array.length; i++) {	
			sumatoria += array[i];	
		}
		
		double media = sumatoria / Double.valueOf(array.length);
		
		return media;
	}
	
	public static double varianza(double[] array) {
		
		double media = media(array);
		
		double sumatoria2 = 0.0;
		
		for(int i = 0; i < array.length; i++) {	
			sumatoria2 += Math.pow(array[i] - media, 2);	
		}
		
		double varianza = sumatoria2 / Double.valueOf(array.length - 1);
		
		return varianza;
	}
	
	public static double varianza(int [] array) {
		
		double media = media(array);
		
		double sumatoria2 = 0.0;
		
		for(int i = 0; i < array.length; i++) {	
			sumatoria2 += Math.pow(array[i] - media, 2);	
		}
		
		double varianza = sumatoria2 / Double.valueOf(array.length - 1);
		
		return varianza;
	}
	
	public static double desviacionTipica(double [] array) {
		double desviacion = 0.0;
		
		desviacion = Math.sqrt(varianza(array));
		
		return desviacion;
	}
	
	public static double desviacionTipica(int [] array) {
		double desviacion = 0.0;
		
		desviacion = Math.sqrt(varianza(array));
		
		return desviacion;
	}
	
	public static void mostrarArray(double [] array) {
		System.out.print("Array de Reales: [");
		for(int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		
		System.out.print(array[array.length - 1] + "]");
		
		System.out.println();
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
		System.out.println("Numero de Elementos del array de enteros: " + arrayEnteros.length);
		System.out.println("Minimo del array de enteros: " + min(arrayEnteros));
		System.out.println("Maximo del array de enteros: " + max(arrayEnteros));
		System.out.println("Media del array de enteros: " + media(arrayEnteros));
		System.out.println("Varianza del array de enteros: " + varianza(arrayEnteros));
		System.out.println("Desviacion Tipica del array de enteros: " + desviacionTipica(arrayEnteros));
		
		System.out.println();
		
		mostrarArray(arrayReales);
		System.out.println("Numero de Elementos del array de reales: " + arrayReales.length);
		System.out.println("Minimo del array de reales: " + min(arrayReales));
		System.out.println("Maximo del array de reales: " + max(arrayReales));
		System.out.println("Media del array de reales: " + media(arrayReales));
		System.out.println("Varianza del array de reales: " + varianza(arrayReales));
		System.out.println("Desviacion Tipica del array de reales: " + desviacionTipica(arrayReales));
	}

}
