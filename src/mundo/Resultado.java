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
			fileWriter = new FileWriter(resultados,true);			
			printWriter = new PrintWriter(fileWriter);			
			printWriter.println("Jugador: "+nommbreJugador + " || " +"Número por adivinar: "+ Arrays.toString(numeroPorAdivinar)+ " || "+"Total intentos: "+ totalIntentos + " || "+"Estado: " + estado);							
			fileWriter.close();			
		} catch (Exception e) {			
			System.out.println("error");
		}		
	}
}
