package modelo;

import javax.swing.JOptionPane;

public class Juego {
	int i;
	int[] numero;
	int[] adivina;
	public int intentos = 0;

	public Juego() {
		numero = new int[4];
		for(int i=0; i <4;i++) {
			numero [i]= (int) (Math.random()*9);
			System.out.println(numero[i]);
		}
		adivina = new int[4];
	}


	public boolean pedirNumero() {
			int m =0;
			boolean salida=false;
			rellenar();
					
		for (i = 0; i < 4; i++) {
			m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
			if(!verificarnumero(m,i)) {
				adivina[i]=m;
			}
			else {
				adivina[i]=0;
				JOptionPane.showMessageDialog(null, "¡Se repitio el numero!");
				salida =true;
			}
		}
		return salida;

	}
	public boolean verificarnumero(int numero, int numero2) {
		boolean n=false;
		
		for(int i =0; i<4; i++) {
			if(numero==adivina[i]&&i !=numero2) {
				n=true;
			}
			
		}
		return n;
	}
	

	public void rellenar() {
		for(int i=0; i <4;i++) {
			adivina[i]= -1;
		}
	}
	public int calcularFijas() {
		int contador = 0;
		for(int i=0; i<numero.length; i++) {			
			if(numero[i]==adivina[i]){
				contador ++;
			}

		}
		if(contador==4 ) {
			JOptionPane.showMessageDialog(null, "GANASTE");
		}
		return contador;
	}

	public int calcularPicas() {
		int contador2= 0;
		for (i=0; i<numero.length; i++) {
			for(int j=0; j<adivina.length; j++) {
				if(numero[i]==adivina[j] && i!=j) {
					contador2 ++;

				}
			}
		}
		return contador2;
	}
	
	public boolean cantidadIntentos() {
		
		intentos ++;
		return intentos!=10;
	}

}
