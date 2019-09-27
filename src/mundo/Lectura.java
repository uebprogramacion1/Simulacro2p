package mundo;

import java.io.*;

public class Lectura {
	
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private String ultimaLinea = "";
	private String linea;
	
	public String leerResultados(String ruta){		
		try{
			fileReader = new FileReader(ruta);
			bufferedReader = new BufferedReader(fileReader);
			//linea = bufferedReader.readLine();
			while((linea=bufferedReader.readLine()) != null){
				ultimaLinea=linea;
			}
					
			fileReader.close();
			} catch (IOException e){
				System.out.println("error");
			}
			return ultimaLinea;	
	}
		
		
}



