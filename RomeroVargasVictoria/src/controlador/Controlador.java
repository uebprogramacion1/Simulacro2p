package controlador;

import javax.swing.JOptionPane;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {

	private Mundo m;
	private Interfaz gui;
	
	public Controlador() {
		
		m = new Mundo();
		gui = new Interfaz();
		while (m.getJuego().cantidadIntentos()) {
			JOptionPane.showMessageDialog(null, m.getJuego().intentos+" intento", "alv", JOptionPane.INFORMATION_MESSAGE);
			if (!m.getJuego().pedirNumero()) {				
				gui.mostrar(m.getJuego().calcularFijas(),m.getJuego().calcularPicas());
			}
			
		}
		
	}
	
}
