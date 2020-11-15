package org.ip.sesion03;
import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int raizNumero = 0;
		int numeroVecesResto0 = 0;
		
		do {
			System.out.print("Introduce un numero (>1) para saber si es primo: ");
			numero = entrada.nextInt();
		}while(numero <= 1);
		
		raizNumero = (int) Math.sqrt(numero);
		
		for(int i = 1; i <= raizNumero; i++) {
			if(numero % i == 0) {
				numeroVecesResto0++;
			}
		}
		
		if(numeroVecesResto0 >= 2) {
			System.out.println("NO ES PRIMO");
		} else {
			System.out.println("ES PRIMO");
		}
		
	}

}
