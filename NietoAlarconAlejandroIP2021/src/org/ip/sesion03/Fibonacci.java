package org.ip.sesion03;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int primerTermino = 0;
		int segundoTermino = 1;
		
		int terminoDeLaSerie = 0;
		
		int numeroAMostrar = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Hasta que termino de la serie de Fibonacci quieres mostrar?");
			terminoDeLaSerie = entrada.nextInt();
		}
		while(terminoDeLaSerie <= 0);
		
		for(int i = 0; i <= terminoDeLaSerie; i++) {
			if(i == 0) {
				System.out.print(primerTermino + " ");
			}
			
			if(i == 1) {
				System.out.print(segundoTermino + " ");
			}
			
			if(i > 1) {
				numeroAMostrar = primerTermino + segundoTermino;
				primerTermino = segundoTermino;
				segundoTermino = numeroAMostrar;
				System.out.print(numeroAMostrar + " ");
			}
		}
		
	}

}
