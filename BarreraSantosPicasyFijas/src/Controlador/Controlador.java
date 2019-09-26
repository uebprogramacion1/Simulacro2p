package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Mundo;
import Vista.InterfazGUI;

public class Controlador implements ActionListener {

	private Mundo bd;
	
	private InterfazGUI gui;
	
	public Controlador() {
		
		bd = new Mundo();
		
		gui = new InterfazGUI(this);
		
		gui.setVisible(true);
		gui.Instrucciones();
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().JUGAR)) {
		
				
			
				gui.getPanelResultados().getTxtMonto().setText(gui.getPanelEntrada().getTxtNumero().getText());
				bd.getPf().GenerarNumeroAleatorio();
				bd.getPf().VerificarFijas();
				bd.getPf().VerificarPicas();
				bd.getPf().VerificarPartida();
				gui.getPanelEntrada().MostrarPartida(bd.getPf().getFijas(),bd.getPf().getPicas(),bd.getPf().getIntentos());
			
			}	
		
		
	}
		
}

