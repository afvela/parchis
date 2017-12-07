import java.util.ArrayList;
import java.util.Random;
import java.math.*;

public class Mesa 
{
	ArrayList<Integer> fichasw=new ArrayList<Integer>();
	static int[] seguros = {5,12,17,22,29,34,39,46,51,56,63,68} ; 
	static int[] casillas = new int[75];// ESTO PA k?
	static int[] casillasF = {67,16,33,50};
	static int[] casillasI = {4,21,38,55};
	
	
	ArrayList<Integer> muros=new ArrayList<Integer>();
	
	/////////////////////////////////////////////////
	
	ArrayList<Ficha> fichas=new ArrayList<Ficha>();
	
	int turno;
	int numJug;
	
	
	// cambios: se introduce un array con los nombres de los jugadores para poder crear
	// las fichas
	
	public Mesa(int numJug, ArrayList<String> nombres)
	{
		this.numJug=numJug;
		//generamos un numero al azar para elegir el jugador inicial
		Random aleatorio = new Random();
		turno = aleatorio.nextInt(this.numJug);
		
		//rellenamos el vector de fichas con 4 fichas por jugador 
		int j;
		for(int i=0;i<this.numJug*4;i++)
		{
			///////////////////////////////////////////////////
			
			j=0;
			while(j<4){
			Ficha f=new Ficha( nombres.get(i),-1);
			this.fichas.add(f);
			j++;
			}
		}
		Ficha.setNumFichZero();
	}
	
	public void sigTurno()
	{
		if (this.turno==numJug)
			{
				this.turno=0;
			}
		else
		{
			this.turno++;
		}
	}
	
	public int tirada()
	{
		Random aleatorio = new Random();
		return 1+aleatorio.nextInt(5);
	}
	
	public void moverFicha(int ficha,int tirada)
	{
		int posf=fichas.get(ficha)+tirada;
		if (posf<67)
		{
			int m=this.hayMuro(this.fichas.get(ficha), posf);
			if(m==-1) {
				fichas.set(ficha,posf);
			}else {
				posf=m-1;
				fichas.set(ficha,posf);
			}	
		}else{
			
		}
		int fi=this.hayFicha(posf);
		if(fi==-1) {
			this.sigTurno();
		}else {
			if(this.tuVando(fi)) {
				this.añadirMuros(posf);
			}else{
				if(!this.esSeguro(posf)) {
					this.fichas.set(fi, -1);
				//pide ficha
				//llamar a moverFicha(ficha dada por el userr,10)
				}	
			}
		}
	}
	// Devuelve -1 si no hay muro y si hay muro devuelve la posicion del primero
	public int hayMuro(int posI,int posF)
	{
		for(int i=0;i<muros.size();i++)
		{
			if(muros.get(i)<=posF && muros.get(i)>=posI) 
			{
				return i;
			}
		}
		return -1;
		
	}
	// Devuelve -1 si no hay ficha en la posicion y si la hay devuelve el numero que representa a esta ficha
	public int hayFicha(int pos) {
		for(int i=0;i<fichas.size();i++){
			if(pos==fichas.get(i)) {
				return i;
			}
		}
		return -1;
	}
	// Comprueba si la ficha esw del jugador que esta jugando
	public boolean tuVando(int ficha) {  
		int a = (int) (this.fichas.get(ficha)/4);// posible error
		if(a==this.turno) {
			return true;
		}
		return false;
	}
	// Añade al vector muros un muro ordenadamente 
	public void añadirMuros(int muro) {
		int i=0;
		while(i<muros.size()) {
			if(this.muros.get(i)<muro) {
				i++;
			}else {
				this.muros.add(muro);
			}
		}
	}
	public boolean esSeguro(int posf) {
		for(int i=0;i<seguros.length;i++) {
			if(posf==seguros[i]) {
				return true;
			}
		}
		return false;
	}
}
