package vista;

import java.awt.*;

import javax.swing.*;

import controlador.Controlador;

public class InterfazGUI extends JFrame {
private PanelEntrada panelEntrada;
private PanelResultados panelResultados;
	private static final long serialVersionUID = 1L;
	public InterfazGUI(Controlador control) 
	{
		setSize(400,300);
		setResizable(false);
		setTitle("Picas y Fijas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);
		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout.CENTER);
		
		panelEntrada.getButComparar().addActionListener(control);
	}
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
