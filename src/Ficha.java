
public class Ficha 
{
	static int numfich=0; //////////////
	String jug;
	int id;
	int pos;
	
	//////////////////////////////////////////////////constructor
	public Ficha(String j,/*int id,*/int pos)
	{
		this.jug=j;
		this.id=numfich;//////////
		this.pos=pos;
		numfich++;/////////////
	}
	
	//////////////////////////////////////////////////geters y seters
	
	/////////////////////////////////  posicion
	public int getPosicion() {
		return pos;
	}

	public void setPosicion(int posicion) {
		pos = posicion;
	}
	
	/////////////////////////////////  Jugador
	public String getJ() {
		return jug;
	}

	///////////////////////////////// ID
	public int getId() {
		return id;
	}

	
	
	//////////////////////////////////////////////////Tostring
	public String toSring()
	{
		String most=this.jug+this.id;
		return most;
	}

	////////////////////////////////////////////////
	public static void setNumFichZero(){
		numfich=0;
	}
	
	

}
