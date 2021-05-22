package org.mp.sesion03;

public abstract class AbstractList<E> implements List<E> {

	protected int size = 0; // Tamano de la lista

	/** Crea una lista por defecto */
	protected AbstractList() {
		
	}

	/** Crea una lista a partir de un array de objetos */
	protected AbstractList(E[] objects) {
		System.out.println("Constructor por parametros AbstractList");
		for (int i = 0; i < objects.length; i++)
					add(objects[i]);
	}

	/** Anade un nuevo elemento al final de la lista */
	public void add(E e) {
		System.out.println("Add AbstractList");
		add(size, e);
	}

	/** Devuelve true si la lista no contiene ningun elemento */
	public boolean isEmpty() {
		return size == 0;
	}

	/** Devuelve el numero de elementos de la lista */
	public int size() {
		return size;
	}

	/**
	 * Elimina la primera ocurrencia del elemento e de la lista. Desplaza la
	 * subsecuencia de elementos a la izquierda.
	 *  Devuelve true si el elemento se elimino.
	 */
	public boolean remove(E e) {
		if (indexOf(e) >= 0) {
			remove(indexOf(e));
			return true;
		} else
			return false;
	}
}
