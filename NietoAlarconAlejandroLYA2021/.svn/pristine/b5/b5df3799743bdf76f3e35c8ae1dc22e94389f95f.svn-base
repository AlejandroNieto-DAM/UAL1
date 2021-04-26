package org.lya.sesion08;

import java.util.Arrays;

public class TiempoPotencia {

	public static void main(String [] args) {
		
		Potencia pot = new Potencia(1, 32);
		
		while(pot.getExponente() <= 131072){
			
			double[] tiemposFB = new double[10];
			
			for(int i = 0; i < 10; i++) {
				long startTime = System.nanoTime();
				pot.exponenFuerzaBruta();
				long endTime = System.nanoTime();
				tiemposFB[i] =  (double)endTime - startTime;
				
			}
			
			System.out.println("Tiempo que tarda el fuerza bruta 1^" + pot.getExponente() + " es igual a: " + calcularMedia(tiemposFB));
			
			
			double[] tiemposR = new double[10];
			
			for(int i = 0; i < 10; i++) {
				long startTime = System.nanoTime();
				pot.exponenRecursivoDyV();
				long endTime = System.nanoTime();
				tiemposR[i] =  (double)endTime - startTime;
			}
			
			System.out.println("Tiempo que tarda el recursivo en 1^" + pot.getExponente() + " es igual a: " + calcularMedia(tiemposR));
			
			pot.setExponente(pot.getExponente() * 2);
			
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
