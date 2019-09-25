package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import mundo.Mundo;
import vistaGUI.InterfazGUI;
import vistaGUI.PanelEntrada;

public class Controlador implements ActionListener{
	
	private Mundo mundo;
	
	private InterfazGUI gui;
	
	private int contador=2;
	
	private int k=0;
	
	private int[] resultadosImprimir;
	
	private int[] numerosParaAdivinar;
	private String ruta;
	
	public Controlador() {
		
		gui = new InterfazGUI(this);	
		
		ruta = gui.getvResultados().darRutaResultados();
		
		mundo = new Mundo(ruta );
		
		numerosParaAdivinar = mundo.getJuego().numerosPorAdivinar();
		
		gui.setVisible(true);
		
		resultadosImprimir = new int[40];
		
		
	}

	@Override
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
					JOptionPane.showMessageDialog(null, "¡Felidades, lo adivinaste!");
				}				
				
				
				
				
				System.out.println(numerosParaAdivinar[0] + " " + numerosParaAdivinar[1] + " " + numerosParaAdivinar[2] + " " + numerosParaAdivinar[3]);
				
				gui.getPanelEntrada().getTxtNumerosParaProbar0().setText("");				
					
				gui.getPanelEntrada().getLabIntento1().setText("Intento "+contador);
				
				
					for (int j = 0; j < numerosParaProbar.length; j++) {
						resultadosImprimir[k] = numerosParaProbar[j];
						k++;
					}
				
				
				contador++;	

				
			} else {
				
				String nums = numerosParaAdivinar[0] + " " + numerosParaAdivinar[1] + " " + numerosParaAdivinar[2] + " " + numerosParaAdivinar[3] ; 


				JOptionPane.showMessageDialog(null, "Excediste el número de intentos" + ". Respuesta: "+ nums);
			}
		
		
		}	impResultado();
		
			gui.imprimirResultados(mundo.getLec().leerResultados(ruta));
	}
	
	public void impResultado() {
		mundo.getResultado().escribirResultados(resultadosImprimir);
	}
	


}
