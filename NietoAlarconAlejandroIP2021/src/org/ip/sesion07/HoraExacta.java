package org.ip.sesion07;

public class HoraExacta extends Hora implements Comparable {

	public int segundo;
	
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.segundo = segundo;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	@Override
	public void incrementar() {
		
		if(this.segundo == 59) {
			this.segundo = 0;
			super.incrementar();
		} else {
			this.segundo += 1;
		}
		
	}
	
	@Override
	public String toString() {
		
		String salida = super.toString();
		
	
		
		salida += ":" + this.segundo;
		
		return salida;
	}
	
	@Override
	public boolean equals(Object obj) {
			
		boolean iguales = false;

		if(obj instanceof HoraExacta) {
			HoraExacta horaE = (HoraExacta) obj;
			
			if(this.hora == horaE.hora  && this.minuto == horaE.minuto && this.segundo == horaE.segundo) {
				iguales = true;
			}
		}
		
		return iguales;
		
	}



	@Override
	public int compareTo(Object arg0) {
		int soy = 0;

		if(arg0 instanceof HoraExacta) {
			HoraExacta momentoE = (HoraExacta) arg0;
			
			if(momentoE.getHora() > this.getHora()) {
				soy = 0;
			} else if(momentoE.getHora() < this.getHora()) {
				soy = 1;
			} else {
				if(momentoE.getMinuto() > this.getMinuto()) {
					soy = 0;
				} else if(momentoE.getMinuto() < this.getMinuto()) {
					soy = 0;
				} else {
					if(momentoE.getMinuto() > this.getMinuto()) {
						soy = 0;
					} else if(momentoE.getMinuto() < this.getMinuto()) {
						soy = 0;
					} else {
						if(momentoE.getSegundo() > this.getSegundo()) {
							soy = 0;
						} else if(momentoE.getSegundo() < this.getSegundo()) {
							soy = 1;
						} else {
							soy = -1;
						}
					}
				}
			}
		}
		
		
		return soy;
	}

	
}
