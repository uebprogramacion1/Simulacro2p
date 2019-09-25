package modelo;

import javax.swing.JOptionPane;

public class Logica {
	private int numero;
	private int numeroAdivinar;
	private String cadena;
	private String aux1;
	private char[] caracteres;
	private char[] arregloAdivinar;
	private String nombreJugador;
	private int fijas;
	private int picas;
	private boolean gop;
	private boolean escribir;
	public Logica() {
		caracteres = new char[3];
		arregloAdivinar = new char[3];
		numeroAdivinar = 0;
		numero =(int)(Math.random()*9999+1000);
		cadena ="";
		aux1 = "";
	}
	public void asignarNumero() {
		cadena = Integer.toString(numero);
		caracteres = cadena.toCharArray();	
		while(caracteres[0]==caracteres[1] || caracteres[0]==caracteres[2] || caracteres[0]==caracteres[3] ||
				caracteres[1]==caracteres[0] || caracteres[1]==caracteres[2] || caracteres[1]==caracteres[3] ||
				caracteres[2]==caracteres[0] || caracteres[2]==caracteres[1] || caracteres[2]==caracteres[3] ||
				caracteres[3]==caracteres[0] || caracteres[3]==caracteres[1] || caracteres[3]==caracteres[2]||
				numero>9999) {
			numero = (int)(Math.random()*9999+1000);
			cadena = Integer.toString(numero);
			caracteres = cadena.toCharArray(); 
		}
	}
	public boolean numeroA(int intento) {
		escribir = true;
		picas = 0;
		fijas = 0;
		aux1 = Integer.toString(numeroAdivinar);
		arregloAdivinar = aux1.toCharArray(); 
		for (int i = 0; i < caracteres.length; i++) {
			if(caracteres[i]==arregloAdivinar[i]) {
				fijas++;
			}else if(caracteres[i]==arregloAdivinar[0]||caracteres[i]==arregloAdivinar[1]||caracteres[i]==arregloAdivinar[2]||caracteres[i]==arregloAdivinar[3]) {
				picas++;
			}
		}if(fijas==4) {
			escribir = false;
			gop = true;
			JOptionPane.showMessageDialog(null, "CONGRATULATIONS!!!");
		}if(intento>9) {
			escribir = false;
			gop = false;
			JOptionPane.showMessageDialog(null, "HAZ PERDIDO, EL NUMERO ERA "+numero);

		}
		return escribir;
	}
	public int getNumeroAdivinar() {
		return numeroAdivinar;
	}
	public void setNumeroAdivinar(int numeroAdivinar) {
		this.numeroAdivinar = numeroAdivinar;
	}
	public int getFijas() {
		return fijas;
	}
	public void setFijas(int fijas) {
		this.fijas = fijas;
	}
	public int getPicas() {
		return picas;
	}
	public void setPicas(int picas) {
		this.picas = picas;
	}
	public String getNombreJugador() {
		return nombreJugador;
	}
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	public boolean isGop() {
		return gop;
	}
	public void setGop(boolean gop) {
		this.gop = gop;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isEscribir() {
		return escribir;
	}
	public void setEscribir(boolean escribir) {
		this.escribir = escribir;
	}
	
	

}
