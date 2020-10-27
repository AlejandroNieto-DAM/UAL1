package org.ip.sesion04;

import java.util.Scanner;

public class GenerarPrimos {

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
	
	
	public static void main(String[] args) {
		
		int [] numerosPrimos = new int [50];
		
		int contador = 0;
		int iterador = 2;
		
		do {
			
			if(esPrimo(iterador)) {
				numerosPrimos[contador] = iterador;
				contador++;
			}
			
			iterador++;
			
		} while (contador < 50);
		
		System.out.println("Los 50 primeros numeros primos son: ");
		System.out.println();
		
		int espaciosCada10 = 0;
		
		for(int i = 0; i < numerosPrimos.length; i++) {
			System.out.print(numerosPrimos[i] + "\t");
			
			espaciosCada10++;
			
			if(espaciosCada10 == 10) {
				System.out.println();
				espaciosCada10 = 0;
			}
			
			
		}

	}

}
