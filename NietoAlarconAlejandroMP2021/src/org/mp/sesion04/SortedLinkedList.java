package org.mp.sesion04;

import org.mp.sesion03.LinkedList;

public class SortedLinkedList<E extends Comparable<E>> extends LinkedList<E> {
	
	public SortedLinkedList() {
		super();
	}
	
	public SortedLinkedList(Comparable<E>[] objects) {
		super();
		/*
		for(int i = 0; i < objects.length; i++) {
			for(int j = 0; j < objects.length; j++) {
				if(objects[i].compareTo((E) objects[j]) > 0) {
					E aux = (E) objects[i];
					objects[i] = objects[j];
					objects[j] = aux;
				}
			}
		}*/
		
		
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
		
	}
	
	public String toString() {
		return "Lista ordenada:" + super.toString();
	}
}
