package collection;



import java.util.HashSet;
import java.util.Iterator;

public class set {

	public static void main(String[] args) {
		
		HashSet<String> a = new HashSet<String>();
	    
		a.add("TCS");
		a.add("Infosys");
	    a.add(null);             // Only one null value is accepted
	    a.add("HSBC");
	    a.add("TCS");            // Duplicate value not allowed
	    a.add("Happiest Mind");   //Insertion order not maintained
	    a.add(null);
	    
		Iterator<String> i = a.iterator();
		
		for(String s : a)
		{
			System.out.println(i.next());
		}
		
		System.out.println("---------------");
		
		
		
		 i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
