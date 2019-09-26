package Modelo;

public class PicasyFijas {
	
	public int picas = 0;
	public int fijas = 0;
	public int intentos = 10;
	public int numerospuestos[] = new int[4];
	public int numerosazar[] = new int[4];
	
	public int getPicas() {
		return picas;
	}
	public void setPicas(int picas) {
		this.picas = picas;
	}
	public int getFijas() {
		return fijas;
	}
	public void setFijas(int fijas) {
		this.fijas = fijas;
	}
	public int getIntentos() {
		return intentos;
	}
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	public int[] getNumerospuestos() {
		return numerospuestos;
	}
	public void setNumerospuestos(int[] numerospuestos) {
		this.numerospuestos = numerospuestos;
	}
	
	public int[] getNumerosazar() {
		return numerosazar;
	}
	public void setNumerosazar(int[] numerosazar) {
		this.numerosazar = numerosazar;
	}
	public void GenerarNumeroAleatorio() {
		
		for (int j = 0; j < 4; j++) {
			
			numerosazar[j] = (int) (Math.random()*9);
		}
	}
	
	public int VerificarFijas() {
		
		this.fijas = 0;
		
		for (int i = 0; i < numerosazar.length; i++) {
			
			if(numerospuestos[i] == numerosazar[i]) {
				
				this.fijas = fijas+1;
				
			}
			
		}
		return this.fijas;
		
	}
	
	public int VerificarPicas() {
		
		this.picas = 0;
		
		for (int i = 0; i < numerospuestos.length; i++) {
			
			for (int j = 0; j < numerosazar.length; j++) {
				
				if (numerospuestos[i] == numerosazar[j]) {
					
					this.picas = picas + 1;
					
				}
				
			}
	
		}
		return this.picas;
	}
	
	public void VerificarPartida() {
		if (numerospuestos == numerosazar) {
		
			
		}
		else {
			intentos = intentos - 1;
			if (intentos == 0) {
				
			}
		}
			
	}
	
	

	
}
