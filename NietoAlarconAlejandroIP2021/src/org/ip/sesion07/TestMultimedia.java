package org.ip.sesion07;

public class TestMultimedia {

	public static void main(String[] args) {
		
		Pelicula p1 = new Pelicula("Million Dollar Baby", "Clint Eastwood", Formato.dvd, 137.30, "Clint Eastwood", "Hillary Swank");
		
		Pelicula p2 = new Pelicula("The Bridges of Madison County", "Clint Eastwood", Formato.dvd, 134.10, "Clint Eastwood", "Meryl Streep");
		Pelicula p3	= new Pelicula("Gladiator", "Ridley Scott", Formato.avi, 155.15, "Russell Crowe", "Connie Nielsen");
		Pelicula p4 = new Pelicula("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", Formato.dvd, 155.15, "Elijah Wood", "Liv Tyler");
		Pelicula p5 = new Pelicula("Mar adentro", "Alejandro Amenabar", Formato.mpg, 125.05, "Javier Bardem", "Belen Rueda");
		Pelicula p6 = new Pelicula(p5);
		
		Disco d1 = new Disco("Sin Mirar Atras", "David Bisbal", Formato.cdAudio, 46.02, Genero.pop, 13);
		Disco d2 = new Disco("How to Dismantle an Atomic Bomb", "U2", Formato.cdAudio, 49.20, Genero.rock, 11);
		Disco d3 = new Disco("Quitate las Gafas", "Melendi", Formato.mp3, 47.24, Genero.pop, 12);
		Disco d4 = new Disco("Southside", "Texas", Formato.mp3, 44.53, Genero.rock, 11);
		Disco d5 = new Disco("Soy Gitano", "Camaron", Formato.cdAudio, 32.21, Genero.flamenco, 8);
		Disco d6 = new Disco(d5);
		
		System.out.println(p4.toString());
		
		System.out.println();
		
		if(!p1.equals(p2)) {
			System.out.println(p1.toString() + "\n Y \n" + p2.toString() + "\nSON DIFERENTES XXX");
		}
		
		System.out.println();
		
		if(p5.equals(p6)) {
			System.out.println(p5.toString() + "\n Y \n" + p6.toString() + "\nSON IGUALES ===");
		}
		
		System.out.println();
		
		System.out.println(d4.toString());
		

		System.out.println();
		
		if(!d2.equals(d3)) {
			System.out.println(d2.toString() + "\n Y \n" + d3.toString() + "\nSON DIFERENTES XXX");
		}
		
		System.out.println();
		
		if(d5.equals(d6)) {
			System.out.println(d5.toString() + "\n Y \n" + d6.toString() + "\nSON IGUALES ===");
		}
		
	}
}
