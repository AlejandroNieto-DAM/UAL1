package org.mp.sesion02;

public abstract class MatrizGenerica<E extends Number> {

	protected abstract E sumar(E object, E object2);
	protected abstract E multiplicar(E object, E object2);
	protected abstract E cero();
	
	public E[][] sumarMatrices(E[][] matriz1, E[][] matriz2){
		
		if(matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
			throw new RuntimeException("Las matrices no tienen el mismo tamaño");
		}
		
		E[][] sumar = (E[][]) new Number[matriz1.length][matriz2[0].length]; 
		
		for (int x=0; x < matriz1.length; x++) {
			for (int y=0; y < matriz1[x].length; y++) {				
				sumar[x][y]= sumar(matriz1[x][y], matriz2[x][y]);								
		    }
		}
		
		return sumar;
	}
	
	public E[][] multiplicarMatrices(E[][] matriz1, E[][] matriz2){
	
		if(matriz1.length != matriz2[0].length || matriz1[0].length != matriz2.length) {
			throw new RuntimeException("No coinciden las columnas de la primera matriz con las filas de la segunda");
		}
		
		E[][] multi = (E[][]) new Number[matriz1.length][matriz2[0].length]; 
		
		for(int i= 0; i < multi.length; i++) {
			for(int j= 0; j< multi[0].length; j++) {
				multi[i][j] = cero();
			}
		}
		
		for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    multi[i][j] = sumar(multi[i][j], multiplicar(matriz1[i][k], matriz2[k][j]));
                }
            }
        }
		
		return multi;
	}

}
