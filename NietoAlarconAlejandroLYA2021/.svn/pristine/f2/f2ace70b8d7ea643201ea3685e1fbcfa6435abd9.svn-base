package org.lya.sesion09;

import java.util.Arrays;

public class TiemposCoeficienteBin {
	
	public static void main(String[] args) {
		
		int n = 4;
		
		while (n <= 25) {
			
			CoeficienteBin coeficiente = new CoeficienteBin(n * 2, n);
			
			double[] tiemposR = new double[10];
			
			for(int i = 0; i < 10; i++) {
				long startTime = System.nanoTime();
				coeficiente.coefBinomialRecursivo();
				long endTime = System.nanoTime();
				tiemposR[i] =  (double)endTime - startTime;
			}
			
			System.out.println("Tiempo que tarda el RECURSIVO con (" + n * 2  + ", " + n + " )  es igual a: " + calcularMedia(tiemposR));
			
			
			double[] tiemposD = new double[10];
			
			for(int i = 0; i < 10; i++) {
				long startTime = System.nanoTime();
				coeficiente.coefBinomialRecursivo();
				long endTime = System.nanoTime();
				tiemposD[i] =  (double)endTime - startTime;
			}
			
			System.out.println("Tiempo que tarda el DINAMICO con (" + n * 2  + ", " + n + " )  es igual a: " + calcularMedia(tiemposD));
			
			n += 1; 
			
		}
	}
	
	
	private static double calcularMedia(double[] tiempos) {
		
		Arrays.sort(tiempos);
		double media = 0;
		for(int i = 0; i < 9; i++) {
			media += tiempos[i];
		}
		
		return media/9.0;
	}
}
