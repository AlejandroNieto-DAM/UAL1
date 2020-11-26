package org.ip.examenprimerparcial2021;

import java.util.Scanner;

public class FigurasOperaciones {

	static int figura = 0;
	static int operacion = 0;

	public static void figurasOperaciones(int figura, int operacion, double radio, double altura) {
		switch (figura) {
			case 1:
	
				switch (operacion) {
	
				case 1:
	
					double area = 4 * Math.PI * Math.pow(radio, 2);
					System.out.println("El AREA de la ESFERA es:\t " + area);
					break;
	
				case 2:
	
					double volumen = ((4.0 / 3.0) * Math.PI) * Math.pow(radio, 3);
					System.out.println("El VOLUMEN de la ESFERA es:\t " + volumen);
					break;
	
				}
	
				break;
	
			case 2:
	
				switch (operacion) {
	
				case 1:
	
					double area = 6 * Math.pow(altura, 2);
					System.out.println("El AREA del CUBO es:\t " + area);
					break;
	
				case 2:
	
					double volumen = Math.pow(altura, 3);
					System.out.println("El VOLUMEN del CUBO es:\t " + volumen);
					break;
	
				}
	
				break;
		}

	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** OPERACIONES SOBRE FIGURAS ***");
		
		do {
			System.out.print("Introduzca la figura (1 (esfera) / 2 (cubo))\t: ");
			figura = entrada.nextInt();

		} while (figura < 1 || figura > 2);

		do {
			System.out.print("Introduzca la operacion (1 (area) / 2 (volumen)): ");
			operacion = entrada.nextInt();

		} while (operacion < 1 || operacion > 2);

		double variableAlturaORadio = 0;
		
		switch (figura) {
			case 1:
	
				System.out.println("+++ OPERACION SOBRE LA ESFERA +++");
				
				do {
					System.out.print("Introduzca el valor del radio (valor >= 0.0)\t: ");
					variableAlturaORadio = entrada.nextDouble();
				} while (variableAlturaORadio < 0.0);
				
				figurasOperaciones(figura, operacion, variableAlturaORadio, 0);
				
				break;
	
			case 2:
	
				System.out.println("+++ OPERACION SOBRE EL CUBO +++");
				
				do {
					System.out.print("Introduzca el valor de la altura (valor >= 0.0)\t: ");
					variableAlturaORadio = entrada.nextDouble();
				} while (variableAlturaORadio < 0.0);
				
				figurasOperaciones(figura, operacion, 0, variableAlturaORadio);
	
				break;
	
			}
		
		entrada.close();

	}

}
