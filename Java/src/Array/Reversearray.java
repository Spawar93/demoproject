package Array;
import java.util.Scanner;

public class Reversearray { // Array ordering

	public static void main(String[] args) {
		
		 int i;
		 Scanner sc = new Scanner(System.in); // Taking user input
			System.out.println("Enter the Array size"); 
			int n= sc.nextInt();
			
			int b[]= new int[n];
			System.out.println("Enter the array elements");
			
			for( i=0; i<b.length; i++)   // User input array elements
			{
				b[i]= sc.nextInt();
			}
		   System.out.println("reverse array elements");
		   for( i=b.length-1 ; i>=0; i--) 
		   {
			   
             System.out.println(b[i]);

		   }
	}

}
