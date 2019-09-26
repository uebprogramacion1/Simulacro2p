package vista;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{
      private static final long serialVersionUID = 1L;
      private JLabel labResultado;
      private JTextField txtMostar;
      private JLabel labVidas;
      private JLabel labPicas;
      private JLabel labFijas;
      
      public PanelResultados(){
    	  setLayout(new GridLayout(3,2));
    	  TitledBorder border = BorderFactory.createTitledBorder("");
    	  border.setTitleColor(Color.BLACK);
    	  setBorder(border);
    	  labResultado = new JLabel("Resultado: ");
    	  labFijas = new JLabel(" ");
    	  labVidas = new JLabel(" ");
    	  labPicas = new JLabel("");
    	  txtMostar = new JTextField("");
    	  txtMostar.setEditable(false);
    	  txtMostar.setForeground(Color.BLACK);
    	  txtMostar.setBackground(Color.WHITE);
    	  add(labFijas);
    	  add(labPicas);
    	  add(labVidas);
    	  add(new JLabel(""));
    	  add(labResultado);
    	  add(txtMostar);
      }
	public JLabel getLabVidas() {
		return labVidas;
	}
	public void setLabVidas(JLabel labVidas) {
		this.labVidas = labVidas;
	}
	public JLabel getLabPicas() {
		return labPicas;
	}
	public void setLabPicas(JLabel labPicas) {
		this.labPicas = labPicas;
	}
	public JLabel getLabFijas() {
		return labFijas;
	}
	public void setLabFijas(JLabel labFijas) {
		this.labFijas = labFijas;
	}
	public JLabel getLabResultado() {
		return labResultado;
	}
	public void setLabResultado(JLabel labResultado) {
		this.labResultado = labResultado;
	}
	
	public JTextField getTxtMostar() {
		return txtMostar;
	}
	public void setTxtMostar(JTextField txtMostar) {
		this.txtMostar = txtMostar;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void imprimirResultados(String mensaje) 
	{
		JOptionPane.showMessageDialog(null,
				mensaje,
				"Datos juegos",
				JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
      
}
