package org.ip.sesion02;

public class CambioMonedas {

	public static void main(String[] args) {


		double euros = 21.38;
		
		int monedas2 = 0;
		int monedas1 = 0;
		
		int monedas50cent = 0;
		int monedas20cent = 0;
		int monedas10cent = 0;
		
		int monedas5cent = 0;
		int monedas2cent = 0;
		int monedas1cent = 0;
		
		System.out.println("Para devolver " + euros + " euros en monedas, hay que dar: ");

		
		monedas2 = (int) euros / 2;	
		euros = euros % 2;
		
		monedas1 = (int) euros/1;
		euros = euros % 1;
		
		monedas50cent =  (int) (euros/0.5);
		euros = euros % 0.5;
		
		monedas20cent =  (int) (euros/0.2);
		euros = euros % 0.2;
		
		monedas10cent =  (int) (euros/0.1);
		euros = euros % 0.1;
		
		monedas5cent =  (int) (euros/0.05);
		euros = euros % 0.05;
		
		monedas2cent =  (int) (euros/0.02);
		euros = euros % 0.02;
				
		monedas1cent = (int) Math.ceil(euros/0.01);
		
		
		if(monedas2 > 0) 
			System.out.println(monedas2 + " monedas de 2 euros");

		if(monedas1 > 0)
			System.out.println(monedas1 + " monedas de 1 euros");
		
		if(monedas50cent > 0)
			System.out.println(monedas50cent + " monedas de 50 centimos");
		
		if(monedas20cent > 0)
			System.out.println(monedas20cent + " monedas de 20 centimos");
		
		if(monedas10cent > 0)
			System.out.println(monedas10cent + " monedas de 10 centimos");
		
		if(monedas5cent > 0)
			System.out.println(monedas5cent + " monedas de 5 centimos");
		
		if(monedas2cent > 0)
			System.out.println(monedas2cent + " monedas de 2 centimos");
		
		if(monedas1cent > 0)
			System.out.println(monedas1cent + " monedas de 1 centimo");

		
	}

}
