package modelo;

public class Mundo {
private PicasYFijas pyf;
private Resultado res;
public Mundo() {
	pyf=new PicasYFijas();
	res = new Resultado();
}
public PicasYFijas getPyf() {
	return pyf;
}
public void setPyf(PicasYFijas pyf) {
	this.pyf = pyf;
}
public Resultado getRes() {
	return res;
}
public void setRes(Resultado res) {
	this.res = res;
}

}
