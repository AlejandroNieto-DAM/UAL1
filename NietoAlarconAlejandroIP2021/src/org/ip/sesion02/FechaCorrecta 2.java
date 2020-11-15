package org.ip.sesion02;

public class FechaCorrecta {

	public static void main(String[] args) {

		int anio = 2020;
		int mes = 12;
		int dia = 31;
		
		String output = "Fecha incorrecta - ";
		String fecha = dia + "/" + mes + "/" + anio;
		
		if (anio >= 1500 && anio <= 3000) {
			
			if (mes >= 1 && mes <= 12) {
				
				if (dia >= 1 && dia <= 31) {
					if (((anio % 4 == 0) && ((anio % 100) != 0)) || ((anio % 400) == 0)) {
						output = "Fecha correcta: ";
					}
					
					System.out.println(output + fecha);
				
				} else {	
					System.out.println(output + fecha);
				}
					
			} else {
				System.out.println(output + fecha);
			}
							
		} else {
			System.out.println(output + fecha);
		}
		
	}

}
