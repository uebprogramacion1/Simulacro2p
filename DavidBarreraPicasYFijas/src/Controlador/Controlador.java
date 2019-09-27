package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.Mundo;
import Vista.Interfaz;
import Vista.PanelEntrada;


public class Controlador  implements ActionListener{
	private Mundo bd;	
	private Interfaz gui;
    private int intentos =1;
	private int [] numerosIntentos;
	
	
	public Controlador() {
	bd = new Mundo();
	gui = new Interfaz(this);
	
	
	numerosIntentos = bd.getP_f().numeroAleatorio();
	
	gui.setVisible(true);
	
	
	}
	@Override
	public void actionPerformed(ActionEvent Evento) {
		gui.getPanelEntrada();		
		
		if (Evento.getActionCommand().equals(PanelEntrada.COMPROBAR)) {
			
			if (intentos<10) {
				
				int numero[] = new int[4];
				
				for (int i = 0; i < numero.length; i++) {
					numero[i] = Integer.parseInt(gui.getPanelEntrada().getTxtNumero().getText().substring(i, i+1));
				}
						
				int picas = bd.getP_f().picas(numerosIntentos, numero);
				int fijas =bd.getP_f().Fijas(numerosIntentos, numero);
						
				gui.getPanelResultados().getTxtPicas().setText(picas + "");
				gui.getPanelResultados().getTxtFijas().setText(fijas + "");
				
				if (fijas==4) {
					JOptionPane.showMessageDialog(null, "HAS GANADO EL JUEGO !");
				}
				
				System.out.println(numerosIntentos[0] + " " + numerosIntentos[1] + " " + numerosIntentos[2] + " " + numerosIntentos[3]);
				
				gui.getPanelEntrada().getTxtNumero().setText("");				
					
				gui.getPanelEntrada().getLabEntrada().setText("Intento "+intentos);
				
				intentos++;	
				if(bd.getRes().escribirResultados(bd.getPaE().getNombre(), numerosIntentos, intentos, "Gano") != null)  {
					bd.getRes().escribirResultados(bd.getPaE().getNombre(), bd.getP_f().numeroAleatorio(), intentos, "Gano");
					gui.imprimirResultados(bd.getRes().LeerResultados());
				}
			} else {
				
				String respuesta = numerosIntentos[0] + " " + numerosIntentos[1] + " " + numerosIntentos[2] + " " + numerosIntentos[3] ; 

				JOptionPane.showMessageDialog(null, "GAMEOVER ,\n Alcansaste el numero de intentos" + " Respuesta: "+ respuesta);
			}
			if(bd.getRes().escribirResultados(bd.getPaE().getNombre(), numerosIntentos, intentos, "Perdio") != null) {
				bd.getRes().escribirResultados(bd.getPaE().getNombre(), bd.getP_f().numeroAleatorio(), intentos, "Perdio");
				gui.imprimirResultados(bd.getRes().LeerResultados());
			}
		
		}		
		
	}
}
