package org.mp.sesion02;


public class Busqueda {

	public static <E> int busquedaBinaria2(E[] object, E object2) throws ExcepcionArrayVacio{
		if(object.length == 0) {
			throw new ExcepcionArrayVacio("Array vacío");
		}
		
		int position = -1;
		
		for(int i = 0;  i < object.length; i++) {
			if(object[i].equals(object2)) {
				position = i;
			}
		}
		
		return position;


	}
	
	public static <E extends Comparable> int busquedaBinaria(E[] object, E object2) throws ExcepcionArrayVacio {
		
		if(object.length == 0) {
			throw new ExcepcionArrayVacio("Array vacío");
		}
		
		int inicio = 0;
		int fin = object.length - 1;
		int pos;
		while (inicio <= fin) {
			pos = (inicio + fin) / 2;
			if (object[pos].equals(object2))
				return pos;
			else if (object[pos].compareTo(object2) < 0) {
				inicio = pos + 1;
			} else {
				fin = pos - 1;
			}
		}
		return -1;
	}
		

	
}
