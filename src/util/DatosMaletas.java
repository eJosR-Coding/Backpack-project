package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class DatosMaletas {
	
	String RutaArcivo;
	
	public boolean GuardarDatos(String modelo, String precio, String ancho, String alto, String fondo) {
		boolean resultado = false;
		BufferedWriter writer = null;
		try {
			File file = new File("DatosNuevos.txt");
			writer = new BufferedWriter(new FileWriter(file, true));
			String contenido = modelo +"|"+ precio +"|"+ ancho +"|"+ alto +"|"+ fondo + "\n";
			writer.write(contenido);
			RutaArcivo = file.getCanonicalPath();
			System.out.println(file.getCanonicalPath());
			resultado = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				writer.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}

		}

		return resultado;
	}
}	
	
