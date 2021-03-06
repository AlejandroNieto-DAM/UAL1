package org.mp.sesion06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;


public class UtilidadArchivos {

	private ArrayList<File> lista;
	
	public UtilidadArchivos() {
	}
	
	public static void copiar(File origen, File destino) throws IOException {
		
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(origen);
			os = new FileOutputStream(destino);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} finally {
			is.close();
			os.close();
		}
		
	}
	
	public ArrayList<File> listarDirectoriosArchivos(File dir) {
		
		this.lista = new ArrayList<File>();
		listarDirectoriosArchivosRec(dir);	
		return lista;
		
	}
	
	private void listarDirectoriosArchivosRec(File dir) {
		
		this.lista.add(dir);
		
		if(dir.isDirectory()) {
			File[] archivos = dir.listFiles();
			for(int i = 0; i < archivos.length; i++) {
				listarDirectoriosArchivosRec(archivos[i]);
			}
		}
		
		
	}
	
	public void zip(File dir, String caminoSalida, String nombreArchivo) {
		
		this.listarDirectoriosArchivos(dir);
		byte[] buffer = new byte[1024];
		
		try {
			String archivoSalida = caminoSalida + File.separator + nombreArchivo;
			ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(archivoSalida));
			
			for(java.util.Iterator<File> iter = lista.iterator(); iter.hasNext();) {
				File elemento = iter.next();
				if(elemento.isFile()) {
					FileInputStream fis = new FileInputStream(elemento.getAbsolutePath());
					zos.putNextEntry(new ZipEntry(elemento.getAbsolutePath()));
					
					int len;
					
					while((len = fis.read(buffer)) > 0) {
						zos.write(buffer, 0, len);
					}
					
					zos.closeEntry();
					fis.close();
				}
				
			}
			zos.close();

		} catch (IOException e) {
		
		}
	}
}
