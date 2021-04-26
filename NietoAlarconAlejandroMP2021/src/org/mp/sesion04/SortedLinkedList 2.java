package org.mp.sesion04;

import java.util.Iterator;

import org.mp.sesion03.LinkedList;

public class SortedLinkedList<E extends Comparable<E>> extends LinkedList<E> {
	
	public SortedLinkedList() {
		super();
	}
	
	public SortedLinkedList(Comparable<E>[] objects) {
		super();
		for(int i = 0; i < objects.length; i++) {
			addSorted(objects[i]);
		}
	}
	
	public void addFirst(E o) {
		throw new UnsupportedOperationException("No garantiza orden");
	}
	
	public void addLast(E o) {
		throw new UnsupportedOperationException("No garantiza orden");
	}
	
	public void add(E o) {
		throw new UnsupportedOperationException("No garantiza orden");
	}
	
	public void add(int index, E o) {
		throw new UnsupportedOperationException("No garantiza orden");
	}
	
	public E set(int index, E o) {
		throw new UnsupportedOperationException("No garantiza orden");
	}
	
	
	public void addSorted(Comparable<E> e) {
		
		if((super.size() == 0) || (super.getFirst().compareTo((E) e) > 0)) {
			super.addFirst((E) e);
		} else if (super.getLast().compareTo((E) e) <= 0) {
			super.addLast((E) e);
		} else {
			Iterator<E> iterador = super.iterator();
			int index = 0;
			boolean finded = false;
			while(iterador.hasNext() ) {
				if(iterador.next().compareTo((E) e) < 0) {
					index++;
				}
			}
			super.add(index,(E) e);
		}
	
	}
	
	public String toString() {
		return "Lista ordenada: " + super.toString();
	}
}
