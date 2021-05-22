package org.mp.sesionexamenmayo.p2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class Municipios {

	private List<Municipio> municipios;

	public Municipios(File municipios) {
		super();
		this.municipios = new ArrayList<Municipio>();
		try {
			leerMunicipios(municipios);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void leerMunicipios(File municipios) throws Exception {
		
		FileReader fr = null;
		BufferedReader br = null;

		try {

			fr = new FileReader(municipios);
			br = new BufferedReader(fr);

			String linea;
			br.readLine();
			
			while ((linea = br.readLine()) != null) {
				String[] params = linea.split(";");
				Municipio temp = new Municipio(params[0], params[1], Double.valueOf(params[2].replace(",", ".")), Double.valueOf(params[3].replace(",", ".")), Double.valueOf(params[4].replace(",", ".")), Integer.valueOf(params[5]));
				this.municipios.add(temp);
			}
				
				
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public Municipio buscar(String municipio){
		
		Municipio temp;
		for(int i = 0; i < this.municipios.size(); i++) {
			if(this.municipios.get(i).getMunicipio().equals(municipio)) {
				temp = this.municipios.get(i);
				return temp;
			}
		}
		
		return null;
		
	}
	
	public long poblacionTotal(){
		long suma = 0;
		for(int i = 0; i < this.municipios.size(); i++)
			suma += this.municipios.get(i).getHabitantes();
		return suma;
	}

	
	public List<Municipio> municipiosProvincia(String provincia){
		ArrayList<Municipio> municipiosProvincia = new ArrayList<Municipio>();
		for(int i = 0; i < this.municipios.size(); i++) {
			if(this.municipios.get(i).getProvincia().equals(provincia)) {
				municipiosProvincia.add(this.municipios.get(i));
			}
		}
		return municipiosProvincia;
	}
	
	public ArrayList<Municipio> getMunicipios() {
		
		ArrayList<Municipio> municipiosTemp = new ArrayList<Municipio>(this.municipios);		
		return municipiosTemp;
	}

	@Override
	public String toString() {
		return "Municipios [municipios=" + municipios + "]";
	}
	
	
	
}
