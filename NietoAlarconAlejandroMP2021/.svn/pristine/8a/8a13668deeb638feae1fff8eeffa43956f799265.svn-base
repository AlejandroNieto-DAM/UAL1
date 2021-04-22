package org.mp.sesion06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConjuntoDatos {
	
	private File archivoTexto;
	private String separador;
	private Locale locale;
	private List<String> cabecera;
	private int numeroLineas;
	private int numeroColumnas;
	private double[][] datos;

	public ConjuntoDatos(File archivoTexto, String separador, Locale locale) {
			this.archivoTexto = archivoTexto;
			this.separador = separador;
			this.locale = locale;
			this.cabecera = cabecera(archivoTexto);
			this.numeroLineas = numLineas(archivoTexto);
			this.numeroColumnas = numColumnas(archivoTexto);
			this.datos = leerDatos(archivoTexto, this.numeroLineas, this.numeroColumnas);
			
	}

	private List cabecera(File archivoTexto) {
		List<String> list = new ArrayList();
		
		Scanner sc;
		try {
			sc = new Scanner(archivoTexto);
			
			String s = sc.nextLine();
			
			String[] tokens = s.split(separador);
			
			for(int i = 0; i < tokens.length; i++) {
				list.add(tokens[i]);
			}
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("Mira la 0 --> " + list.get(0));
		
		return list;
	}

	private int numLineas(File archivoTexto) {
		int numeroLineas = 0;
		Scanner sc;
		try {
			sc = new Scanner(archivoTexto);
			sc.nextLine();
			while(sc.hasNextLine()) {
				numeroLineas++;
				sc.nextLine();
			}
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return numeroLineas;
				
	}

	private int numColumnas(File archivoTexto) {
		return cabecera(archivoTexto).size();
	}

	private double[][] leerDatos(File archivoTexto, int filas, int columnas) {

		double[][] matrizDatos = new double[filas][columnas];

		try {
			BufferedReader br = new BufferedReader(new FileReader(archivoTexto), filas);
			br.readLine();
			for (int i = 0; i < filas; i++) {
				String cadena = br.readLine();
				
				Scanner sc1 = new Scanner(cadena);
				sc1.useDelimiter(this.getSeparador());	
				int j = 0;
				
				while (sc1.hasNext()) {
					
					double valor = sc1.nextDouble();
					matrizDatos[i][j] = Double.valueOf(valor);
					j++;
					
				}
			}

			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return matrizDatos;
	}

	public double[] getColumna(int columna) {
		double[] columnaDatos = new double[this.numeroLineas];
		
		for(int i = 0; i < columnaDatos.length; i++) {
			columnaDatos[i] = this.datos[i][columna];
		}
		
		return columnaDatos;
	}

	public double[] getColumna(String columna) {
		
		return this.getColumna(this.cabecera.indexOf(columna));
	}

	public File getArchivoTexto() {
		return archivoTexto;
	}

	public String getSeparador() {
		return separador;
	}

	public Locale getLocale() {
		return locale;
	}

	public List getCabecera() {
		return cabecera;
	}

	public int getNumeroLineas() {
		return numeroLineas;
	}

	public int getNumeroColumnas() {
		return numeroColumnas;
	}

	public double[][] getDatos() {
		return datos;
	}

	public void exportar(String[] cabecera, String archivoTexto, String separador) {
		
		
		try {
			PrintWriter pw = new PrintWriter(archivoTexto);
			for(int i = 0; i < cabecera.length; i++) {
				pw.print(cabecera[i]);
				pw.print(separador);
			}
			
			pw.println();
			
			for(int j = 0; j < this.numeroLineas; j++) {
				for(int i = 0; i < cabecera.length; i++) {
					double[] datosColumna = this.getColumna(cabecera[i]);
					 
					
					pw.print(datosColumna[j]);
					pw.print(separador);
				
				
					
					
				}
				
				pw.println();
			}
			
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public ConjuntoDatos conjuntoDatos(String[] cabecera, String archivoTexto, String separador, Locale locale) {
		this.exportar(cabecera, archivoTexto, separador);
		return new ConjuntoDatos(new File(archivoTexto), separador, locale);
	}

}
