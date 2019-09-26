package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
	public class PanelEntrada extends JPanel{
		private static final long serialVersionUID =1L;
		private JLabel labNombre;
	    private JTextField txtNombre;
		private JLabel labEntrada1;
	    private JTextField txtNumero1;
	    private JLabel labEntrada2;
	    private JTextField txtNumero2;
	    private JLabel labEntrada3;
	    private JTextField txtNumero3;
	    private JLabel labEntrada4;
	    private JTextField txtNumero4;
	    private JButton butComparar;
	    public static final String COMPARAR ="Comparar";
	    public PanelEntrada() {
	    	setLayout(new GridLayout(6,2));
	    	TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
	    	border.setTitleColor(Color.BLACK);
	    	setBorder(border);
	    	labNombre = new JLabel("Digite nombre: ");
	    	txtNombre = new JTextField("");
	    	labEntrada1 = new JLabel("Digite el primer valor: ");
	    	txtNumero1 = new JTextField("");
	    	txtNumero1.setForeground(Color.BLACK);
	    	txtNumero1.setBackground(Color.WHITE);
	    	labEntrada2 = new JLabel("Digite el segundo valor: ");
	    	txtNumero2 = new JTextField("");
	    	txtNumero2.setForeground(Color.BLACK);
	    	txtNumero2.setBackground(Color.WHITE);
	    	labEntrada3 = new JLabel("Digite el tercer valor: ");
	    	txtNumero3 = new JTextField("");
	    	txtNumero3.setForeground(Color.BLACK);
	    	txtNumero3.setBackground(Color.WHITE);
	    	labEntrada4 = new JLabel("Digite el cuarto valor: ");
	    	txtNumero4 = new JTextField("");
	    	txtNumero4.setForeground(Color.BLACK);
	    	txtNumero4.setBackground(Color.WHITE);
	    	butComparar = new JButton("Comparar");
	    	butComparar.setActionCommand(COMPARAR);
	    	add(labNombre);
	    	add(txtNombre);
	    	add(labEntrada1);
	    	add(txtNumero1);
	    	add(labEntrada2);
	    	add(txtNumero2);
	    	add(labEntrada3);
	    	add(txtNumero3);
	    	add(labEntrada4);
	    	add(txtNumero4);
	    	add(new JLabel(""));
	    	add(butComparar);
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
		public JLabel getLabEntrada4() {
			return labEntrada4;
		}
		public void setLabEntrada4(JLabel labEntrada4) {
			this.labEntrada4 = labEntrada4;
		}
		public JTextField getTxtNumero4() {
			return txtNumero4;
		}
		public void setTxtNumero4(JTextField txtNumero4) {
			this.txtNumero4 = txtNumero4;
		}
		public JButton getButComparar() {
			return butComparar;
		}
		public void setButComparar(JButton butComparar) {
			this.butComparar = butComparar;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public static String getComparar() {
			return COMPARAR;
		}
		public JLabel getLabNombre() {
			return labNombre;
		}
		public void setLabNombre(JLabel labNombre) {
			this.labNombre = labNombre;
		}
		public JTextField getTxtNombre() {
			return txtNombre;
		}
		public void setTxtNombre(JTextField txtNombre) {
			this.txtNombre = txtNombre;
		}
		
		
		
	    
	}


