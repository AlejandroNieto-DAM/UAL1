package org.mp.sesion02;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteradorPrimos implements Iterator<Integer> {

	private int limite;
	private int actual;
	
	public IteradorPrimos(int limite) {
		this.limite = limite;
		actual = 2;
	}
	
	public int getLimite() {
		return limite;
	}

	public int getActual() {
		return actual;
	}
	
	public static boolean esPrimo(int numero) {
		boolean primo = false;
		int numeroVecesResto0 = 0;
		int raizNumero = (int) Math.sqrt(numero);
		
		for(int i = 1; i <= raizNumero; i++) {
			if(numero % i == 0) {
				numeroVecesResto0++;
			}
		}
		
		if(numeroVecesResto0 < 2) {
			primo = true;
		}
		
		return primo;
	}
	
	public String mostrarPrimos() {
		String cadena = "";
		int index = 1;
		while(this.hasNext()) {
			cadena += "\t" + this.next();
			if(index >= 10) {
				cadena += "\n";
				index = 0;
			}
			index ++;
		}
		
		return cadena;
	}
	
	@Override
	public boolean hasNext() {
		boolean hasNext = false;

		if(this.getActual() <= this.getLimite()) {	
			hasNext = true;	
		}
		
		return hasNext;
	}

	@Override
	public Integer next() {
		
		if(this.hasNext() == false && this.getActual() > this.getLimite()) {
			throw new NoSuchElementException("No se puede acceder a más números primos");
		}
		
		
		int prev = this.getActual();
		
		do {
			this.actual++;
		}while(!IteradorPrimos.esPrimo(this.actual));
		
		return prev;
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException("Método no soportado");
	}	

}
