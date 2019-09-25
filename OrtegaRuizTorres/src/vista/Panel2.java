package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Panel2 extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel inte,act,picas,fijas, numI,ante;
	private JTextField numP,numF,picas2,fijas2,inte2,act2;

	

	public Panel2() {

		setLayout(new GridLayout(4,4));
		setBackground(Color.gray);
		TitledBorder borde = BorderFactory.createTitledBorder("PICAS Y FIJAS");
		borde.setTitleColor(Color.green);
		setBorder(borde);
		act = new JLabel("NUMERO ACTUAL:");
		act2 = new JTextField("");
		act.setForeground(Color.white);
		ante = new JLabel("NUMERO ANTERIOR:");
		ante.setForeground(Color.white);
		picas2 = new JTextField("");
		picas2.setEditable(false);
		fijas2 = new JTextField("");
		fijas2.setEditable(false);
		inte2 = new JTextField("");
		inte2.setEditable(false);
		inte = new JLabel("NUM. INTENTOS:");
		inte.setForeground(Color.white);
		picas = new JLabel("PICAS:");
		picas.setForeground(Color.white);
		fijas = new JLabel("FIJAS:");
		fijas.setForeground(Color.white);
		numI = new JLabel("0");
		numI.setForeground(Color.white);
		numP = new JTextField();
		numP.setEditable(false);
		numF = new JTextField();
		numF.setEditable(false);
		add(inte);
		add(act);
		add(picas);
		add(fijas);
		add(numI);
		add(act2);
		add(numP);
		add(numF);
		add(new JLabel(""));
		add(ante);
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(inte2);
		add(picas2);
		add(fijas2);
}
	public JLabel getInte() {
		return inte;
	}


	public void setInte(JLabel inte) {
		this.inte = inte;
	}


	public JLabel getPicas() {
		return picas;
	}


	public void setPicas(JLabel picas) {
		this.picas = picas;
	}


	public JLabel getFijas() {
		return fijas;
	}


	public void setFijas(JLabel fijas) {
		this.fijas = fijas;
	}
	public JTextField getNumP() {
		return numP;
	}


	public void setNumP(JTextField numP) {
		this.numP = numP;
	}


	public JTextField getNumF() {
		return numF;
	}

	public void setNumF(JTextField numF) {
		this.numF = numF;
	}

	public JLabel getNumI() {
		return numI;
	}
	public void setNumI(JLabel numI) {
		this.numI = numI;
	}
	public JTextField getPicas2() {
		return picas2;
	}
	public void setPicas2(JTextField picas2) {
		this.picas2 = picas2;
	}
	public JTextField getFijas2() {
		return fijas2;
	}
	public void setFijas2(JTextField fijas2) {
		this.fijas2 = fijas2;
	}
	public JTextField getInte2() {
		return inte2;
	}
	public void setInte2(JTextField inte2) {
		this.inte2 = inte2;
	}
	public JLabel getAnte() {
		return ante;
	}
	public void setAnte(JLabel ante) {
		this.ante = ante;
	}
	public JTextField getAct2() {
		return act2;
	}
	public void setAct2(JTextField act2) {
		this.act2 = act2;
	}

}