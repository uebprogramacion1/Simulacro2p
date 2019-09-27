package Vista;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JTextField txtNumero;
	private JButton butonComprobar;
	private JLabel labNombre;
	private JTextField txtnombre;
	protected String nombre;

	
	public static final String COMPROBAR = "COMPROBAR";
	
	
		public PanelEntrada() {
			setLayout( new GridLayout(2,2) );//se define el grid de 2x2
			TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
			border.setTitleColor(Color.BLACK);
			setBorder( border );
			labNombre= new JLabel("Digite su nombre               ");
			txtnombre=new JTextField("  ");
		    nombre = txtnombre.getText();
			
			
			labEntrada = new JLabel("\n Digite su Valor");
			txtNumero = new JTextField("");
			txtNumero.setForeground(Color.BLACK);
			txtNumero.setBackground(Color.WHITE);
			
			butonComprobar = new JButton("COMPROBAR");
			butonComprobar.setActionCommand(COMPROBAR);
			
			add(labNombre);
			add(txtnombre);
			add(labEntrada);
			add(txtNumero);
			add(new JLabel(""));
			add(butonComprobar);
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

	
		public JLabel getLabNombre() {
			return labNombre;
		}

		public void setLabNombre(JLabel labNombre) {
			this.labNombre = labNombre;
		}

	

		public JTextField getTxtnombre() {
			return txtnombre;
		}

		public void setTxtnombre(JTextField txtnombre) {
			this.txtnombre = txtnombre;
		}

		public JButton getButonComprobar() {
			return butonComprobar;
		}

		public void setButonComprobar(JButton butonComprobar) {
			this.butonComprobar = butonComprobar;
		}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
		

}
