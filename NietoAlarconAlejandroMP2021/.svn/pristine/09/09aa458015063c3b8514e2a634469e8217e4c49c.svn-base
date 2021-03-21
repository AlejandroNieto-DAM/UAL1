package org.mp.sesion02;


public class Busqueda {
	
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
