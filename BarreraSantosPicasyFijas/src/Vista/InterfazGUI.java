package Vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Controlador.Controlador;

public class InterfazGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public PanelEntrada panelEntrada;
	
	public PanelResultados panelResultados;
	
	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}
	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}
	
	public PanelResultados getPanelResultados() {
		return panelResultados;
	}
	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}
	public InterfazGUI(Controlador control) {
		
		setSize(300,300);
		setResizable(false);
		setTitle("Picas y Fijas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);
		
		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout.SOUTH);
		
		panelEntrada.getButJugar().addActionListener(control);
		
	}
	
	public void Instrucciones() {
		
		JOptionPane.showMessageDialog(null, "Instrucciones: Usted debe adivinar un numero de 4 digitos. Tiene 10 oportunidades, en las que se le irá informando el número de picas y fijas \n"
				+ " Picas: Número correcto en posicion incorrecta \n "
				+ "Fijas: Número correcto en posicion correcta ","Picas y Fijas",JOptionPane.WARNING_MESSAGE);
			
	}

}
