package vistaGUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel labPicas;
	private JLabel labFijas;
	private JTextField txtPicas;
	private JTextField txtFijas;
	
	public PanelResultados() {
		
		setLayout(new GridLayout(2, 2));
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		labPicas = new JLabel("El número de picas es:");
		txtPicas = new JTextField("");
		txtPicas.setForeground(Color.BLACK);
		txtPicas.setBackground(Color.WHITE);
		
		labFijas = new JLabel("El número de fijas es:");
		txtFijas = new JTextField("");
		txtFijas.setForeground(Color.BLACK);
		txtFijas.setBackground(Color.WHITE);
		
		add(labPicas);add(txtPicas);
		add(labFijas);add(txtFijas);
		
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
