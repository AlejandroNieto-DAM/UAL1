package org.mp.sesionexamenmayo.p1;

public abstract class AbstractList<E> implements List<E> {

	protected int size = 0; // Tamano de la lista

	/** Crea una lista por defecto */
	protected AbstractList() {
	}

	/** Crea una lista a partir de un array de objetos */
	protected AbstractList(E[] objects) {
		for (int i = 0; i < objects.length; i++)
					add(objects[i]);
	}

	/** Anade un nuevo elemento al final de la lista */
	public void add(E e) {
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

	public boolean remove(E e) {
		if (indexOf(e) >= 0) {
			remove(indexOf(e));
			return true;
		} else
			return false;
	}
	
	// 
	/**
	 * 
	 * @author alejandronietoalarcon
	 * @version 1.0
	 * Aniade los elementos de otraLista a continuacion del final de la lista actual
	 * @param otraLista que es la lista de elementos que queremos aniadir a la lista actual.
	 * 
	 */
	public void addAll(List<E> otraLista) {
		if (otraLista.size() == 0) {
			throw new RuntimeException("La lista no ha cambiado, otraLista está vacía");
		}

		for (int i = 0; i < otraLista.size(); i++) {
			add(otraLista.get(i));
		}

	}

	// Elimina todos los elementos de otraLista de la lista
	// Devuelve verdadero si la lista cambia como resultado de la llamada
	public boolean removeAll(List<E> otraLista) {

		boolean changes = false;
		for (int i = 0; i < otraLista.size(); i++) {
			if (remove(otraLista.get(i))) {
				changes = true;
			}
		}

		return changes;
	}

}
