package org.mp.sesion07;

import java.util.ArrayList;

public class Imagen {

	private String formatoImagen;
	private String tipoImagen;
	private int lineas;
	private int columnas;
	private ArrayList<Banda> bandas;
	
	public Imagen(int lineas, int columnas, String formatoImagen, String tipoImagen) {
		this.lineas = lineas;
		this.columnas = columnas;
		this.formatoImagen = formatoImagen;
		this.tipoImagen = tipoImagen;
		bandas = new ArrayList();
	}
	
	public String getFormatoImagen() {
		return formatoImagen;
	}
	
	public String getTipoImagen() {
		return tipoImagen;
	}
	
	public int getLineas() {
		return lineas;
	}
	
	public int getColumnas() {
		return columnas;
	}
	
	public void setTipoImagen(String tipoImagen) {
		this.tipoImagen = tipoImagen;
	}
	
	public void setFormatoImagen(String formatoImagen) {
		this.formatoImagen = formatoImagen;
	}
	
	public void setBandas(ArrayList<Banda> bandas) {
		this.bandas = bandas;
	}
	
	public ArrayList getBandas() {
		return this.bandas;
	}
	
	public int getNumeroBandas() {
		return this.bandas.size();
	}
	
	public Banda<Number> getBanda(int i){
		return this.bandas.get(i);
	}
	
	public void eliminarBanda(int i) {
		this.bandas.remove(i);
	}
	
	public void anadirBanda(Banda<?> banda) {
		this.bandas.add(banda);
	}
	
	public Imagen extraerImagen(int x1, int y1, int x2, int y2) throws XYFueraImagenException {
		if(!XYValida(x1, y1, x2, y2)) {
			throw new XYFueraImagenException();
		}
		
		int newCols = Math.abs(x1 - x2)+1;
		int newLines = Math.abs(y1 - y2)+1;
		
		Imagen newImage = new Imagen(newLines, newCols, this.getFormatoImagen(), this.getTipoImagen());
		
		for(int i = 0; i < this.getNumeroBandas(); i++) {
			
			Number[][] datos = new Number[newLines][newCols];
			
			for(int j = y1, cl = 0; j <= y2; j++, cl++) {
				for(int k = x1, cc = 0; k <= x2; k++, cc++) {
					datos[cl][cc] = this.getBanda(i).getDatoXY(j, k);	
				}		
			}
			
			Banda banda = new Banda(this.getBanda(i).getNombreBanda(), datos);
			newImage.anadirBanda(banda);
		}
		
		return newImage;
	}
	
	public Number[] getDatosPixel(int x, int y) throws XYFueraImagenException {
		if(!XYValida(x, y, lineas, columnas)) {
			throw new XYFueraImagenException();
		}
		
		Number[] num = new Number[this.getBandas().size()];
		
		for(int i = 0; i < this.getBandas().size(); i++) { 
			num[i] = ((Banda) this.getBandas().get(i)).getDatoXY(x, y);
		}
		
		return num;
		
	}
	
	private boolean XYValida(int x1, int y1, int x2, int y2) {
		if(x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) {
			return false;
			
		} else if (x1 > this.getColumnas() || x2 > this.getColumnas() || y1 > this.getLineas() || y2 > this.getLineas()) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	

	
	
	
}
