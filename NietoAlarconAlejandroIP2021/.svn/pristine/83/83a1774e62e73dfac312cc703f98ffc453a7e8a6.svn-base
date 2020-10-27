package org.ip.sesion04;

import java.util.Locale;

public class AproximaE {

	
	public static double aproximaE(long precision) {
		System.out.printf(Locale.ENGLISH, "%1s\t\t%1s\t\t\t%1s\n", "i", "E(i)", "Error(i)");
		System.out.println("--------------------------------------------------------");
		
		double aprox = 1;
		
		for(int i = 1; i <= precision; i++){
			
			double factorial = 1;
			
			if(i > 1) {		
				for(int j = 1; j < i; j++) {
					factorial *= j;
				}
				
				aprox += 1.0/factorial;
				
				
			}
			
			System.out.printf(Locale.ENGLISH, "%1d\t%7.14f\t%7.14f\n", i, aprox, Math.abs((aprox - Math.E)));

			
			
		}
		
		
		
		return aprox;
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.printf(Locale.ENGLISH, "\n%1s\t\t%7.14f\n%1s\t%7.14f\n", "miE = ", aproximaE(20), "Math.E = ", Math.E);

	}

}
