package org.mp.sesion03;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> extends AbstractList<E> {

	private static final int CAPACIDAD_INICIAL = 16;
	private E[] data = (E[]) new Object[CAPACIDAD_INICIAL];

	/**
	 * Crea una lista por defecto
	 */
	public ArrayList() {

	}

	/**
	 * Crea una lista a partir de un array de objetos
	 * 
	 * @param objects which is the array of objects we want to create an array list
	 */
	public ArrayList(E[] objects) {
		System.out.println("Constructor por parametros ArrayList");
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
	}

	@Override
	/**
	 * Añade un nuevo elemento en la posición index
	 * 
	 * @param index es el indice donde queremos aniadir el objeto
	 * @param e es el nuevo objeto que queremos aniadir
	 */
	public void add(int index, E e) {
		System.out.println("Add ArrayList con index");

		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Indice: " + index + ", Tamaño: " + size);
		}
		ensureCapacity();

		// Mueve los elementos a la derecha desde la posición especificada por index
		for (int i = size - 1; i >= index; i--)
			data[i + 1] = data[i];

		// Inserta un nuevo elemento en data[index]
		data[index] = e;

		// Incrementa el tamaño en 1
		size++;
	}

	/**
	 * Crea un nuevo array con el doble tamaño más 1 si el vector esta lleno
	 */
	private void ensureCapacity() {

		if (size == data.length) {
			E[] aux = (E[]) new Object[data.length * 2 + 1];
			System.arraycopy(data, 0, aux, 0, size);
			data = aux;
		}

	}

	/**
	 * Elimina todos los elementos de la lista
	 */
	@Override
	public void clear() {

		for (int i = 0; i < data.length; i++) {
			data[i] = null;
		}

		size = 0;

	}

	@Override
	/**
	 * Devuelve true si la lista contiene el elemento
	 * @param e que es el objeto que se desea saber si la lista lo contiene
	 * @return retorna un boolean con true o false si el elemento se encuentra en la
	 *         lista o no
	 */
	public boolean contains(E e) {
		boolean finded = false;
		for (int i = 0; i < size; i++) {
			if (data[i].equals(e)) {
				finded = true;
			}
		}
		return finded;
	}

	@Override
	/**
	 * Devuelve el elemento en la posición index especificada
	 * @param index que es el indice al que se pretence acceder
	 * @return retorna el elemento de la posicion especificada
	 */
	public E get(int index) {
		checkIndex(index);
		return data[index];
	}

	/**
	 * Comprueba si el indice esta dentro de los limites de la lista
	 * 
	 * @param index es el indice al que se quiere acceder
	 */
	private void checkIndex(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Indice: " + index + ", Tamaño: " + size);
	}

	@Override
	/**
	 * Devuelve el índice de la primera ocurrencia del elemento en la lista.
	 * Devuelve -1 si no está.
	 * @param e que es el objeto que se desea encontrar en la lista.
	 * 
	 * @return retorna el indice del primer elemento que se cuentre como el que se pasa por parametro
	 */
	public int indexOf(E e) {
		if (size <= 0) {
			return -1;
		}

		int position = -1;
		boolean finded = false;

		for (int i = 0; i < data.length && finded == false; i++) {
			if (data[i].equals(e)) {
				position = i;
				finded = true;
			}

		}

		return position;
	}

	@Override
	/**
	 * Devuelve el índice de la ultima ocurrencia del elemento en la lista.
	 * Devuelve -1 si no está.
	 * @param e que es el objeto que se desea encontrar en la lista.
	 * 
	 * @return retorna el indice del ultimo elemento que se cuentre como el que se pasa por parametro
	 */
	public int lastIndexOf(E e) {

		if (size <= 0) {
			return -1;
		}

		int position = -1;
		boolean finded = false;

		for (int i = size; i > 0 && finded == false; i--) {
			if (data[i - 1].equals(e)) {
				position = (i - 1);
				finded = true;
			}
		}

		return position;
	}

	@Override 
	/**
	 * Elimina el elemento en la posición especificada en la lista. Desplaza la
	 * subsecuencia de elementos a la izquierda. Devuelve el elemento eliminado.
	 * @param index que es el indice al que se pretence acceder para borrar el objeto que contiene
	 * @return retorna el objeto eliminado 
	 */
	public E remove(int index) {
		this.checkIndex(index);
		E aux = data[index];

		for (int i = index; i < size - 1; i++) {
			data[i] = data[i + 1];
		}

		size--;

		return aux;
	}

	@Override 
	/**
	 * Sustituye el elemento de la posición especificada en la lista por el elemento
	 * especificado.
	 * @param index es el indice al que se pretence acceder para cambiar su valor
	 * @param e que es el objeto por el que queremos cambiar la posicion de la lista
	 * @return retorna el valor antiguo del indice que se paso por parametros 
	 */
	public E set(int index, E e) {
		checkIndex(index);
		E antiguo = data[index];
		data[index] = e;
		return antiguo;
	}

	@Override
	/**
	 * Sobreescritura del metodo toString para retornar todos elemetos que contiene la lista.
	 * @return una cadena con todos los elementos de la lista 
	 */
	public String toString() {
		StringBuilder resultado = new StringBuilder("[");

		for (int i = 0; i < size; i++) {
			resultado.append(data[i]);
			if (i < size - 1)
				resultado.append(", ");
		}

		return resultado.toString() + "]";
	}

	/** 
	 * Ajusta la capacidad del array al tamaño de la lista 
	 */
	public void trimToSize() {

		if (this.CAPACIDAD_INICIAL == size) {
			throw new RuntimeException("Guapit@ no necesitas hacer un trim, el tamaño coincide con la capacidad");
		}

		E[] aux = (E[]) new Object[this.CAPACIDAD_INICIAL];

		int contador = 0;

		for (int i = 0; i < size || i < contador; i++) {
			aux[i] = data[i];
			contador++;
		}

		data = aux;
		size = contador;
	}

	@Override 
	/** 
	 * Sobre-escribe el método iterator() definido en Iterable
	 * @return Devuelve una instancia de ArrayListIterator
	 */
	public Iterator<E> iterator() {
		return new ArrayListIterator();
		
	}

	private class ArrayListIterator implements Iterator<E> {

		private int util = 0;

		@Override
		/**
		 * Metodo que devuelve un booleano para saber si tiene un elemento siguiente o no
		 * @return Devuelve un boolean que contiene true o false dependiendo de si hay siguiente elemento o no
		 */
		public boolean hasNext() {
			return util < size;
		}

		@Override
		/**
		 * Devuelve el elemento en el indice util
		 * @return Devuelve el elemento en el indice y avanza al siguiente
		 */
		public E next() {
			if (util >= size) {
				throw new NoSuchElementException("No hay más elementos en la lista");
			}

			E aux = data[util];
			util++;

			return aux;
		}

		@Override
		/**
		 * Elimina el objeto que se encuentra en el indice util
		 */
		public void remove() {
			// System.out.println("Util " + util + " Size " + size);
			ArrayList.this.remove(util);
		}

	}

}