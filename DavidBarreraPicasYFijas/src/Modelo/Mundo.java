package Modelo;

import Vista.PanelEntrada;
import Vista.PanelResultados;

public class Mundo {

	private PicasYFijas p_f;
	private Resultados res;
	private PanelEntrada PaE;
	private PanelResultados PaR;

	public Mundo() {
		p_f = new PicasYFijas();
		res= new Resultados();
		PaE=new PanelEntrada();
		PaR=new PanelResultados();

	}

	public PicasYFijas getP_f() {
		return p_f;
	}

	public void setP_f(PicasYFijas p_f) {
		this.p_f = p_f;
	}

	public Resultados getRes() {
		return res;
	}

	public void setRes(Resultados res) {
		this.res = res;
	}

	public PanelEntrada getPaE() {
		return PaE;
	}

	public void setPaE(PanelEntrada paE) {
		PaE = paE;
	}

	public PanelResultados getPaR() {
		return PaR;
	}

	public void setPaR(PanelResultados paR) {
		PaR = paR;
	}
	
}
