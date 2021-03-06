package org.ip.sesion04;
import java.util.Scanner;

public class ValidarFecha {

	public static boolean esBisiesto(int anio) {
		
		boolean anioBien = false;
		
		if (((anio % 4 == 0) && ((anio % 100) != 0)) || ((anio % 400) == 0)) {
			anioBien = true;
		}
		//System.out.println("debug anio bisiesto --> " + anioBien);
		return anioBien;
	}

	public static boolean esFechaCorrecta(int dia, int mes, int anio) {
		
		boolean mesBien = false;
		boolean diaBien = false;
		boolean anioBien = true;
		
		boolean fechaBien = false;
		
		
		if (mes >= 1 && mes <= 12) {
			mesBien = true;
			
			if(mes == 2) {
				if (dia >= 1 && dia <= 31) {
					diaBien = true;
					
					if(dia == 29) {
						anioBien = esBisiesto(anio);
					}
				}
			}
			
			if (dia >= 1 && dia <= 31) {
				diaBien = true;
			}
			
		}
	
		
		if(mesBien && diaBien && anioBien) {
			fechaBien = true;
		}
		
		//System.out.println("debug fechabien --> " + fechaBien);
		return fechaBien;
	}
	
	
	
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		int dia = 0;
		int mes = 0;
		int anio = 0;
		
		boolean isFechaBien  = false;

		do {	
		
			System.out.println("Introduce el dia");
			dia = entrada.nextInt();
			
			System.out.println("Introduce el mes");
			mes = entrada.nextInt();
			
			System.out.println("Introduce el anio");
			anio = entrada.nextInt();
			
			isFechaBien = esFechaCorrecta(dia, mes, anio);
			
			if(isFechaBien) {
				System.out.println("FECHA CORRECTA");
			} else {
				System.out.println("FECHA INCORRECTA, INTRODUCE NUEVOS VALORES");
			}
		
		} while(isFechaBien == false);
			

		
	}
}
