package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Resultado {
	public String escribirResultados(String resultado)   
	{
		String mensaje = "";
		File f = new File("Archivo/resultados.txt");
		try 
		{
			FileWriter fw = new FileWriter(f,true);
			PrintWriter pw = new PrintWriter(fw);
			
				pw.println(resultado);
			
			mensaje ="Creado correctamente. ";
			fw.close();
		} 
		catch (IOException e) 
		{
			mensaje = "Error al escribir archivo.";
		}
		return mensaje;
	}

	public String  leerResultados() 
	{
		String mensaje ="";
		File f = new File("Archivo/resultados.txt");
		try
		{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea ;
			while ((linea=br.readLine()) != null) {
				
				mensaje += linea+". \n";
			}
			fr.close();
		}
		catch (IOException e) 
		{
			mensaje = "Error";
		}
		return mensaje;
	}

}
