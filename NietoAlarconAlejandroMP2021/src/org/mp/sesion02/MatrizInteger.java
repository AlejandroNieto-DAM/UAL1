package org.mp.sesion02;

public class MatrizInteger extends MatrizGenerica<Integer> {

	/**
	 * Sobreescritura del metodo sumar que suma dos instancias del objeto Integer
	 * @param object que es un Integer que queremos sumar
	 * @param object2 que es el otro Integer que queremos sumar
	 * @return un Integer con el valor de la suma  
	 */
	@Override
	protected Integer sumar(Integer object, Integer object2) {
		return object + object2;
	}

	/**
	 * Sobreescritura del metodo multiplicar que multiplica dos instancias de objeto Integer
	 * @param object que es un Integer que queremos multiplicar
	 * @param object2 que es el otro Integer que queremos multiplicar
	 * @return un Integer con el valor de la multiplicacion  
	 */
	@Override
	protected Integer multiplicar(Integer object, Integer object2) {
		return object * object2;
	}

	/**
	 * Sobreescritura del metodo cero que devolvera el valor nulo para este objeto.
	 * @return retorna un 0 como valor nulo para este objeto como un Integer  
	 */
	@Override
	protected Integer cero() {
		return 0;
	}

}
