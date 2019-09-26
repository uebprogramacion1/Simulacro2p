package vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public String mostrarJuego(int i) {
		return null;
		//JOptionPane.showMessageDialog(null, i, "Juego",  JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void  mostrar(int contador,int contador2) {
		JOptionPane.showMessageDialog(null, contador+" fijas y "+contador2+" picas", "alv", JOptionPane.INFORMATION_MESSAGE);
	}


}
