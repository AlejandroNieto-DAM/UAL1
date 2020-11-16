package org.ip.sesion06;

public class TestReloj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj rel1 = new Reloj();
		
		rel1.setHora(23);
		rel1.setMinuto(59);
		rel1.setSegundo(59);
		
		rel1.mostrarReloj();
		rel1.incrementarSegundo();
		rel1.mostrarReloj();
		
		System.out.println();
		
		Reloj rel2 = new Reloj(24, 60, 60);
		rel2.mostrarReloj();
		rel2.incrementarHora();
		rel2.incrementarMinuto();
		rel2.incrementarSegundo();
		rel2.mostrarReloj();
		
		System.out.println();
		
		Reloj rel3 = new Reloj(rel1);
		rel3.mostrarReloj();
		
		for(int i = 0; i < 86400; i++) {
			rel3.incrementarSegundo();
		}
		
		rel3.mostrarReloj();
		
		System.out.println();
		
		Reloj rel4 = new Reloj(rel1);
		rel4.mostrarReloj();
		
		for(int i = 0; i < 1440; i++) {
			rel4.incrementarMinuto();
		}
		
		rel4.mostrarReloj();
			
		System.out.println();
		
		Reloj rel5 = new Reloj(rel1);
		rel5.mostrarReloj();
		
		for(int i = 0; i < 24; i++) {
			rel5.incrementarHora();
		}
		
		rel5.mostrarReloj();
		
	}

}
