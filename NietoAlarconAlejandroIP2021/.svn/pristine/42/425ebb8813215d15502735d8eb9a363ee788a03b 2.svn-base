package org.ip.sesion07;

public class Hora {
	
	protected int hora;
	protected int minuto;
	
	public Hora(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}
	
	public void incrementar() {
		
		if(this.minuto == 59) {
			this.minuto = 0;
			
			if(this.hora == 23) {
				this.hora = 0;
			} else {
				this.hora += 1;
			}
			
		} else {
			this.minuto += 1;
		}
		
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	public String toString() {
	
		String salida = this.hora + ":" + this.minuto;
		return salida;
	}
}

