package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Resultados {
	private File f;

	public Resultados() {

		f = new File("resultados.txt");
	}


	public String LeerResultados() {
	String resultado = "\n";
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while(linea!=null) {
				resultado = resultado + linea+ "\n";
				linea = br.readLine();
			}
			fr.close();

		}
		catch(IOException e) {
		}		

		return resultado;

	}
	public String escribirResultados(String nombre,int numero,int intentos,boolean gop ) {
		String gaope;
		if(gop ==true) {
			gaope ="El Jugador Ha ganado";
		}else {
			gaope = "El Jugador ha perdido";
		}
		String hola = "Nombre: "+nombre +"\nNumero Adivinar: "+numero+"\nNumero Intentos: "+intentos+"\n"+gaope;
		try {
			FileWriter fw = new FileWriter(f,true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(hola);
			fw.close();

		}
		catch(IOException e) {
			hola = "error";
		}
		return hola;

	}
}


