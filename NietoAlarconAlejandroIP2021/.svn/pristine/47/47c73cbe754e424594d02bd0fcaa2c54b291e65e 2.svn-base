package org.ip.sesion04;
import java.util.Scanner;

public class PrintCalendario {
	
	public static int [] meses31Dias = {1, 3, 5, 7, 8, 10, 12};
	
	public static String [] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
								"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	public static Scanner entrada = new Scanner(System.in);
	
	public static int diasMes = 0;

	
	public static boolean esBisiesto(int anio) {
		
		boolean anioBien = false;
		
		if (((anio % 4 == 0) && ((anio % 100) != 0)) || ((anio % 400) == 0)) {
			anioBien = true;
		}
		//System.out.println("debug anio bisiesto --> " + anioBien);
		return anioBien;
	}
	
	public static int getNumeroTotalDeDiasDelMes(int anio, int mes) {
		
		int diasMes = 0;
		if(mes == 2) {
			if(esBisiesto(anio)) {
				diasMes = 29;
			} else {
				diasMes = 28;
			}
			
		} else {
			
			boolean encontrado = false;
			for(int i = 0; i < meses31Dias.length; i++) {
				if(meses31Dias[i] == mes) {
					encontrado = true;
				}
			}
			
			if(encontrado){
				diasMes = 31;
			} else {
				diasMes = 30;
			}
			
		}
		
		return diasMes;		
				
	}
	
	
	public static int getDiaInicio(int d, int m, int y) {
		
		int dia = 0;
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 * ((14-m) / 12) - 2;
		int d0 = (d + x +(31 * m0) / 12) % 7;
		
		return d0;
		
	}
	
	public static String getNombreMes(int mes) {
		return nombreMeses[mes - 1];
	}
	
	public static void printMes(int anio, int mes) {
		System.out.println("\t\t\t" + getNombreMes(mes) + " " + anio);
	}
	
	public static void printCuerpoMes(int anio, int mes) {
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\tLun" + "\tMar" + "\tMie" + "\tJue" + "\tVie" + "\tSab" + "\tDom");
		
		String espacios = "";
		int numDia = getDiaInicio(1, mes, anio);
		
		if(numDia == 0) {
			numDia = 7;
		}
		
		for(int i = 0; i < numDia; i++) {
			espacios += "\t";
		}
		
		if(numDia == 7) {
			System.out.println(espacios + 1);
			numDia = 0;
		} else {
			System.out.print(espacios + 1);
		}
		
		
		for(int i = 2; i <= diasMes; i++){
			
			System.out.print("\t" + i);
			numDia++;
			if(numDia == 7) {
				numDia = 0;
				System.out.println();
			}
			
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anio = 0;
		int mes = 0;
		
		
		System.out.print("Introduzca un anio completo (e.g., 2001): ");
		anio = entrada.nextInt();
		
		System.out.print("Introduzca un mes como un numero entre 1 y 12: ");
		mes = entrada.nextInt();
		
		diasMes = getNumeroTotalDeDiasDelMes(anio, mes);
		printMes(anio, mes);
		printCuerpoMes(anio, mes);
		
		
		
	}

}
