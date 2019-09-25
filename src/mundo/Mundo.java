package mundo;

public class Mundo {
	
	private Juego juego;
	private Resultado resultado;
	
	private Lectura lec;
	
	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public Mundo(String rutaResultados) {
		juego = new Juego();
		resultado = new Resultado(rutaResultados);
		lec = new Lectura();
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}
	public Lectura getLec() {
		return lec;
	}

	public void setLec(Lectura lec) {
		this.lec = lec;
	}


}
