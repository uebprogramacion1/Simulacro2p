package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Mundo;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener{
	private Mundo m;
	private VentanaPrincipal v;
	
	public Controlador() {
		m = new Mundo();
		v = new VentanaPrincipal(this);
		v.setVisible(true);
        m.getLog().asignarNumero();
        m.getLog().setNombreJugador(v.pedirNombre("Ingrese nombre: "));

	}
	int intento = 1;
	String ante = "";
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals(v.getP1().INTENTAR));
		v.getP2().getInte2().setText(ante);
		ante = v.getP1().getCampo().getText();
		v.getP2().getAct2().setText(v.getP1().getCampo().getText());
		v.getP2().getPicas2().setText(Integer.toString(m.getLog().getPicas()));
		v.getP2().getFijas2().setText(Integer.toString(m.getLog().getFijas()));
		v.getP2().getNumI().setText(Integer.toString(intento));
		m.getLog().setNumeroAdivinar(Integer.parseInt(v.getP1().getCampo().getText()));
		v.setVisible(m.getLog().numeroA(intento));
		v.getP2().getNumF().setText(Integer.toString(m.getLog().getFijas()));
		v.getP2().getNumP().setText(Integer.toString(m.getLog().getPicas()));v.getP1().getCampo().setText("");
		intento ++;
		if(m.getLog().isEscribir()==false) {
		m.getRes().escribirResultados(m.getLog().getNombreJugador(), m.getLog().getNumero(), intento-1, m.getLog().isGop());
		v.imprimirResultados(m.getRes().LeerResultados());
		}

	}
}
