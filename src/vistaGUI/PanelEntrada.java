package vistaGUI;

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
	
	private JLabel labIntento1;
	
	private JTextField txtNumerosParaProbar;
	
	private JButton butProbar;
	
	public JLabel getLabIntento1() {
		return labIntento1;
	}

	public void setLabIntento1(JLabel labIntento1) {
		this.labIntento1 = labIntento1;
	}

	public static final String PROBAR = "Probar";
	
	public PanelEntrada() {
		
		setLayout(new GridLayout(2, 2));
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		
		labIntento1 = new JLabel("Intento 1:");
		
		txtNumerosParaProbar = new JTextField("");
		txtNumerosParaProbar.setForeground(Color.BLACK);
		txtNumerosParaProbar.setBackground(Color.WHITE);
		
		butProbar = new JButton("Probar");
		butProbar.setActionCommand(PROBAR);
		
		add(labIntento1); add(txtNumerosParaProbar);
		add(new JLabel(""));add(butProbar);
		
		
	}
	public JTextField getTxtNumerosParaProbar0() {
		return txtNumerosParaProbar;
	}

	public void setTxtNumerosParaProbar0(JTextField txtNumerosParaProbar0) {
		this.txtNumerosParaProbar = txtNumerosParaProbar0;
	}

	public JButton getButProbar() {
		return butProbar;
	}

	public void setButProbar(JButton butProbar) {
		this.butProbar = butProbar;
	}

}
