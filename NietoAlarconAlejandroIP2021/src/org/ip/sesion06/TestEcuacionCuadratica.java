package org.ip.sesion06;
import java.util.Scanner;
public class TestEcuacionCuadratica {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double a = 0.0;
		double b = 0.0; 
		double c = 0.0;
				
		
		for(int i = 0; i < 6; i++) {
			
			System.out.println("Introduce los valores de los coeficientes de la");
			System.out.println("ecuacion cuadratica: ax*x + b*x + c = 0");
			System.out.print("a = ");
			a = entrada.nextDouble();
			System.out.print("b = ");
			b = entrada.nextDouble();
			System.out.print("c = ");
			c = entrada.nextDouble();
			
			EcuacionCuadratica ecu1 = new EcuacionCuadratica(a, b, c);
			
			System.out.println(ecu1.toString());
			
			if(a != 0) {
				if(ecu1.getDiscriminante() >= 0) {
					if(ecu1.getRaiz1() != ecu1.getRaiz2()) {
						System.out.println("Ecuacion cuadratica con dos raices de valores");
						System.out.println("x1 = " + ecu1.getRaiz1());
						System.out.println("x2 = " + ecu1.getRaiz2());
					} else {
						System.out.println("Ecuacion cuadratica con una raiz de valor doble");
						System.out.println("x = " + ecu1.getRaiz1());
					}
					
				} else {
					System.out.println("Ecuacion cuadratica sin raices reales");
				}
			} else {
				System.out.println("No es una ecuacion cuadratica");
			}
			
			System.out.println();
		
		}
		
			 	
		
	}

}
