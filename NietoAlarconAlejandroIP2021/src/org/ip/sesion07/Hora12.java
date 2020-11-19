package org.ip.sesion07;

public class Hora12 extends Hora {

	protected enum Meridiano { AM, PM }
	
	protected Meridiano mer;
	
	public Hora12(int hora, int minuto) {
		super(hora, minuto);
		
		
		if(this.hora >= 13) {
			mer = Meridiano.PM;
		} else {
			mer = Meridiano.AM;
		}
		
	}
	
	public void setHora(int hora) {
		this.setHora(hora);
	}
	
	public void incrementar() {
		super.incrementar();
		
		if(this.hora >= 13) {
			mer = Meridiano.PM;
		} else {
			mer = Meridiano.AM;
		}
		
	}
	
	public String toString() {
		
		int hora12 = 0;
		
		if(this.hora >= 13) {
			hora12 = this.hora - 12;
		} else {
			hora12 = this.hora;
		}
		
		
		String salida = hora12 + ":" + this.minuto + " " + mer;
		return salida;
		
	}
	
	

	
}
