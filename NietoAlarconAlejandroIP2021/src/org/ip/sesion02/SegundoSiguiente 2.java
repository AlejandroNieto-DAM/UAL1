package org.ip.sesion02;

public class SegundoSiguiente {

	
	public static void main(String[] args) {
		
		int horas = 23;
		int minutos = 59;
		int segundos = 59;
		
		String sHoras = "00";
		String sMinutos = "00";
		String sSegundos = "00";
		
		int segundosTotales = 0;
		
		System.out.println("Instante de tiempo actual: " + horas + ":" + minutos + ":" + segundos);
		
		segundosTotales = segundos + (minutos * 60) + (horas * 3600);
		segundosTotales += 1;
		
		horas = segundosTotales / 3600;
		
		segundosTotales = segundosTotales % 3600;
		
		minutos = segundosTotales / 60;
		
		segundosTotales = segundosTotales % 60;
		
		segundos = segundosTotales;
		
		if (horas >= 24) {
			horas -= 24;
		}
		
		sHoras = String.valueOf(horas);
		sMinutos = String.valueOf(minutos);
		sSegundos = String.valueOf(segundos);

		if (sHoras.equals("0")) {
			sHoras = "00";
		}
		
		if (sMinutos.equals("0")) {
			sMinutos = "00";
		}
		
		if (sSegundos.equals("0")) {
			sSegundos = "00";
		}
		
		
		System.out.println("Instante de tiempo un segundo despues: " + sHoras + ":" + sMinutos + ":" + sSegundos);

	}
}
