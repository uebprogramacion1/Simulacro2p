package Modelo;

import java.io.*;

public class Resultados{

		private File file; // Archivo
		private FileWriter fileWriter;// escribe el archivo
		private FileReader fileReader; // lee el archivo
		private PrintWriter printWriter; 
		private BufferedReader bufferedReader;
	

	public String escribirArchivo(String pLinea)
	{
		try 
		{
			File elDirectorio = new File("./docs/Archivo");
			if(!elDirectorio.exists())
			{
				elDirectorio.mkdir();
			}
			file = new File(elDirectorio+"/resultados.txt");
			fileWriter = new FileWriter(file);
			printWriter = new PrintWriter(fileWriter);
			for (int i = 0; i < 1; i++) 
			{
				printWriter.println(pLinea);
			}
			fileWriter.close();
		}
		catch (IOException e) 
		{
			return "Ocurrio un error en la escritura del archivo.\n Causas: "+e.getMessage();
		}
		return "Se ha creado el archivo correctamente en "+file.getAbsolutePath();
	}
	
	public String lecturaArchivo() {
	
		String lineaAnterior = "";
		try 
		{
			File elDirectorio = new File("./docs/Archivo/resultados.txt");
			file = new File(elDirectorio+"/");
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String linea = bufferedReader.readLine();
			while(linea != null) {
			
				lineaAnterior += linea +"\n";
				linea = bufferedReader.readLine();
			}
			fileReader.close();
	}
			catch (IOException e) 
			{
				return "Ocurrio un error en la lectura del archivo.\n";
			}
		
		return lineaAnterior;
	}
	
}




