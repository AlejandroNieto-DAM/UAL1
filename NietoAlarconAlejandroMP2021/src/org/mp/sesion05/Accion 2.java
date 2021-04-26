package org.mp.sesion05;


public class Accion implements Comparable<Accion>{

		private String nombre;
		private long volumen;
		
		public Accion(String nombre, long volumen) {
			this.nombre = nombre;
			this.volumen = volumen;
		}

		public String getNombre() {
			return nombre;
		}

		public long getVolumen() {
			return volumen;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setVolumen(long volumen) {
			this.volumen = volumen;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Accion))
				return false;
			Accion otro = (Accion) obj;
			if (nombre != otro.nombre)
				return false;
			if (volumen != otro.volumen)
				return false;
			return true;
	
			
		}
		
		@Override
		public String toString() {
			return "";
		}
		

		@Override
		public int compareTo(Accion arg0) {
			Accion otro = (Accion) arg0;

			if (this.volumen > otro.volumen)
				return 1;
			else if (this.volumen < otro.volumen)
				return -1;
			else
				return 0;
		}
		
}
