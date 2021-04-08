package org.mp.sesion05;

import org.mp.sesion02.ExcepcionArrayVacio;

public class SolucionesBusqueda {

	public static int busquedaLineal(Busqueda busqueda) throws ElementoNoEncontradoException {
		
		int buscado = busqueda.getNumSearched();
		boolean encontrado = false;
		int[] datos = busqueda.getDatos();
		for (int i = 0; i < datos.length; i++) {
			if(datos[i] == buscado) {
				encontrado = true;
				break;
			}
		}
		
		if(encontrado == false) {
			throw new ElementoNoEncontradoException("No encontrado");
		}
		return buscado;
	}

	public static int busquedaBinariaIter(Busqueda busqueda) throws ElementoNoEncontradoException {
		
		int buscado = busqueda.getNumSearched();
		boolean encontrado = false;
		int[] datos = busqueda.getDatos();
		
		int inicio = 0;
		int fin = datos.length - 1;
		int pos;
		
		while (inicio <= fin) {
			pos = (inicio + fin) / 2;
			if (datos[pos] == buscado)
				encontrado = true;
			else if (datos[pos] > buscado) {
				inicio = pos + 1;
			} else {
				fin = pos - 1;
			}
		}
		
		if(encontrado == false) {
			throw new ElementoNoEncontradoException("No encontrado");
		}
		return buscado;
	}

	public static Object busquedaBinariaRec(Busqueda busqueda) throws ElementoNoEncontradoException {
		
		int inicio = 0;
		int[] datos = busqueda.getDatos();
		int fin = datos.length - 1;
		int buscado = busqueda.getNumSearched();
		busquedaBinariaRec(datos, buscado, inicio, fin);
		return buscado;
	}

	private static void busquedaBinariaRec(int[] datos, int buscado, int inicio, int fin) throws ElementoNoEncontradoException {
		if(inicio > fin) {
			throw new ElementoNoEncontradoException("No encontrado");
		} 
		int medio = (inicio + fin) / 2;
		
		if (datos[medio] < buscado) {
			busquedaBinariaRec(datos, buscado, medio + 1, fin);
		} else if (datos[medio] > buscado) {
			busquedaBinariaRec(datos, buscado, inicio, medio - 1);
		}
		
	}

}
