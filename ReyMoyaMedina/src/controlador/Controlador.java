package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Mundo;
import vista.InterfazGUI;

public class Controlador implements ActionListener  {
	private Mundo m;
	private InterfazGUI gui;
	public Controlador() {
		m= new Mundo();
		gui=new InterfazGUI(this);
		m.getPyf().crearNumero();
		gui.setVisible(true);
		gui.getPanelResultados().getLabVidas().setText("Vidas: "+Integer.toString(m.getPyf().getVidas()));
		gui.getPanelResultados().getLabPicas().setText("Numero de picas:");
		gui.getPanelResultados().getLabFijas().setText("Numero de Fijas:");
		}
	 public void actionPerformed(ActionEvent evento) {
	    	if(evento.getActionCommand().contentEquals(gui.getPanelEntrada().COMPARAR)) {
	         if(m.getPyf().getVidas()>0&&m.getPyf().getFijas()<4) {
	        	 try
	        	 {
	        		 verificar(gui.getPanelEntrada().getTxtNumero1().getText(), gui.getPanelEntrada().getTxtNumero2().getText(), gui.getPanelEntrada().getTxtNumero3().getText(), gui.getPanelEntrada().getTxtNumero4().getText());
	        		 gui.getPanelResultados().getTxtMostar().setText(m.getPyf().darResultados(Integer.parseInt(gui.getPanelEntrada().getTxtNumero1().getText())
	        			 , Integer.parseInt(gui.getPanelEntrada().getTxtNumero2().getText())
	        			 , Integer.parseInt(gui.getPanelEntrada().getTxtNumero3().getText()),
	        			 Integer.parseInt(gui.getPanelEntrada().getTxtNumero4().getText())));
	        	 }
	        	 catch(NumberFormatException e)
	        	 {
	        		 JOptionPane.showMessageDialog(null, "Por favor ingresar unicamente numeros validos entre el 0 y el 9", "Error", JOptionPane.ERROR_MESSAGE);
	        		 m.getPyf().noLeAtino();
	        		 gui.getPanelResultados().getLabVidas().setText("Numeros de vidas: "+Integer.toString(m.getPyf().getVidas()));
	        	 }
	         }
	         else {
	        	 gui.getPanelResultados().getTxtMostar().setText(m.getPyf().darFinal());
	        	 m.getRes().escribirResultados(m.getPyf().darFinal1(gui.getPanelEntrada().getTxtNombre().getText()));
	        	 gui.getPanelResultados().imprimirResultados(m.getRes().leerResultados());
	         }
	         gui.getPanelResultados().getLabFijas().setText("Numero de fijas: "+Integer.toString(m.getPyf().getFijas()));
	         gui.getPanelResultados().getLabPicas().setText("Numero de picas: "+Integer.toString(m.getPyf().getPicas()));
	         gui.getPanelResultados().getLabVidas().setText("Numeros de vidas: "+Integer.toString(m.getPyf().getVidas()));
	         gui.getPanelEntrada().getTxtNumero1().setText(null);
	         gui.getPanelEntrada().getTxtNumero2().setText(null);
	         gui.getPanelEntrada().getTxtNumero3().setText(null);
	         gui.getPanelEntrada().getTxtNumero4().setText(null);
	         gui.getPanelEntrada().getTxtNumero1().grabFocus();
	         m.getPyf().darFinal1(gui.getPanelEntrada().getTxtNombre().getText());
	         
	    	}
	    	
	    }
	 
	 public void verificar(String num1, String num2, String num3, String num4)
	 {
		 if(Integer.parseInt(num1) > 9)
		 {
			 JOptionPane.showMessageDialog(null, "El numero 1 no es valido, por favor ingrese numeros del 0 al 9", "", JOptionPane.ERROR_MESSAGE);
		 }
		 if(Integer.parseInt(num2) > 9)
		 {
			 JOptionPane.showMessageDialog(null, "El numero 2 no es valido, por favor ingrese numeros del 0 al 9", "", JOptionPane.ERROR_MESSAGE);
		 }
		 if(Integer.parseInt(num3) > 9)
		 {
			 JOptionPane.showMessageDialog(null, "El numero 3 no es valido, por favor ingrese numeros del 0 al 9", "", JOptionPane.ERROR_MESSAGE);
		 }
		 if(Integer.parseInt(num4) > 9)
		 {
			 JOptionPane.showMessageDialog(null, "El numero 4 no es valido, por favor ingrese numeros del 0 al 9", "", JOptionPane.ERROR_MESSAGE);
		 }
	 }

}
