package org.mp.sesion05;

public class Busqueda {
	
	private int [] datos;
	private int numSearched;
	
	public Busqueda(int i) {
		this.datos = new int [i];
	}

	public void setDatos(int[] datos) {
		this.datos = datos.clone();
	}

	public void setNumBuscado(int i) {
		this.numSearched = i;
	}

	public int[] getDatos() {
		return datos;
	}

	public int getNumSearched() {
		return numSearched;
	}



	public void setNumSearched(int numSearched) {
		this.numSearched = numSearched;
	}
		
}
