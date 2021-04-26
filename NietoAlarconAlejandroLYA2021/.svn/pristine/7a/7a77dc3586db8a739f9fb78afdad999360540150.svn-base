package org.lya.sesion07;

public class TiemposSubsecuencia {

	public static void main(String[] args) {
		int n = 64;
		double tiempoFuerza = 0;
		double tiempoMejorado = 0;
		double tiempoLineal = 0;
		
		while(n <= 8192) {
			
			Subsecuencia array = new Subsecuencia(n);
			
			for(int i = 0; i < 10; i++) {
				long startTime = System.nanoTime();
				array.SubsecuenciaFuerzaBruta();
				long endTime = System.nanoTime();
				tiempoFuerza += (double)endTime - startTime;
			}
			
			
			System.out.println("Fuerza bruta con " + n + " valores  --> " + tiempoFuerza/10.0);
			
			
			for(int i = 0; i < 10; i++) {
				long startTime = System.nanoTime();
				array.SubsecuenciaMejorado();
				long endTime = System.nanoTime();
				tiempoMejorado += (double)endTime - startTime;
			}
			
			
			System.out.println("Mejorado con " + n + " valores  --> " + tiempoMejorado/10.0);
			
			
			for(int i = 0; i < 10; i++) {
				long startTime = System.nanoTime();
				array.SubsecuenciaLineal();
				long endTime = System.nanoTime();
				tiempoLineal += (double)endTime - startTime;
			}
			
			
			System.out.println("Lineal con " + n + " valores  --> " + tiempoLineal/10.0);
			
			n *= 2;
		}

	}

}
