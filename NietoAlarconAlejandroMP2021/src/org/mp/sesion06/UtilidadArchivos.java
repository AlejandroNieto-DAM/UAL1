package org.mp.sesion06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class UtilidadArchivos {

	private ArrayList<File> lista;
	
	public UtilidadArchivos() {
	}
	
	public static void copiar(File origen, File destino) throws IOException {
		FileReader fr = new FileReader(origen);
		BufferedReader br = new BufferedReader(fr);
		
		String archivoDondeSeCopia = destino.getPath();
		
		PrintWriter pw = new PrintWriter(archivoDondeSeCopia);
		
		String linea;
		
		while((linea = br.readLine()) != null) {
			pw.println(linea);
		}
		
		br.close();
		
		pw.close();
		
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
		String directorioLocal = dir.getParentFile().getAbsolutePath() + File.separator;
		String pathSalida = caminoSalida + File.separator + nombreArchivo;

		byte[] buffer = new byte[1024];
		ZipOutputStream zos;
		try {
			
			zos = new ZipOutputStream(new FileOutputStream(pathSalida));
			zos.setLevel(Deflater.BEST_COMPRESSION);
			
			for (File f : lista) {
				if (f.isFile()) {

					FileInputStream in = new FileInputStream(f);
					zos.putNextEntry(new ZipEntry(f.getAbsolutePath().replace(directorioLocal, "")));

					int len;
					while ((len = in.read(buffer)) > 0) {
						zos.write(buffer, 0, len);
					}
					in.close();
					zos.closeEntry();

				}

			}
			
			zos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
