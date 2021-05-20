package org.mp.sesion07;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ImagenDAO {

	public static Imagen leerArchivo(String cabeceraI) throws IOException {
		
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String tipoImagen = "";
		String formatoImagen = "";
		int numeroLineas = 0;
		int numeroColumnas = 0;
		int numeroBandas = 0;
		String nombreBandas = "";
		String[] nombres = new String[0];
		String archivoDatos = "";
		
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(cabeceraI);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			int contador = 0;
			
			
			
			while ((linea = br.readLine()) != null) {
				if (contador == 0) {
					archivoDatos = linea;
				} else if (contador == 1) {
					tipoImagen = linea;
				} else if(contador == 2) {
					formatoImagen = linea;
				} else if(contador == 3) {
					numeroBandas = Integer.valueOf(linea);
				} else if(contador == 4) {
					nombreBandas = linea;
					nombres = nombreBandas.substring(1, nombreBandas.length() - 1).split(";");
				} else if(contador == 5) {
					numeroLineas = Integer.valueOf(linea);
				} else if(contador == 6) {
					numeroColumnas = Integer.valueOf(linea);
				}
				
				contador += 1;
			}
				
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			br.close();
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		Imagen newImagen = new Imagen(numeroLineas, numeroColumnas, formatoImagen, tipoImagen);
		
		
		

	
		return leerBSQ(archivoDatos, newImagen, nombres, tipoImagen);
	}
	
	private static Imagen leerBSQ(String nombreArchivo, Imagen imagen, String[] nbandas, String tipoImagen) {
		
		String directorioEntrada = System.getProperty("user.dir");

		String directorioDatos = directorioEntrada + File.separator + "src" + File.separator + "org" + File.separator
				+ "mp" + File.separator + "sesion07" + File.separator;

		String datos = directorioDatos + nombreArchivo;

		File f2 = new File(datos);
		FileInputStream fis;
		DataInputStream dis;

		try {
			
			fis = new FileInputStream(f2);
			dis = new DataInputStream(fis);

			for (int i = 0; i < nbandas.length; i++) {
				
				

				Number[][] datosBanda = new Number[imagen.getLineas()][imagen.getColumnas()];

				for (int k = 0; k < imagen.getLineas(); k++) {
					for (int z = 0; z < imagen.getColumnas(); z++) {
						if (tipoImagen.equals("Integer")) {
							datosBanda[k][z] = dis.readInt();
						} else if (tipoImagen.equals("Double")) {
							datosBanda[k][z] = dis.readDouble();
						}
					}
				}

				Banda banda = new Banda(nbandas[i], imagen.getLineas(),imagen.getColumnas());
				banda.setDatos(datosBanda);
				imagen.anadirBanda(banda);
			}

			fis.close();
			dis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return imagen;
	}

	public static void escribirArchivo(String salida, Imagen imagenNueva) throws IOException  {
		String directorioEntrada = System.getProperty("user.dir");

		String output = salida;
		String salidaArchivo = salida.substring(0, salida.lastIndexOf(".")) + ".dat";
		
		
		File f1 = new File(output);
		
		f1.createNewFile();
		
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(f1);
            pw = new PrintWriter(fichero);

            pw.println(salida.substring(salida.lastIndexOf("/") + 1, salida.length()));
            pw.println(imagenNueva.getTipoImagen());
            pw.println(imagenNueva.getFormatoImagen());
            pw.println(imagenNueva.getNumeroBandas());
            
            String nombreBandas = "[";
            for(int i = 0; i < imagenNueva.getNumeroBandas() - 1; i++) {
            	nombreBandas += imagenNueva.getBanda(i).getNombreBanda() + ";";
            }
            
            nombreBandas += imagenNueva.getBanda(imagenNueva.getNumeroBandas() - 1).getNombreBanda() + "]";
            
            pw.println(nombreBandas);
            
            pw.println(imagenNueva.getLineas());
            pw.println(imagenNueva.getColumnas());
            pw.println();
            pw.println();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
		
		pw.close();
		fichero.close();
		
		try {
			escribirBSQ(salidaArchivo, imagenNueva);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void escribirBSQ(String salida, Imagen imagenNueva) throws IOException {
		
		String directorioEntrada = System.getProperty("user.dir");

		String directorioDatos = directorioEntrada + File.separator + "src" + File.separator + "org" + File.separator + "mp"
				+ File.separator + "sesion07" + File.separator;

		String output = directorioDatos + salida;
		// TODO Auto-generated method stub
		File f1 = new File(salida);
		f1.createNewFile();
		FileOutputStream fos = new FileOutputStream(f1);
		DataOutputStream dos = new DataOutputStream(fos);
		

		for(int i = 0; i < imagenNueva.getNumeroBandas(); i++) {
			Number[][] datos = imagenNueva.getBanda(i).getDatos();
			for(int j = 0; j < datos.length; j++) {
				
				for(int k = 0; k < datos[0].length; k++) {
					if(imagenNueva.getTipoImagen().equals("Integer")) {
						dos.writeInt(imagenNueva.getBanda(i).getDatoXY(j, k).intValue());
					}  else if(imagenNueva.getTipoImagen().equals("Double")) {
						dos.writeDouble(imagenNueva.getBanda(i).getDatoXY(j, k).doubleValue());
					}
				}
			}
		}
		
		dos.close();
		fos.close();

	}

}
