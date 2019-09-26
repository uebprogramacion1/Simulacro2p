package Vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private	JTextField txtNumero;
	private JLabel labEntrada1;
	private JTextField txtNumero1;
	private JLabel labEntrada2;
	private JTextField txtNumero2;
	private JLabel labEntrada3;
	private JTextField txtNumero3;
	private JButton butJugar;
	public static final String JUGAR = "Jugar";
	
	public PanelEntrada() {
		
		setLayout(new GridLayout(5,5));
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		labEntrada = new JLabel ("Digite un Numero de 4 Digitos:");
		txtNumero = new JTextField("");
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		
		butJugar = new JButton ("Jugar");
		butJugar.setActionCommand(JUGAR);
		
		add(labEntrada);
		add(txtNumero);
		add(new JLabel (""));
		add(butJugar);
	}
	
	public void MostrarPartida(int pFijas,int pPicas, int pVidas) {
		
		String mensaje = "\n Picas = "+pPicas+"\n Fijas= "+pFijas + "\n Vidas = "+ pVidas;
		JOptionPane.showMessageDialog(null,mensaje);

		
	}
	

	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JLabel getLabEntrada1() {
		return labEntrada1;
	}

	public void setLabEntrada1(JLabel labEntrada1) {
		this.labEntrada1 = labEntrada1;
	}

	public JTextField getTxtNumero1() {
		return txtNumero1;
	}

	public void setTxtNumero1(JTextField txtNumero1) {
		this.txtNumero1 = txtNumero1;
	}

	public JLabel getLabEntrada2() {
		return labEntrada2;
	}

	public void setLabEntrada2(JLabel labEntrada2) {
		this.labEntrada2 = labEntrada2;
	}

	public JTextField getTxtNumero2() {
		return txtNumero2;
	}

	public void setTxtNumero2(JTextField txtNumero2) {
		this.txtNumero2 = txtNumero2;
	}

	public JLabel getLabEntrada3() {
		return labEntrada3;
	}

	public void setLabEntrada3(JLabel labEntrada3) {
		this.labEntrada3 = labEntrada3;
	}

	public JTextField getTxtNumero3() {
		return txtNumero3;
	}

	public void setTxtNumero3(JTextField txtNumero3) {
		this.txtNumero3 = txtNumero3;
	}

	public JButton getButJugar() {
		return butJugar;
	}

	public void setButJugar(JButton butJugar) {
		this.butJugar = butJugar;
	}

	
	

}
