package modelo;

public class Mundo {
	private Juego ju;

	public Juego getJuego() {
		return ju;
	}

	public void setJuego(Juego juego) {
		this.ju = juego;
	}
	
	public Mundo() {
		ju = new Juego();
		
	}

}
