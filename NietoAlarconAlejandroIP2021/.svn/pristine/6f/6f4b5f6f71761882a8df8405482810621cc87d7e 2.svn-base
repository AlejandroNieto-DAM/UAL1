package org.ip.sesion07;
import java.util.Locale;
import java.util.Scanner;
public class TestComplejo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		entrada.useLocale(Locale.ENGLISH);
		
		double escalar = 2.5;
		
		double real = 0.0;
		double imaginaria = 0.0;
		
		
		System.out.println("PRIMER COMPLEJO");
		System.out.println("Introduce la parte real");
		real = entrada.nextDouble();
		System.out.println("Introduce la parte imaginaria");
		imaginaria = entrada.nextDouble();
		
		Complejo comp1 = new Complejo(real, imaginaria);
		
		System.out.println("SEGUNDO COMPLEJO");
		System.out.println("Introduce la parte real");
		real = entrada.nextDouble();
		System.out.println("Introduce la parte imaginaria");
		imaginaria = entrada.nextDouble();
		
		entrada.close();
		
		Complejo comp2 = new Complejo(real, imaginaria);
		
		Complejo comp3 = new Complejo(comp2);
		
		System.out.println();
		System.out.println("LOS NUMEROS COMPLEJOS SON");
		System.out.println("El primer numero complejo es: " + comp1.toString());
		System.out.println("El segundo numero complejo es: " + comp2.toString());
		System.out.println("El tercer numero complejo es: " + comp3.toString());
		
		System.out.println();
		System.out.println("RESULTADOS DE LAS OPERACIONES");
		
		System.out.println("(" + comp1.toString() + ") + (" + comp2.toString() + ") = " + comp1.sumar(comp2));
		System.out.println("(" + comp1.toString() + ") - (" + comp2.toString() + ") = " + comp1.restar(comp2));
		System.out.println("(" + comp1.toString() + ") * (" + comp2.toString() + ") = " + comp1.multiplicar(comp2));
		System.out.println("(" + comp1.toString() + ") / (" + comp2.toString() + ") = " + comp1.dividir(comp2));
		
		System.out.println(escalar + " * " + comp1.toString() + " = " + comp1.productoPorEscalar(escalar));
		System.out.println("|"  + comp1.toString() + "| = " + comp1.modulo());
		System.out.println("Argumento(" + comp1.toString() + ") = " + comp1.argumento() + " radianes");
		
		if(comp1.equals(comp2)) {
			System.out.println("El primer complejo NO ES IGUAL al segundo");
		}
		
		if(comp2.equals(comp2)) {
			System.out.println("El segundo complejo ES IGUAL al tercero");
		}
		
		System.out.println();
		
		comp3.setReal(1.0);
		comp3.setImaginaria(-2.0);
		System.out.println("El tercer numero complejo con nuevos valores es: " + comp3.toString());
		System.out.println("Conjugado(" + comp3.toString() + ") = " + comp3.conjugado());


	}

}
