package org.ip.sesion04;
import java.util.Scanner;

public class DivisoresPrimos {

	static int numero = 0;
	static Scanner entrada = new Scanner(System.in);
	
	public static boolean esPrimo(int numero) {
		// TODO Auto-generated method stub
		
		boolean primo = false;
		
		int raizNumero = 0;
		int numeroVecesResto0 = 0;
		
		raizNumero = (int) Math.sqrt(numero);
		
		for(int i = 1; i <= raizNumero; i++) {
			if(numero % i == 0) {
				numeroVecesResto0++;
			}
		}
		
		if(numeroVecesResto0 < 2) {
			primo = true;
		}
		
		return primo;
	}
	
	public static void divisoresPrimos(int numero) {
		
		System.out.print("Los divisores primos de " + numero + " son: ");
		
		for(int i = 2; i <= numero; i++) {
			if((numero % i) == 0) {
				if(esPrimo(i)) {
					System.out.print(i + " ");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.print("Introduzca un numero: ");
		numero = entrada.nextInt();
		
		divisoresPrimos(numero);
	}

}
