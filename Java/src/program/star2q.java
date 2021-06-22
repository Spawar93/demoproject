package program;
 import java.util.Scanner;
public class star2q {

	public static void main(String[] args) {
		
		 int i, j, k ;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the number of rows");
		    
		    int n= sc.nextInt();
		    
		    for(i=1; i<=n; i++)
		    {
		    	for(j=n; j>i; j--)
		    	{
		    		System.out.print("  ");
		    	}
		    	for(k=1; k<=i; k++)
		    	{
		    		//System.out.print("* ");
		    		//System.out.print(k+" ");
		    		System.out.print(i+" ");
		    	}
		    	System.out.println();
		    }
	}

}
