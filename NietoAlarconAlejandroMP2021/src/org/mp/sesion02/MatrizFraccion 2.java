package org.mp.sesion02;

public class MatrizFraccion extends MatrizGenerica<Fraccion> {

	

	@Override
	protected Fraccion sumar(Fraccion object, Fraccion object2) {
		return object.sumar(object2);
	}

	@Override
	protected Fraccion multiplicar(Fraccion object, Fraccion object2) {
		return object.multiplicar(object2);
	}

	@Override
	protected Fraccion cero() {
		return new Fraccion();
	}



}
