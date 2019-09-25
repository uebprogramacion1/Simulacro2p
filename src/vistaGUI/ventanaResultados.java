package vistaGUI;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ventanaResultados {
	
	private JFileChooser buscador = new JFileChooser();
	
	public String darRutaResultados() {
		
		JOptionPane.showMessageDialog(null, "Elija donde guardar los resultados");
		
		buscador.showSaveDialog(buscador);
				
		String rutaSalida = buscador.getSelectedFile().getAbsolutePath();
		
		return rutaSalida;
}

}
