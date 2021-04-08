package org.mp.sesion05;

import java.util.Comparator;

public class NumeroPaloComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		Carta carta1 = (Carta) arg0;
		Carta carta2 = (Carta) arg1;
		
		int comp = Integer.compare(carta1.getNumero(), carta2.getNumero());
		if(comp == 0) {
			comp = Integer.compare(carta1.getValor(), carta2.getValor());
		}

		
		return comp;
	}

}
