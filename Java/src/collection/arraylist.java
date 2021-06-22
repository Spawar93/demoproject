package collection;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();  // normal obj call
	//	List a = new ArrayList();     //Upcasting
		
		a.add("Game of Thrones");
		a.add("Spartacus");
		a.add(1993);
        a.add(null);  //allow many null values
		a.add(99.99);  // maintain insertion order
		a.add(null);
		a.add(1993);  // allow duplicate values
		
		
		int length = a.size();
		
		for(int i=0; i<length; i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("----------");
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("Special oops");
		s.add("The family man");
	
		
		int size = s.size();
		
		for(int i=0; i<size; i++)
		{
			System.out.println(s.get(i));
		}
		

	}

}
