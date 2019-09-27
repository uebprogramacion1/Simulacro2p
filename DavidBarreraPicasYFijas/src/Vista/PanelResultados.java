package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JLabel labPicas;
	private JLabel labFijas;
	private JTextField txtPicas;
	private JTextField txtFijas;
	
	public PanelResultados() {
		
	setLayout( new GridLayout(2,1));
	TitledBorder border = BorderFactory.createTitledBorder("Resultados");
	border.setTitleColor(Color.BLACK);
	setBorder( border );
	
	labFijas = new JLabel("La Cantidad de Fijas : ");
	txtFijas = new JTextField("");
	txtFijas.setForeground(Color.BLACK);
	txtFijas.setBackground(Color.WHITE);
	
	labPicas = new JLabel("La Cantidad de Picas : ");
	txtPicas = new JTextField("");
	txtPicas.setForeground(Color.BLACK);
	txtPicas.setBackground(Color.WHITE);
	
	add(labFijas);
	add(txtFijas);
	add(labPicas);
	add(txtPicas);
			
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

	public JTextField getTxtPicas() {
		return txtPicas;
	}

	public void setTxtPicas(JTextField txtPicas) {
		this.txtPicas = txtPicas;
	}

	public JTextField getTxtFijas() {
		return txtFijas;
	}

	public void setTxtFijas(JTextField txtFijas) {
		this.txtFijas = txtFijas;
	}

	
	
}
