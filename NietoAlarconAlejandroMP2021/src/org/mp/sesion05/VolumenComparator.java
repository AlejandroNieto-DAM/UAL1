package org.mp.sesion05;

import java.util.Comparator;

public class VolumenComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		Accion a1 = (Accion) arg0;
		Accion a2 = (Accion) arg1;

		int comp = Long.compare(a1.getVolumen(), a2.getVolumen());
		
		return comp;
	}

}
