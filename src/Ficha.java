
public class Ficha 
{
	String jug;
	String id;
	int pos;
	
	//////////////////////////////////////////////////constructor
	public Ficha(String j,String id,int pos)
	{
		this.jug=j;
		this.id=id;
		this.pos=pos;
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
	public String getId() {
		return id;
	}

	
	
	//////////////////////////////////////////////////Tostring
	public String toSring()
	{
		String most=this.jug+this.id;
		return most;
	}


	
	

}
