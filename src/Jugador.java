import java.util.ArrayList;
import java.util.List;

public class Jugador 
{

	List<Ficha> lf=new ArrayList<Ficha>();
	String nom;
	String id;
	
	
	
	public Jugador(String nom,String id)
	{
		this.nom=nom;
		this.id=id;
		for(int i=0;i<4;)
		{
			lf.add(new Ficha(this.id,"F"+(i+1),0));
		}
	}
	
	
	public List<Ficha> getLf() {
		return lf;
	}
	public String getNom() {
		return nom;
	}
	public String getId() {
		return id;
	}
	
	
	
	
}
