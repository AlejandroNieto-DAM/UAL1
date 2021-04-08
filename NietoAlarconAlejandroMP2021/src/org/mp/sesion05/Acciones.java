package org.mp.sesion05;

import java.util.ArrayList;
import java.util.List;

public class Acciones {

	private List<Accion> acciones;
	
	public Acciones() {
		acciones = new ArrayList<Accion>();
	}
	
	public void add(Accion accion) {
		this.acciones.add(accion);
	}
	
	public List getAcciones() {
		return this.acciones;
	}
		
}
