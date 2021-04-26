package org.lya.sesion07;

public class Subsecuencia {

	private int[] array;
	private int suma;
	private int primer;
	private int ultimo;
	
	public Subsecuencia(int numeroElementos) {
		int N = 51;
		array = new int[numeroElementos];
		for(int i = 0; i < numeroElementos; i++) {
			array[i] = (int) (Math.random() *2*N -N);
		}
		
		suma = 0;
		primer = 0;
		ultimo = 0;
	}
	
	public Subsecuencia(int [] arrayEnteros) {
		array = new int[arrayEnteros.length];
		for(int i = 0; i < arrayEnteros.length; i++) {
			array[i] = arrayEnteros[i];
		}
		
		suma = 0;
		primer = 0;
		ultimo = 0;
	}
	
	public int getPrimer() {
		return this.primer;
	}
	
	public int getUltimo() {
		return this.ultimo;
	}
	
	public int getSuma() {
		return this.suma;
	}
	
	
	public void SubsecuenciaFuerzaBruta() {
		suma = 0;
		primer = 0;
		ultimo = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 1; j < array.length; j++) {
				int sumaActual = 0;
				
				for(int k = i; k <= j; k++) {
					sumaActual += array[k];
				}
				
				if (sumaActual > suma) {
					suma = sumaActual;
					primer = i;
					ultimo = j;
				}
				
			}
		}
	}
	
	
	public void SubsecuenciaMejorado() {
		suma = 0;
		primer = 0;
		ultimo = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			int sumaActual = 0;
			
			for(int j = 0; j < array.length; j++) {
				sumaActual += array[j];
			
				if (sumaActual > suma) {
					suma = sumaActual;
					primer = i;
					ultimo = j;
				}
			
			}
			
		}
		
	}
	
	public void SubsecuenciaLineal() {
		suma = 0;
		primer = 0;
		ultimo = 0;
		
		int sumaActual = 0;
		
		for(int i = 0, j = 0; j < array.length; j++) {
			
			sumaActual += array[j];
				
			
			if (sumaActual > suma) {
				suma = sumaActual;
				primer = i;
				ultimo = j;
				
			} else if(sumaActual < 0) {
				i = j + 1;
				sumaActual = 0;
			}
			
			
			
		}
		
	}
	
	
	
}
