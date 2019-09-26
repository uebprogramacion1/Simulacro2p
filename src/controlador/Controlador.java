package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import mundo.Mundo;
import vistaGUI.InterfazGUI;
import vistaGUI.PanelEntrada;

public class Controlador implements ActionListener{
	
	private Mundo mundo;	
	private InterfazGUI gui;	
	private int contador=2;		
	private int[] numerosParaAdivinar;
	private String ruta;
	private String estado="";//perdió o ganó.
	
	public Controlador() {		
		gui = new InterfazGUI(this);		
		ruta = gui.getvResultados().darRutaResultados();		
		mundo = new Mundo(ruta );		
		numerosParaAdivinar = mundo.getJuego().numerosPorAdivinar();		
		gui.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent evento) {		
		gui.getPanelEntrada();			
		if (evento.getActionCommand().equals(PanelEntrada.PROBAR)) {
			if (contador<12) {				
				int numerosParaProbar[] = new int[4];				
				for (int i = 0; i < numerosParaProbar.length; i++) {					
					numerosParaProbar[i] = Integer.parseInt(gui.getPanelEntrada().getTxtNumerosParaProbar0().getText().substring(i, i+1));
				}						
				int picas = mundo.getJuego().darNumPicas(numerosParaAdivinar, numerosParaProbar);
				int fijas = mundo.getJuego().darNumFijas(numerosParaAdivinar, numerosParaProbar);						
				gui.getPanelResultados().getTxtPicas().setText(picas + "");
				gui.getPanelResultados().getTxtFijas().setText(fijas + "");				
				if (fijas==4) {
					estado = "Ganó";
				}								
				gui.getPanelEntrada().getTxtNumerosParaProbar0().setText("");						
				gui.getPanelEntrada().getLabIntento1().setText("Intento "+contador);				
				contador++;					
			} else {				
				estado="Perdió";
			}

		mundo.getResultado().escribirResultados(gui.getPanelEntrada().getTxtNombreJugador().getText(), numerosParaAdivinar, contador, estado);
		if(contador==12) {
			gui.imprimirResultados(mundo.getLec().leerResultados(ruta));
		}
		}
		
	}
}
