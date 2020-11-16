package org.ip.sesion06;

public class TestCirculoExtension {

	public static void main(String[] args) {

		Circulo circ1 = new Circulo(1.0, 1.0, 1.0);
		Circulo circ2 = new Circulo();
		Circulo circ3 = new Circulo(0.0, 0.0);
		Circulo circ4 = new Circulo(circ3);
		Circulo circ5 = new Circulo(2.0, 2.0, 5.0);
		Circulo circ6 = new Circulo(3.0, 3.0, 1.0);
		
		System.out.println("*** Extension del programa permite trabajar con circuitos ***");
		System.out.println();
		System.out.println("Circulo 1 " + circ1.toString());
		System.out.println("Circulo 2 " + circ2.toString());
		System.out.println("Circulo 3 " + circ3.toString());
		System.out.println("Circulo 4 " + circ4.toString());
		System.out.println();
		
		circ4.desplazar(1, 1);;
		circ4.setRadio(1);
		
		System.out.println("Circulo 4 " + circ4.toString());
		if(circ1.equals(circ4)) {
			System.out.println("Circulos 1 y 4 son iguales");
		}
		
		System.out.println();
		
		circ1.setRadio(2.5);
		
		System.out.println("Circulo 1 " + circ1.toString());
		
		if(!circ1.estaDentro(3, 3)) {
			System.out.println("El punto (3.0, 3.0) no esta dentro del circulo 1");
		}
		
		System.out.println();
		
		System.out.println("Circulo 5 " + circ5.toString());
		System.out.println("Circulo 6 " + circ6.toString());
		
		if(circ5.contiene(circ6)) {
			System.out.println("El circulo 5 contiene al circulo 6");
		}
		
		if(circ1.solapa(circ6)) {
			System.out.println("El circulo 1 solapa con el circulo 6");
		}
		
		if(circ4.sonDisjuntos(circ6)) {
			System.out.println("El circulo 4 el circulo 6 son disjuntos");
		}

			
		System.out.println("El numero de circulos creados es " + Circulo.getNumCirculos());
		
	}

}
