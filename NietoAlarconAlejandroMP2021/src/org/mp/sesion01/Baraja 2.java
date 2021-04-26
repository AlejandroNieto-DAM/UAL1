package org.mp.sesion01;

public class Baraja {

	private String nombreBaraja;
	private Carta[] cartas;

	public Baraja(String nombreBaraja, Carta[] cartas) {
		this.nombreBaraja = nombreBaraja;
		this.cartas = cartas;
	}

	public Carta[] getCartas() {
		return this.cartas;
	}

	public void insercion(Carta[] cartas) {
		int p, j;
		Carta aux;
		for (p = 1; p < cartas.length; p++) {
			aux = cartas[p];
			j = p - 1;
			while ((j >= 0) && (aux.getValor() < cartas[j].getValor())) {

				cartas[j + 1] = cartas[j];
				j--;
			}
			cartas[j + 1] = aux;
		}

	}
}
