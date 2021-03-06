package org.ip.sesion05;
import java.util.Scanner;

public class MatrizMagica {
	
	static Scanner entrada = new Scanner(System.in);
	static int [][] matriz = new int [4][4];
	
	public static boolean esMatrizMagica(int [][] matriz) {
		int sumatoria = 0;
		
		for(int i = 0; i < 1; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				sumatoria += matriz[i][j];
			}
		}
		
		boolean todasFilasSumanIgual = true;
		
		int sumatoriaFila = 0;
		for(int i = 0; i < matriz.length; i++) {
			
			if(todasFilasSumanIgual) {
				sumatoriaFila = 0;
				for(int j = 0; j < matriz[i].length; j++) {
					sumatoriaFila += matriz[i][j];
				}
				
				if(sumatoriaFila != sumatoria) {
					todasFilasSumanIgual = false;
				}
			}
		}
		
		
		int sumatoriaC = 0;
		
		for(int i = 0; i < 1; i++) {
			for(int j = 0; j < matriz.length; j++) {
				sumatoriaC += matriz[j][i];
			}
		}
				
		boolean todasColumnasSumanIgual = true;
		
		int sumatoriaColumna = 0;
		for(int i = 0; i < 4; i++) {
			
			if(todasColumnasSumanIgual) {
				sumatoriaColumna = 0;
				for(int j = 0; j < matriz.length; j++) {
					sumatoriaColumna += matriz[j][i];
				}
				
				if(sumatoriaColumna != sumatoriaC) {
					todasColumnasSumanIgual = false;
				}
			}
		}
		
	
		boolean magica = false;
		if(todasColumnasSumanIgual && todasFilasSumanIgual) {
			magica = true;
		}
		
		return magica;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("Matriz[" + i + "][" + j + "]: ");
				matriz[i][j] = entrada.nextInt();
				
			}
		}
		
		boolean magica = esMatrizMagica(matriz);
		
		if(magica) {
			System.out.println("La matriz es magica");
		} else {
			System.out.println("La matriz no es magica");
		}
	}

}
