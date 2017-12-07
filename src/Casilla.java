import java.util.ArrayList;
import java.util.List;

public class Casilla 
{
	int id;
	List<Ficha> contenidas=new ArrayList<Ficha>();
	private boolean segura;
	private boolean fin;
	
	public Casilla(int id,boolean segura,boolean fin)
	{
	this.id=id;
	this.segura=segura;
	this.fin=fin;
	}
	
	public int getId() {
		return id;
	}
	public boolean isSegura() {
		return segura;
	}
	public boolean isFin() {
		return fin;
	}
	
	
	public void añadirFicha(Ficha f)
	{//comprobar previamente desde el exterior si la caslla esta llena antes de hacer nada, ( que tiene un maximo de 2 fichas)
		this.contenidas.add(f);
	}
	
	public String toString()
	{
		String most="[ ";
		for(int i=0;i<this.contenidas.size();i++)
		{
			most=most+this.contenidas.get(i).toSring()+" ";
		}
		most=most+" ]";
		return most;
		
	}
}
	
	