package org.ip.sesion02;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 2;
		double c = 1;
		
		double raiz = 0;
		double solucion1 = 0;
		double solucion2 = 0;
		
		double monstruo = (Math.pow(b, 2) - 4 * a * c);
		
		if (a != 0) {
			
			if (monstruo >= 0) {
				
				raiz = Math.sqrt(monstruo);
				solucion1 = (-(b) + raiz) / (2 * a);
				solucion2 = (-(b) - raiz) / (2 * a);
				
				System.out.println("SOLUCION DE LA ECUACION DE SEGUNDO GRADO");
				System.out.println();
				System.out.println("Valores de los coeficientes");
				System.out.println();
				System.out.println("a = " + a + ", b = " + b + ", c = " + c);
				System.out.println();
				
				if (solucion1 == solucion2) {
					System.out.println("Una unica raiz de valor doble");
					System.out.println("x = " + solucion1);
				} else {
					System.out.println("Dos raices de valores");
					System.out.println("x1 = " + solucion1);
					System.out.println("x2 = " + solucion2);
				}
				
			} else {
				System.out.println("No tiene solucion real");
			}
			
		} else if (a == 0){
			System.out.println("No es una ecuacion de segundo grado");
		}
		
		
		
	}

}
