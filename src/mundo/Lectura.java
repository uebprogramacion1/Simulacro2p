package mundo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Lectura {
	String linea;
	String ta;
	
	public String leerResultados(String ruta){
		
			try{
				
				FileReader fr = new FileReader(ruta);
				BufferedReader br = new BufferedReader(fr);
				
				 while((linea=br.readLine())!= null){ 
					 System.out.println(linea);
			          } 	  
			         br.close();
			            
			         return linea;   
			            
				} catch (IOException e){}
					return null;
					
				}


	public String getLinea() {
		return linea;
	}


	public void setLinea(String linea) {
		this.linea = linea;
	}
		
		
}



