package org.ip.sesion02;
import java.util.Scanner; 

public class OperacionAritmetica {

	public static void main(String[] args) {

		double numero1 = 7;
		double numero2 = 2;
	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Los datos son:");
			System.out.println("x = " + numero1 + ", y = " + numero2);
			
			System.out.print("La operacion elegida es: ");
			
			//String operacion = scanner.nextLine();
			String operacion = "/";
			
			System.out.println();
			
			String resultado = "El resultado de la operacion es: " + numero1 + " " + operacion + " " + numero2 + " = ";
			
			switch(operacion) {
				case "+":
					System.out.println(resultado + (numero1 + numero2));
					break;
				
				case "-":
					System.out.println(resultado + (numero1 - numero2));
					break;
					
				case "*":
					System.out.println(resultado + (numero1 * numero2));
					break;
				
				case "/":
					System.out.println(resultado + (numero1 / numero2));
					break;
			}
		}
	}

}
