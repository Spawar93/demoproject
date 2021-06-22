package string;

public class chararray {

	public static void main(String[] args) {
		
		String a= "welcome";
		int n = a.length();
		char b[]= new char[n];
	
		for(int i=0; i<n; i++)
		{
			b[i]= a.charAt(i);
		}
		
       for(int j=0; j<b.length; j++)
       {
    	   System.out.println(b[j]);
       }
	}

}
