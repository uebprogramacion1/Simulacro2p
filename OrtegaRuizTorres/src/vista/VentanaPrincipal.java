package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controlador.Controlador;

public class VentanaPrincipal extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Panel1 p1;
	private Panel2 p2;
	public VentanaPrincipal(Controlador control) {
		setSize(550,250);
		setResizable(false);
		setTitle("PICAS Y FIJAS");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		p1 = new Panel1();
		add(p1,BorderLayout.NORTH);
		p2 = new Panel2();
		add(p2,BorderLayout.CENTER);
		p1.getBoton().addActionListener(control);
		
	}
	public String pedirNombre(String a) {
		String d = JOptionPane.showInputDialog(a);
		return d;
		
	}
	public void imprimirResultados(String cadena) {
		JOptionPane.showMessageDialog(null, cadena);
		
	}
	public Panel1 getP1() {
		return p1;
	}
	public void setP1(Panel1 p1) {
		this.p1 = p1;
	}
	public Panel2 getP2() {
		return p2;
	}
	public void setP2(Panel2 p2) {
		this.p2 = p2;
	}
	

}
