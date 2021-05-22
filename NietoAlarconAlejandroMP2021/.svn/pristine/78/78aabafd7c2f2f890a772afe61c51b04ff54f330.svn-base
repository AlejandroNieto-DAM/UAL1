package org.mp.sesionexamenmayo.p2;

import java.util.Comparator;

public class DistanciaAMunicipioComparator implements Comparator {

	private Municipio municipio;
	
	public DistanciaAMunicipioComparator(Municipio municipio) {
		super();
		this.municipio = municipio;
	}

	@Override
	public int compare(Object o1, Object o2) {
		Municipio m1 = (Municipio) o1;
		Municipio m2 = (Municipio) o2;
		
		double lat1 = m1.getLatitud();
		double lng1 = m1.getLongitud();
		
		double distanciaPrimero = this.distanciaEntrePuntosLatLon(lat1, lng1, this.municipio.getLatitud(), this.municipio.getLongitud());
		
		double lat2 = m2.getLatitud();
		double lng2 = m2.getLongitud();
				
		double distanciaSegundo = this.distanciaEntrePuntosLatLon(lat2, lng2, this.municipio.getLatitud(), this.municipio.getLongitud());

		
		if (distanciaPrimero > distanciaSegundo)
			return 1;
		else if (distanciaPrimero < distanciaSegundo)
			return -1;
		else
			return 0;
		
	}
	
	private  double distanciaEntrePuntosLatLon(double lat1, double lng1, double lat2, double lng2) {  
       
        double radioTierra = 6371;//en kilómetros  
        double dLat = Math.toRadians(lat2 - lat1);  
        double dLng = Math.toRadians(lng2 - lng1);  
        double sindLat = Math.sin(dLat / 2);  
        double sindLng = Math.sin(dLng / 2);  
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)  
                * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));  
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
        double distancia = radioTierra * va2;  
   
        return distancia;  
    }  

}
