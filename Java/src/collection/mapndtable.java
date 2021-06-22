package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class mapndtable {

	public static void main(String[] args) {
		
		//HashMap<key,Data> hashmap = new HashMap<key,Data>();
		HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
		hashmap.put(10,"Rockstar");
		hashmap.put(20,null);
		hashmap.put(30,"Fifty shades of gray");
		hashmap.put(20,"Gravity");
		hashmap.put(50,null);
		hashmap.put(null,"Duaa");
		
		for(Map.Entry<Integer,String> e : hashmap.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		System.out.println("----------------");
		Hashtable<Integer,String> table = new Hashtable<Integer,String>();
		table.put(10,"Rockstar");
		table.put(20,"A");
		table.put(30,"Fifty shades of gray");
		table.put(40,"Gravity");
		table.put(50,"B");
		table.put(60,"Duaa");
		
		for(Map.Entry<Integer,String> e : table.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
