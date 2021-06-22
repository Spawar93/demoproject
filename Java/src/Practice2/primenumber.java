package Practice2;

public class primenumber {

	public static void main(String[] args) {
		
		int i,j,n=100;
		int count, primeno=0;
		System.out.println("Prime number upto "+n);
		for( j=1; j<=n; j++)
		{	count=0;
		   for(i=1; i<=j;i++)
		   {
			  if(j%i==0)
				count++;
		   }
		
		   if(count==2)
		   {   primeno++; 
			 System.out.println(j);
		   }
		
		}
		System.out.println("Total prime numbers upto "+n+" is equal to "+primeno);
	}

}
