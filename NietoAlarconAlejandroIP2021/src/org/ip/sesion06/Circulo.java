package org.ip.sesion06;

public class Circulo {
	
	private double xCentro;
	private double yCentro;
	private double radio;
	
	static private int numCirculos = 0;

	/* EXTENSION EJ 5 */
	private double factor = 0.0;
	
	
	public Circulo() {
		this.xCentro = 0;
		this.yCentro = 0;
		this.radio = 0;
		
		Circulo.numCirculos += 1;
	}
	
	public Circulo(double xCentro, double yCentro, double radio) {
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		this.radio = radio;
		
		Circulo.numCirculos += 1;
	}
	
	public Circulo(double xCentro, double yCentro) {
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		this.radio = 0;
		
		Circulo.numCirculos += 1;
	}
	
	public Circulo(double radio) {
		this.xCentro = 0;
		this.yCentro = 0;
		this.radio = radio;
		
		Circulo.numCirculos += 1;
	}
	
	public Circulo(Circulo circulo) {
		this.xCentro = circulo.xCentro;
		this.yCentro = circulo.yCentro;
		this.radio = circulo.radio;
		
		Circulo.numCirculos += 1;
	}

	public double getXCentro() {
		return xCentro;
	}

	public void setXCentro(double xCentro) {
		this.xCentro = xCentro;
	}

	public double getYCentro() {
		return yCentro;
	}

	public void setYCentro(double yCentro) {
		this.yCentro = yCentro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public static int getNumCirculos() {
		return numCirculos;
	}

	@Override
	public String toString() {
		String salida = "Circulo = {(xCentro=" + this.xCentro + ", yCentro=" + this.yCentro + "), radio=" + this.radio +  "}";
		return salida;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean iguales = false;

		if(obj instanceof Circulo) {
			Circulo circulo = (Circulo) obj;
			
			if(this.xCentro == circulo.yCentro  && this.yCentro == circulo.yCentro && this.radio == circulo.radio) {
				iguales = true;
			}
		}
		
		return iguales;
	}
	
	public int compareTo(Object obj) {
		
		int valor = 0;
		
		if(obj instanceof Circulo) {
			Circulo circulo = (Circulo) obj;
			
			if(this.calcularArea() == circulo.calcularArea()) {
				valor = 1;
			}
		}
		
		return valor;
	}
	
	public double calcularArea() {
		double area = Math.PI * Math.pow(this.radio, 2);
		return area;
	}
	
	public double calcularLongitud() {
		double longitud = Math.PI * this.radio * 2;
		return longitud;
	}
	
	public double calcularDiametro() {
		double diametro = this.radio * 2;
		return diametro;
	}
	
	/* EXTENSION EJ 5 */
	
	public void desplazar(double dx, double dy) {
		this.xCentro = dx;
		this.yCentro = dy;
	}
	
	public void cambiarTamanio(double factor) {
		this.factor = factor;
	}
	
	public boolean estaDentro(double xPunto, double yPunto) {
		boolean dentro = false;
		
		double sumando1 = Math.pow((xPunto - xCentro), 2);
		double sumando2 = Math.pow((yPunto - yCentro), 2);
		
		double suma = sumando1 + sumando2;
		
		if(suma <= Math.pow(this.radio, 2)) {
			dentro = true;
		}
		
		return dentro;
	}
	
	//TODO
	public boolean contiene(Circulo circ) {
		boolean disjuntos = false;
		
		double distanciaX = Math.abs((this.getXCentro() - circ.getXCentro()));
		double distanciaY = Math.abs((this.getYCentro() - circ.getYCentro()));
		
		double radio = this.radio;
		
		this.setRadio(Math.abs(this.radio - circ.radio));
	
		
		if(this.estaDentro(circ.getXCentro(), circ.getYCentro())) {
			disjuntos = true;
		}
		
		this.setRadio(radio);
		return disjuntos;
		
	}

	public boolean solapa(Circulo circ) {
		boolean disjuntos = false;
		
		if(!this.contiene(circ)) {
			
			double distanciaX = Math.abs((this.getXCentro() - circ.getXCentro()));
			double distanciaY = Math.abs((this.getYCentro() - circ.getYCentro()));
			double sumaRadios = circ.radio + this.radio;
	
			if((sumaRadios >= distanciaX) && (sumaRadios >= distanciaY)){
				disjuntos = true;
			}
			
			disjuntos = true;
		}
		
		return disjuntos;
	}
	
	public boolean sonDisjuntos(Circulo circ) {
		
		boolean disjuntos = false;
		
		double distanciaX = Math.abs((this.getXCentro() - circ.getXCentro()));
		double distanciaY = Math.abs((this.getYCentro() - circ.getYCentro()));
		double sumaRadios = circ.radio + this.radio;
				
		if((sumaRadios <= distanciaX) && (sumaRadios <= distanciaY)){
			disjuntos = true;
		}
		
		return disjuntos;
	}
	
}
