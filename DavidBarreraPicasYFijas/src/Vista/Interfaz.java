package Vista;

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Controlador.Controlador;

import Vista.PanelEntrada;
import Vista.PanelResultados;


public class Interfaz extends JFrame {
	
private static final long serialVersionUID = 1L;
	
	private PanelEntrada panelEntrada;
	private PanelResultados panelResultados;

	public Interfaz(Controlador Evento){
	
	setSize(500,400);
	setResizable(false);
	setTitle("JUEGO DE FIJAS Y PICAS ");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setLayout( new BorderLayout());
	
	panelEntrada = new PanelEntrada();
	add(panelEntrada,BorderLayout.NORTH);
	
	panelResultados = new PanelResultados();
	add(panelResultados,BorderLayout.CENTER);
	
	
	panelEntrada.getButonComprobar().addActionListener(Evento);
	
	
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
	public String pedirNombre(String a) {
		String d = JOptionPane.showInputDialog(a);
		return d;
		
	}
	public void imprimirResultados(String cadena) {
		JOptionPane.showMessageDialog(null, cadena);
		
	}


	
		
	}
	