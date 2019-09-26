package mundo;

import java.io.*;
import java.util.Arrays;

public class Resultado {
	
	private File resultados;	
	private FileWriter fileWriter;	
	private PrintWriter printWriter;
	
	public Resultado(String rutaResultados) {		
		resultados = new File(rutaResultados);		
	}
	
	public void escribirResultados(String nommbreJugador, int[] numeroPorAdivinar, int totalIntentos, String estado){			
		try {			
			fileWriter = new FileWriter(resultados);			
			printWriter = new PrintWriter(fileWriter);			
			printWriter.println(nommbreJugador + "; " + Arrays.toString(numeroPorAdivinar)+ "; "+ totalIntentos + "; " + estado);				
			fileWriter.close();			
		} catch (Exception e) {			
			System.out.println("error");
		}		
	}
}
