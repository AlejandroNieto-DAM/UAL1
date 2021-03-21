package org.mp.sesion04;

public class GenericJosephus<E> {
	private int k;
	private int n;
	private GenericQueue<E> cola;
	
	
	public GenericJosephus(int k, int n, E[] objects) {
		this.k = k;
		this.n = n;
		
		cola = new GenericQueue<E>();
		
		if(objects != null) {
			for (int i = 0; i < objects.length; i++) {
				cola.enqueue(objects[i]);
			}
		}
		
	}
	
	public GenericQueue<E> getCola(){
		return cola;
	}
	
	public String toString() {
		return "Problema de Josephus: k=" + this.k + ", n=" + this.n + "\n" + cola.toString();
	}
	
	public String ordenEliminar(GenericQueue<E> cola) {
		
		if(this.n == 0) 
			throw new RuntimeException("No hay ninguna persona");
	
		
		if(this.n == 1) {
			return "Solo hay una persona";
		}
		
		int contador = 0;
		String stringSalidaOrdenEliminacion = "Orden de eliminación: " + "\n";		
		
		do {

			if(contador >= this.k - 1) {
				contador = 0;
				stringSalidaOrdenEliminacion += "Debe morir " + cola.dequeue() + "\n";
				this.n--;
			} 
			
			cola.enqueue(cola.dequeue());
			contador++;
			
		} while(this.n > 0);
		
		return stringSalidaOrdenEliminacion;
	}
	
}
