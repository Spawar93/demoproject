
package string;

public class A {
	
	static String  a= "welcome";
	static String  b= "welcome";
	
	static String c = new String("welcome");
	static String d = new String("Welcome");

	 public static void main(String[] args) {
		// string location comparison
	  System.out.println(a==b);
	  System.out.println(a==c);
	  System.out.println(c==b);
	  System.out.println(c==d);
	  System.out.println();
	  
	  // string data comparison
	  boolean x = a.equals(d);
	  System.out.println(x);
	   x = a.equalsIgnoreCase(d);
	   System.out.println(x);
	   System.out.println();
	   
	   x = a.equals("Welcome");
	   System.out.println(x);
	   x = a.equalsIgnoreCase("welcome");
	   System.out.println(x);
	   System.out.println();
       System.out.println(a);
	   System.out.println(b);
	   
	   b= "class";
	   System.out.println(b);
	  
	   a= a+" to India";
	   System.out.println(a);
	   
	   b= "welcome";
	   b.concat(" to Pune");
	   System.out.println(b.concat(" to Pune"));
	   System.out.println(b);
	   System.out.println(a.charAt(3));
	   System.out.println(a.endsWith("India"));
	   System.out.println(a.startsWith("Welcome"));
	   System.out.println(a.length());
	   System.out.println(a.indexOf('c'));
	   System.out.println(a.lastIndexOf('a'));
	   System.out.println(a.toLowerCase());
	   System.out.println(a.toUpperCase())
	   ;
	   System.out.println(a.compareTo(c));
	   a= " welcome";
	   System.out.println(a);
	   System.out.println(a.trim());
	   System.out.println(a.replace('l', 'i'));
	   System.out.println(a.replace("wel","Out"));
	   System.out.println(a.substring(4));
	   System.out.println(a.substring(4, 7));
	   System.out.println(a.startsWith(" welcome"));
	  
	  
	   
	}
     	 

}

