package org.lya.sesion06;

import java.util.Arrays;

public class TiempoMatrizEnterosCuadrada {

	static int STATIC_VALUE_N_MATRIZ = 8192;
	
	public static void main(String [] args) {
		
		
		MatrizEnterosCuadrada matriz = new MatrizEnterosCuadrada(STATIC_VALUE_N_MATRIZ);
		
		long [] times = new long [10];
		

		for(int i = 0; i < 10; i++) {
			long startTime = System.currentTimeMillis();
			matriz.matrizOrdenadaPorFilas();
			long endTime = System.currentTimeMillis();
			
			times[i] = endTime - startTime;
			//System.out.println("Time --> " + time[i]);
		}
		
		Arrays.sort(times);
		
		double finalTime = calcularMedia(times); 
		System.out.println("Tiempo --> " + finalTime);
	}
	
	public static double calcularMedia(long [] times) {
		double suma = 0;
		for(int i = 0; i < times.length - 1; i++) {
			suma += times[i];
		}
		
		double media = suma / (double)times.length - 1;
		return media;
		
	}
}
