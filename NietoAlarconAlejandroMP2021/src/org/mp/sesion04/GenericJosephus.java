package org.mp.sesion04;

public class GenericJosephus<E> {
	private int k;
	private int n;
	private GenericQueue<E> cola;
	
	/**
	 * Constructor por parametros de la clase GenericJosephus
	 * @param k intervalo entre los que vamos a eliminar
	 * @param n total de instancias
	 * @param objects vector de objectos que utilizaremos 
	 */
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
	
	/**
	 * Devuelve la cola generada
	 * @return Devuelve la cola con los elementos que contenga
	 */
	public GenericQueue<E> getCola(){
		return cola;
	}
	
	@Override
	/**
	 * Sobreescritura del metodo toString para retornar todos elemetos que contiene la lista.
	 * @return una cadena con todos los elementos de la lista 
	 */
	public String toString() {
		return "Problema de Josephus: k=" + this.k + ", n=" + this.n + "\n" + cola.toString();
	}
	
	/**
	 * Metodo que borra los elementos de la cola en el intervalo k que tiene el objeto los elementos que no elimine
	 * los ira metiendo de nuevo en la cola hasta que finalmente sean eliminados
	 * @param cola es el vector con los elementos que iremos eliminando
	 * @return Devuelve un string con el orden de eliminacion de los elementos de la lista
	 */
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
