package Modelo;

public class PicasYFijas {
private int contador =4;
	public PicasYFijas() {

	}

	// Generador Numero Aleatorio;
	public int[] numeroAleatorio() {
		int[] numeroAleatorio = new int[4];
		for (int i = 0; i < numeroAleatorio.length; i++) {
			numeroAleatorio[i] = 1 + (int) (Math.random() * ((9 - 1) + 1));
		}
		return numeroAleatorio;
	}

	// Comparador de fijas
	public int Fijas(int[] numeroAleatorio, int[] numero) {
		int fijasCont = 0;
		for (int i = 0; i < numeroAleatorio.length; i++) {
			if (numeroAleatorio[i] == numero[i]) {
				fijasCont++;
			}
		}
		return fijasCont;

	}


	public int picas(int[] numeroAleatorio, int[] numero) {
			int picasCont = 0;
			for (int i = 0; i < numeroAleatorio.length; i++) {
				for (int j = 0; j < numero.length; j++) {
					if (i != j) {
						if (numeroAleatorio[i] == numero[i]) {
							picasCont++;
						
							
						}
					}

				}
				
			}
			return picasCont;
		} 
		
		
	
}

	
	

