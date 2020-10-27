package org.ip.sesion04;
import java.util.Scanner;

public class Cilindro {
	
	static double radio = 0;
	static double altura = 0;
	static int opcion = 0;
	static Scanner entrada = new Scanner(System.in);
	
	public static void areaVolumenCilindro(double radio, double altura, int opcion) {
		
		if(opcion == 1) {
			double area = Math.PI * 2 * radio * (altura + radio);
			System.out.println("El area del cilindro es de: " + area);
		} else if(opcion == 2) {
			double volumen = Math.PI * Math.pow(radio, 2) * altura;
			System.out.println("El area del cilindro es de: " + volumen);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Introduzca el radio: ");
		radio = entrada.nextDouble();
		
		System.out.print("Introduzca la altura: ");
		altura = entrada.nextDouble();
		
		System.out.print("Que desea calcular (1 (area) / 2 (volumen)) ");
		opcion = entrada.nextInt();
		
		
		areaVolumenCilindro(radio, altura, opcion);
	}

}
