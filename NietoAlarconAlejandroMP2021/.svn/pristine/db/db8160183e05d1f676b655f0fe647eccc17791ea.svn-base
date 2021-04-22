package org.mp.sesion06;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;


public class Estadistica {
	
	private ConjuntoDatos cd;
	
	public Estadistica(ConjuntoDatos cd) {
		this.cd = cd;
	}
	
	public double media(String columna) {
		DescriptiveStatistics statistics = new DescriptiveStatistics(this.cd.getColumna(columna));
		return statistics.getMean();
	}
	
	public double max(String columna) {
		DescriptiveStatistics statistics = new DescriptiveStatistics(this.cd.getColumna(columna));
		return statistics.getMax();
	}
	
	public double min(String columna) {
		DescriptiveStatistics statistics = new DescriptiveStatistics(this.cd.getColumna(columna));
		return statistics.getMin();
	}
	
	public double suma(String columna) {
		DescriptiveStatistics statistics = new DescriptiveStatistics(this.cd.getColumna(columna));
		return statistics.getSum();
	}
}
