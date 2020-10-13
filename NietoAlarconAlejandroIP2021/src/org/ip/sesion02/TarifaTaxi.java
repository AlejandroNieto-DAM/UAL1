package org.ip.sesion02;

public class TarifaTaxi {

	public static void main(String[] args) {
		
		double kilometros = 101.0;
		double importe = 0.0;
		
		if (kilometros > 30) {
			
			if (kilometros <= 100) {
				importe = ((kilometros - 30) * 0.85) + 18.0;
			} else {
				importe = ((kilometros - 100) * 0.65) + 18.0;
				importe = importe + (((kilometros - (kilometros - 100)) - 30) * 0.85);
			}
			
		} else {
			importe = 18.0;
		}
		
		System.out.println("CALCULO TARIFA TAXI");
		System.out.println();
		System.out.println("Kilometros recorridos => " + kilometros);
		System.out.println("El importe total a pagar es " + importe + " euros");
	}

}
