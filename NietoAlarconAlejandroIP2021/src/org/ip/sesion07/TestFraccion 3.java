package org.ip.sesion07;
import java.util.Scanner;
public class TestFraccion {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numeroComparaciones = 0;
		int numerador = 0;
		int denominador = 0;
		
		System.out.println("Cuantas comparaciones de fracciones deseas realizar?");
		numeroComparaciones = entrada.nextInt();
		
		for(int i = 0; i < numeroComparaciones; i++) {
			System.out.println("Comparacion " + (i + 1));
			
			System.out.println("Introduce el numerador y denominador de la primera fraccion");
			numerador = entrada.nextInt();
			denominador = entrada.nextInt();
			Fraccion fr1 = new Fraccion(numerador, denominador);
			
			System.out.println("Introduce el numerador y denominador de la segunda fraccion");
			numerador = entrada.nextInt();
			denominador = entrada.nextInt();
			Fraccion fr2 = new Fraccion(numerador, denominador);
			
			if(fr1.compareTo(fr2) == 0) {
				System.out.println(fr1.toString() + " es menor que " + fr2.toString());
			} else if(fr1.compareTo(fr2) == 1) {
				System.out.println(fr1.toString() + " es mayor que " + fr2.toString());
			} else {
				System.out.println(fr1.toString() + " es igual que " + fr2.toString());
			}
			
			System.out.println();
		}
		
		entrada.close();
	}

}
