
package Array;

import java.util.Scanner;

public class DuplicateArrayNos {

	public static void main(String[] args) {
		
		int i, j, k ;
		Scanner sc = new Scanner(System.in); // Taking user input
		System.out.println("Enter the Array size"); 
		int n= sc.nextInt();
		
		int b[]= new int[n];
		System.out.println("Enter the array elements");
		
		for( i=0; i<b.length; i++)   // User input array elements
		{
			b[i]= sc.nextInt();
		}
		
		  System.out.println("Duplicate numbers in Array are:");
		  
		  for( j=0; j<b.length; j++) // Checking duplicate numbers
		  {
			  for( k=j+1; k<b.length;k++ )
			  {
				  if(b[j]==b[k])
				  {
					  System.out.println(b[j]);
				  }
			  }
		  }
		

	}

}
