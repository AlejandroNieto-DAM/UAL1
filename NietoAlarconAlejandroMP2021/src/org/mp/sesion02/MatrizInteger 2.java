package org.mp.sesion02;

public class MatrizInteger extends MatrizGenerica<Integer> {

	@Override
	protected Integer sumar(Integer object, Integer object2) {
		return object + object2;
	}

	@Override
	protected Integer multiplicar(Integer object, Integer object2) {
		return object * object2;
	}

	@Override
	protected Integer cero() {
		return 0;
	}

}
