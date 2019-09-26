package mundo;

import java.io.*;

public class Lectura {
	
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	
	private String linea;
	
	public String leerResultados(String ruta){		
		try{
			fileReader = new FileReader(ruta);
			bufferedReader = new BufferedReader(fileReader);
			linea = bufferedReader.readLine();				  
			fileReader.close();
			} catch (IOException e){
				System.out.println("error");
			}
			return linea;	
	}
		
		
}



