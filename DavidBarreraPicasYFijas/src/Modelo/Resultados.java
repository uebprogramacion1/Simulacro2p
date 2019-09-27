package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Resultados {

	private File f;

	public void Archivo() {
		f = new File("resultados.txt");

	}

	public String LeerResultados() {
		String resultado = "\n";
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while (linea != null) {
				resultado = resultado + linea + "\n";
				linea = br.readLine();
			}
			fr.close();

		} catch (IOException e) {
		}

		return resultado;

	}

	public String escribirResultados(String nombre, int numero[], int intentos, String juego) {

		
		String cadena = " ";

		for (int i = 0; i < numero.length; i++) {
			cadena = "Nombre: " + nombre + "\nNumero Adivinar: " + numero[i] + "\nNumero Intentos: " + intentos + "\n"
					+ juego;

			try {
				FileWriter fw = new FileWriter(f);
				PrintWriter pw = new PrintWriter(fw);
				pw.println(cadena);
				fw.close();
			}

			catch (IOException e) {
				cadena = "error";
			}

		}
		return cadena;
	}

}
