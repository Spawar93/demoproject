package program;
import java.util.Scanner;
public class star1q { // star pattern in first quadrant

	public static void main(String[] args) {
		
	    
	    int i, j ;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of rows");
	    
	    int n= sc.nextInt();
	    
	    for(i=1; i<=n; i++)
	    {
	    	
	       for(j=1; j<=i; j++)
	       {
	    	 //System.out.print("* ");
	    	 // System.out.print(j+" ");
	    	  System.out.print(i+" ");
	       }
	       System.out.println();
	    }  

	}

}
