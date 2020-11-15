package org.ip.sesion03;
import java.util.Scanner;

public class BucleCentinela {

	public static void main(String[] args) {
		String cadenaDeValores = "";
		Scanner entrada = new Scanner(System.in);
		
		int sumaPositivos = 0;
		int sumaNegativos = 0;
		int numerosPositivos = 0;
		int numerosNegativos = 0;
		int totalNumeros = 0;
		double mediaValores = 0.0;
		
		
		System.out.println("Introduce valores enteros, el programa termina si la entrada es 0");
		
		int value = 0;
		
		
		
		while((value = entrada.nextInt()) != 0) {
		

				totalNumeros++;
				
				if(value > 0) {
					numerosPositivos ++;
					sumaPositivos += value;
				} else {
					numerosNegativos ++;
					sumaNegativos += value;
				}
				
			
		
		}		
		
		mediaValores = ((sumaPositivos + sumaNegativos) / Double.valueOf(totalNumeros));
		
		System.out.println("El numero de positivos es " + numerosPositivos);
		System.out.println("El numero de negativos es " + numerosNegativos);
		System.out.println("El numero total de valores leidos es " + totalNumeros);
		System.out.println("La suma de positivos es " + sumaPositivos);
		System.out.println("La suma de negativos es " + sumaNegativos);
		System.out.println("La media de los valores es " + mediaValores);


	}
}
