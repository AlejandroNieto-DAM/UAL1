package org.mp.sesion04;

import java.util.StringTokenizer;

public class Evaluador {
	
	private GenericStack<Integer> pila;
	
	public Evaluador() {
		pila = new GenericStack<Integer>();
	}
	
	public String[] eliminarBlancos(String expresion) {
		
		GenericQueue<String> valores = new GenericQueue<String>();
		
		StringTokenizer st = new StringTokenizer(expresion, "+*-/ ", true);
		while (st.hasMoreTokens()) {
			String valor = st.nextToken();
			if(this.soloDigitos(valor) || this.esOperador(valor)) {
				valores.enqueue(valor);
			}
		}
		
		String[] correctValues = new String[valores.getSize()];
		
		for(int index = 0; index < correctValues.length; index++) {
			correctValues[index] = valores.dequeue();
;		}
		
		return correctValues;
		
		 
	}
	
	public void procesarUnOperador(char op, GenericStack<Integer> operandosPila) {
		int valor2 = (int)operandosPila.pop();
		int valor1 = (int)operandosPila.pop();
		int resultado = 0;
		
		switch (op) {
			case '+':
				resultado = valor1 + valor2;
				break;
			case '-':
				resultado = valor1 - valor2;
				break;
			case '*':
				resultado = valor1 * valor2;
				break;
			case '/':
				if (valor2 == 0) {
					throw new RuntimeException("No es posible una división por cero");
				}
				resultado = valor1 / valor2;
				break;
		}
		
		operandosPila.push(resultado);
	}
	
	public int evaluarExpresion(String expresion) {
		
		String[] valores = this.eliminarBlancos(expresion);
		
		String isSoloDigitos = "";
		for(int i = 0; i < valores.length; i++) {
			isSoloDigitos += valores[i];
		}
		
		if (this.soloDigitos(isSoloDigitos)) {
			return Integer.valueOf(isSoloDigitos);
		}
		
		for (int i = 0; i < valores.length; i++) {
			if (this.soloDigitos(valores[i])) {
				pila.push(Integer.valueOf(valores[i]));
			} else if (this.esOperador(valores[i])) {
				this.procesarUnOperador(valores[i].charAt(0), pila);
			}
		}
		
		return (int)pila.pop();
	}
	
	private boolean soloDigitos(String expresion) {
		boolean soloDigitos = true;
		
		for (int i = 0; i < expresion.length(); i++) {
			if (!Character.isDigit(expresion.charAt(i))) {
				soloDigitos = false;
			}
		}
		
		return soloDigitos;
	}
	
	private boolean esOperador(String token) {
		return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
	}
	
	

}
