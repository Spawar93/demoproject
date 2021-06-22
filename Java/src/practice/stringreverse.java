package practice;

public class stringreverse {

	public static void main(String[] args) {
		
		String a = "welcome to class";
	    String s[]=a.split(" ");
        String b,c;
        
        for(int i=0; i<s.length; i++)
        {    b="";
        	b= b+ s[i];
        	c="";
        	for(int j=0; j<b.length();j++)
        	{    
        		c= c+b.charAt(b.length()-1-j);
        	}
        	  System.out.print(c+" ");
        }


     }
	
}
