package org.ip.sesion01;

public class ConversorEurosPesetas {

	public static void main(String[] args) {
		System.out.println("131,25 euros => " + String.format("%.02f", 131.25 * 166.386) + " pesetas");
		System.out.println("3247 pesetas => " + String.format("%.02f", 3247 / 166.386) + " euros");
	}
}
