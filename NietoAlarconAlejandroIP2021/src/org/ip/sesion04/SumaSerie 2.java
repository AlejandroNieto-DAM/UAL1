package org.ip.sesion04;

import java.util.Locale;

public class SumaSerie {
	
	static int numeroIteraciones = 10;
	
	public static double sumaSerie(double i ) {
		double suma = i / (i + 1);
		
		
		if(i == 1) {
			return suma;
		} else {
			return suma + sumaSerie(i - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(" i" + "\t  SUMA");
		
		
		for(int i = 1; i <= numeroIteraciones; i++) {
			System.out.printf(Locale.ENGLISH, "%2d\t%7.6f\n", i, sumaSerie(i));
		}
	}

}
