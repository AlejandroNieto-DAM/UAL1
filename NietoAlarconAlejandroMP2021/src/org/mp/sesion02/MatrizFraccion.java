package org.mp.sesion02;

public class MatrizFraccion extends MatrizGenerica<Fraccion> {

	
	/**
	 * Sobreescritura del metodo sumar que suma dos instancias del objeto Fraccion
	 * @param object que es una Fraccion que queremos sumar
	 * @param object2 que es la otra Fraccion que queremos sumar
	 * @return una Fraccion con el valor de la suma  
	 */
	@Override
	protected Fraccion sumar(Fraccion object, Fraccion object2) {
		return object.sumar(object2);
	}

	/**
	 * Sobreescritura del metodo multiplicar que multiplica dos instancias de objeto Fraccion
	 * @param object que es una Fraccion que queremos multiplicar
	 * @param object2 que es la otra Fraccion que queremos multiplicar
	 * @return una Fraccion con el valor de la multiplicacion  
	 */
	@Override
	protected Fraccion multiplicar(Fraccion object, Fraccion object2) {
		return object.multiplicar(object2);
	}

	/**
	 * Sobreescritura del metodo cero que devolvera el valor nulo para este objeto.
	 * @return retorna una fraccion con numerador 0 como valor nulo para este objeto como una Fraccion  
	 */
	@Override
	protected Fraccion cero() {
		return new Fraccion();
	}



}
