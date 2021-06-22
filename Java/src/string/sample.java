package string;

public class sample {

	public static void main(String[] args) {
		String s ="sample";
		int n= s.length();
		char a[]= new char[n];
		
		for(int i=n-1; i>=0; i--)
		{
			a[i]=s.charAt(i);
		}
		for(int k=0; k<a.length; k++)
		{	
			String b="";
			for(int j=0; j<a.length-k; j++)
			{ 
				
               b=  b + a[j];
             }
			System.out.println(b);
	
		}
    
	}

}
