package org.ip.sesion03;
import java.util.Scanner;

public class Euclides {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int primerNumero = 0;
		int segundoNumero = 0;
		
		int mcd = 0;
		
		int dividendo = 0;
		int divisor = 0;
		
		
		do {
			System.out.println("Introduce el primer valor entero positivo.");
			primerNumero = Integer.valueOf(entrada.nextInt());
		} 
		while(primerNumero <= 0);
		
		dividendo = primerNumero;
		
		do {
			System.out.println("Introduce el segundo valor entero positivo.");
			segundoNumero = Integer.valueOf(entrada.nextInt());
		} 
		while(segundoNumero <= 0);
		
		divisor = segundoNumero;
		
		if (segundoNumero > primerNumero){
			int auxiliar  = primerNumero;
			primerNumero = segundoNumero;
			segundoNumero = auxiliar;
		}
		
		while(dividendo % divisor != 0) {
			int auxiliar = divisor;
			divisor = dividendo % divisor;
			dividendo = auxiliar;
		}
		
		System.out.println("El MCD de " + primerNumero + " y " + segundoNumero + " es " + divisor);
		
	}
}
