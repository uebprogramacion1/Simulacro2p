package modelo;

import javax.swing.JOptionPane;

public class PicasYFijas {
	 private int  vidas = 10, intentos =0;
	 private int picas;
	 private int fijas;
	 private int n=0;
	int[] Num1;
	int[] Num ;
	public PicasYFijas() {
		Num1 = new int[4];
		Num = new int[4];	
	}
	public void crearNumero() {
	int numero = (int) (Math.random()*9);
			Num[0]=numero;
		boolean guardado1 =false;
		for(;guardado1!=true;n++) {
		int numero1 = (int) (Math.random()*9);
		if(numero1!=Num[0]) {
			Num[1]=numero1;
			guardado1 =true;
			}
		}
		boolean guardado2 =false;
		for(;guardado2!=true;n++) {
		int numero2 = (int) (Math.random()*9);
		if(numero2!=Num[0]&&numero2!=Num[1]) {
			Num[2]=numero2;
			guardado2 = true;
			}
		}
		boolean guardado3 =false;
		for(;guardado3!=true;n++){
		int numero3 = (int) (Math.random()*9);
		if(numero3!=Num[0]&&numero3!=Num[1]&&numero3!=Num[2]) {
			Num[3]=numero3;
			guardado3 = true;
			}
		}
	}
    public void Comparar(int n1,int n2,int n3,int n4) {
    	 picas = 0 ;
         fijas = 0;
    	    Num1[0] = n1;
    		if(Num1[0]==Num[0]) 
				fijas=1;
    		else
			for(int i = 0;i<Num.length;i++) {
    		if(Num1[0]==Num[i]) {
    			picas= 1;
    			}
    		}
    		Num1[1]=n2;
    		if(Num1[1]==Num[1]) 
    			fijas+=1;
    		else
    		for(int i =0;i<Num.length;i++) {
    			if(Num1[1]==Num[i]) {
    				picas+=1;
    				}
    			}
    		Num1[2]=n3;
    		if(Num1[2]==Num[2]) 
    			fijas+=1;
    		else
    		for(int i =0;i<Num.length;i++) {
    			if(Num1[2]==Num[i]) {
    				picas+=1;
    				}
    			}
    		Num1[3]=n4;
    		if(Num1[3]==Num[3]) 
    			fijas+=1;
    		else
    		for(int i =0;i<Num.length;i++) {
    			if(Num1[3]==Num[i]) {
    				picas+=1;
    				}
    			}
    		}
    public String darResultados(int n1,int n2,int n3,int n4) {
    	String mensaje="";
    	
    		Comparar( n1, n2, n3, n4);
    		vidas--;
    		mensaje ="Su numero fue "+Num1[0]+Num1[1]+Num1[2]+Num1[3];
    	
    	return mensaje;
    }
    public void noLeAtino()
    {
    	vidas--;
    }
    public String darFinal() {	
    	String mensaje ="";
    	 if(fijas==4) {
          mensaje = "!!FELICIDADES¡¡";
    	 }
    	  else {
    		mensaje ="!!SIGA INTENTADO¡¡";
    	}
    	return mensaje;
    }
    public String darFinal1(String nombre) {	
    	String mensaje ="";
    	int intentosR= 10-vidas;
    	 if(fijas==4) {
          mensaje = nombre+",   numero a adivinar:  "+Num[0]+Num[1]+Num[2]+Num[3]+",   numero de intentos:   "+intentosR +",   GANO";
    	 }
    	  else {
    		  mensaje = nombre+",   numero a adivinar:   "+Num[0]+Num[1]+Num[2]+Num[3]+",   numero de intentos:   "+intentosR +",   PERDIO";
    	}
    	return mensaje;
    }
    
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	public int getIntentos() {
		return intentos;
	}
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	public int getPicas() {
		return picas;
	}
	public void setPicas(int picas) {
		this.picas = picas;
	}
	public int getFijas() {
		return fijas;
	}
	public void setFijas(int fijas) {
		this.fijas = fijas;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int[] getNum1() {
		return Num1;
	}
	public void setNum1(int[] num1) {
		Num1 = num1;
	}
	public int[] getNum() {
		return Num;
	}
	public void setNum(int[] num) {
		Num = num;
	}
    
    
}