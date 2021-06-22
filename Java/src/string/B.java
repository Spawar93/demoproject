package string;

public class B {
	
	static String a=" Velo city";
	static String b="Velocity";
	static String s[]= a.split(" ");
	static String c = new String("velocity");
	static String d = new String("velocity");

	public static void main(String[] args) {
		
          boolean x = a.equals("velocity");
          System.out.println(a
        		  );
          b=b.concat("class");
          System.out.println(a.substring(2, 5));
          System.out.println();
          
          for(int i=0; i<s.length; i++)
          {
        	  System.out.println(s[i]);
          }
          
	}

}
