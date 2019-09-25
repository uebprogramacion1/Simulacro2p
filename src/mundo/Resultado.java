package mundo;

import java.io.*;

public class Resultado {
	
	private File resultados;
	
	private FileWriter fileWriter;
	
	private PrintWriter printWriter;
	
	public Resultado(String rutaResultados) {
		
		resultados = new File(rutaResultados);
		
	}
	
	public void escribirResultados(int[] entradaJugador){
		
		int k = 0;
		
		try {
			
			fileWriter = new FileWriter(resultados);
			
			printWriter = new PrintWriter(fileWriter);
			
			String[] resultados = new String[entradaJugador.length];
			
			for (int i = 0; i < entradaJugador.length ; i++) {
				
				resultados[i] = entradaJugador[i]+ " ";
					
					printWriter.println(resultados[i]);
					
				
				
				
				}		
				
			fileWriter.close();
			
		} catch (Exception e) {
			
			System.out.println("error");
		}
		
		
	}

}
