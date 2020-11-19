package org.ip.sesion07;

public class TestHora {

	public static void main(String[] args) {

		Hora h1 = new Hora(11, 30);
		Hora12 h2 = new Hora12(11, 10);
		HoraExacta h3 = new HoraExacta(0, 0, 31);
		
		System.out.println("Hora del reloj: " + h1.toString());
		
		for(int i = 1; i <= 61; i++) {
			h1.incrementar();
		}
		
		System.out.println("Hora del reloj: " + h1.toString());

		for(int i = 1; i <= 11*60; i++) {
			h1.incrementar();
		}
		
		System.out.println("Hora del reloj: " + h1.toString());
		
		for(int i = 1; i <= 61; i++) {
			h1.incrementar();
		}
		
		System.out.println("Hora del reloj: " + h1.toString());

		System.out.println();
		
		System.out.println("Hora del reloj12: " + h2.toString());
		
		for(int i = 1; i <= 61; i++) {
			h2.incrementar();
		}
		
		System.out.println("Hora del reloj12: " + h2.toString());
		System.out.println("Hora del reloj12: " + h2.toString());
		
		for(int i = 1; i <= 61; i++) {
			h2.incrementar();
		}
		
		System.out.println("Hora del reloj12: " + h2.toString());

		System.out.println();
		
		System.out.println("Hora exacta del reloj: " + h3.toString());
		
		for(int i = 1; i <= 61; i++) {
			h3.incrementar();
		}
		
		System.out.println("Hora exacta del reloj: " + h3.toString());
		
		for(int i = 1; i <= (86400 - 3600); i++) {
			h3.incrementar();
		}
		
		System.out.println("Hora exacta del reloj: " + h3.toString());
		
		for(int i = 1; i <= 4000; i++) {
			h3.incrementar();
		}
		
		System.out.println("Hora exacta del reloj: " + h3.toString());
		
		System.out.println();
		
		HoraExacta momentoExacto1 = new HoraExacta (1, 2, 3);
		HoraExacta momentoExacto2 = new HoraExacta (1, 2, 3);
		HoraExacta momentoExacto3 = new HoraExacta (10, 20, 30);
		
		System.out.println("COMPROBACION DE MOMENTOS EXACTOS");
		System.out.println("Los momentos exactos son: " + momentoExacto1.toString() + ", " + momentoExacto2.toString() + " y " + momentoExacto3.toString());
		
		if(momentoExacto1.equals(momentoExacto2)) {
			System.out.println(momentoExacto1.toString() + " ES IGUAL " + momentoExacto2.toString());
		}
		
		if(!momentoExacto1.equals(momentoExacto3)) {
			System.out.println(momentoExacto1.toString() + " NO ES IGUAL " + momentoExacto2.toString());
		}
		
		if(momentoExacto1.compareTo(momentoExacto3) == 0) {
			System.out.println(momentoExacto1.toString() + " ES MENOR QUE " + momentoExacto2.toString());
		}
		
		if(momentoExacto3.compareTo(momentoExacto1) == 1) {
			System.out.println(momentoExacto1.toString() + " ES MAYOR QUE " + momentoExacto2.toString());
		}
		
		if(momentoExacto1.compareTo(momentoExacto2) == -1) {
			System.out.println(momentoExacto1.toString() + " ES IGUAL " + momentoExacto2.toString());
		}

	}

}
