package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Panel1 extends JPanel{

	private JLabel texto;
	private JTextField campo;
	private JButton boton;
	public static final String INTENTAR = "intentar";
	private static final long serialVersionUID = 1L;
	public Panel1() {
		setLayout(new GridLayout(2,2));
		setBackground(Color.gray);
		TitledBorder borde = BorderFactory.createTitledBorder("NUMERO ADIVINAR");
		borde.setTitleColor(Color.green);
		setBorder(borde);
		texto = new JLabel("DIGITE UN NUMERO:");
		texto.setForeground(Color.white);
		campo = new JTextField("");
		boton = new JButton("JUGAR");
		boton.setActionCommand("INTENTAR");
		add(texto);
		add(campo);
		add(new JLabel(""));
		add(boton);
	}
	public JLabel getTexto() {
		return texto;
	}
	public void setTexto(JLabel texto) {
		this.texto = texto;
	}
	public JTextField getCampo() {
		return campo;
	}
	public void setCampo(JTextField campo) {
		this.campo = campo;
	}
	public JButton getBoton() {
		return boton;
	}
	public void setBoton(JButton boton) {
		this.boton = boton;
	}


}
