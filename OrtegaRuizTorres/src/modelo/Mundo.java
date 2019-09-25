package modelo;

public class Mundo {
	private Logica log;
	private Resultados res;
	public Mundo() {
		log = new Logica();
		res = new Resultados();
	}
	
	public Resultados getRes() {
		return res;
	}

	public void setRes(Resultados res) {
		this.res = res;
	}

	public Logica getLog() {
		return log;
	}
	public void setLog(Logica log) {
		this.log = log;
	}
	

}
