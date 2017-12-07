import java.util.ArrayList;
import java.util.List;

public class Pruebas
{
	public static void main(String[] args) {
			
		List<Integer> l= new ArrayList<Integer>();
		
		
		l.add(4050);
		l.add(23434);
		
		System.out.println("el valor 1 es" +l.get(0));
		System.out.println("el valor 1 es" +l.get(1));

		System.out.println("el tamaño es" +l.size());
		
		l.remove(0);
		
		System.out.println("el valor 1 es" +l.get(0));
		System.out.println("el tamaño es" +l.size());
		System.out.println("el valor 1 es" +l.get(1));
			
			
			}


}