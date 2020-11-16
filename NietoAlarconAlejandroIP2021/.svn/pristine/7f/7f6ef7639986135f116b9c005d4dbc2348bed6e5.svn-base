package org.ip.sesion06;

public class Reloj {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Reloj() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}
	
	public Reloj(int hora, int minuto, int segundo) {
		if(hora < 0 || hora > 23) {
			this.hora = 0;
		} else {
			this.hora = hora;
		}
		
		if(minuto < 0 || minuto > 59) {
			this.minuto = 0;
		} else {
			this.minuto = minuto;
		}
		
		if(segundo < 0 || segundo > 59) {
			this.segundo = 0;
		} else {
			this.segundo = segundo;
		}
	}
	
	public Reloj(Reloj reloj) {
		this.hora = reloj.hora;
		this.minuto = reloj.minuto;
		this.segundo = reloj.segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora < 0 || hora > 23) {
			this.hora = 0;
		} else {
			this.hora = hora;
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto < 0 || minuto > 59) {
			this.minuto = 0;
		} else {
			this.minuto = minuto;
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if(segundo < 0 || segundo > 59) {
			this.segundo = 0;
		} else {
			this.segundo = segundo;
		}
		
	}
	
	public void mostrarReloj() {
		String hora = "";
		if(this.hora <= 9) {
			hora = "0" + this.hora;
		} else {
			hora = String.valueOf(this.hora);
		}
		
		String minutos = "";
		if(this.minuto <= 9) {
			minutos = "0" + this.minuto;
		} else {
			minutos = String.valueOf(this.minuto);
		}
		
		String segundos = "";
		if(this.segundo <= 9) {
			segundos = "0" + this.segundo;
		} else {
			segundos = String.valueOf(this.segundo);
		}
		
		System.out.println(hora + ":" + minutos + ":" + segundos);
	}
	
	public void incrementarHora() {
		if(this.hora == 23) {
			this.hora = 0;
		} else {
			this.hora += 1;
		}
	}
	
	public void incrementarMinuto() {
		if(this.minuto == 59) {
			this.minuto = 0;
			this.incrementarHora();
		} else {
			this.minuto += 1;
		}
	}
	
	public void incrementarSegundo() {
		if(this.segundo == 59) {
			this.segundo = 0;
			this.incrementarMinuto();
		} else {
			this.segundo += 1;
		}
	}
}
