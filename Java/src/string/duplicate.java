

package string;

public class duplicate {

	public static void main(String[] args) {
		
		String a= "welcome to class";
		int i, j,k, count=1;
		int n = a.length();
		System.out.println(a);
		char b[]= new char[n];
		
		for( i=0; i<n; i++)
		{
			b[i]=a.charAt(i);
		}
		System.out.println("Duplicate characters :");
		for(j=0; j<b.length; j++)
		{   // count=1;
			for( k=j+1; k<b.length; k++)
			{
				if(b[j]==b[k]&& b[j]!=' ')
					
				   System.out.println(b[j]);
				
			}
		
		}
		
	}

	
}

