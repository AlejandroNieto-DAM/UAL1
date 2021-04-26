package org.lya.sesion09;

public class CoeficienteBin {

	private int cbK;
	private int cbN;
	
	public CoeficienteBin(int n, int k) {
		if (k > n) {
			throw new IllegalArgumentException();
		}
		
		this.cbK = k;
		this.cbN = n;
	}
	
	
	public int getN() {
		return this.cbN;
	}
	
	public int getK() {
		return this.cbK;
	}
	
	public void setN(int n) {
		this.cbN = n;
	}
	
	public void setK(int k) {
		this.cbK = k;
	}
	
	public int coefBinomialRecursivo() {
		return coefBinomialRecursivo(this.getN(), this.getK());
	}
	
	private int coefBinomialRecursivo(int n, int k) {
		int value = 0;
		
		if(n == 0) {
			value = 0;
		} else if (0 < k && k < n) {
			value = (coefBinomialRecursivo(n - 1, k - 1) + coefBinomialRecursivo(n - 1, k));
		} else if (k == 0 || k == n) {
			value = 1;
		}
		
		return value;
	}
	
	public int coefBinomialProgDinam() {
		int[][] matriz = new int[this.getN() + 1][this.getK() + 1];
		
		//System.out.println("n = " + this.getN());
		//System.out.println("k = " + this.getK());

		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = 0;
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(j >= 1 && i > 0) {
					matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
				} else if  (j == 0){
					matriz[i][j] = 1;
				}
			}
		}
		
		/*
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.println( matriz[i][j] + "\t");
			}
			System.out.println("\n");
		}*/
		
		
		return matriz[this.getN()][this.getK()];
	}
}
	
