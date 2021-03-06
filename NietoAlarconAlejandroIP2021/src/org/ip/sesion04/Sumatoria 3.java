package org.ip.sesion04;
import java.util.Scanner;

public class Sumatoria {
	
	static int numeroSumatoria = 0;
	static Scanner entrada = new Scanner(System.in);
	
	public static int sumaDirecta(int x) {
		int sumatoria = x * (x  + 1) / 2;
		return sumatoria;
	}
	
	public static int sumaIterativa(int x) {
		int sumatoria = 0;
		for(int i = 0; i <= x; i++) {
			sumatoria += i;
		}
		
		return sumatoria;
	}
	
	public static int sumaRecursiva(int x) {
		if(x == 1) {
			return 1;
		} else {
			return x + sumaRecursiva(x - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca el numero de terminos que desea sumar");
		numeroSumatoria = entrada.nextInt();
		
		System.out.println("La suma usando el metodo iterativo de los " + numeroSumatoria + " primeros numeros es " + sumaIterativa(numeroSumatoria));
		System.out.println("La suma usando el metodo directo de los " + numeroSumatoria + " primeros numeros es " + sumaDirecta(numeroSumatoria));
		System.out.println("La suma usando el metodo recursivo de los " + numeroSumatoria + " primeros numeros es " + sumaRecursiva(numeroSumatoria));
	}

}
