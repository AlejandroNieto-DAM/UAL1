package org.ip.sesion01;

public class CalculoIntereses {
	
	public static void main(String[] args) {
		
		final double INTERES = 1.75;
		
		double dinero = 2500.00;
		int meses = 6;
		
		double intereses = 0.0;
		double retencion = 0.0;
		double interesesCobrados = 0.0;
		
		intereses = ((INTERES * dinero) / 100) / (12 / meses);
		
		retencion = (intereses * 21) / 100;
		
		interesesCobrados = intereses - retencion;
		
		
		System.out.println("*** Calculo de intereses ***");
		System.out.println("Dinero ingresado: " + dinero);
		System.out.println("Interes actual: " + INTERES);
		System.out.println("Intereses a los " + meses + " meses: " + String.format("%.02f", intereses));
		System.out.println("Retencion realizada: " + String.format("%.02f", retencion));
		System.out.println("Intereses cobrados: " + String.format("%.02f", interesesCobrados));
		
		
	}
}
