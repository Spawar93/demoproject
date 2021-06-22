package day2;
import java.util.Scanner;
public class largestnoarray {

	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int n = sc.nextInt();
		 int b[]= new int[n];
		 int i, j;
		 System.out.println("Enter the elements");
		 for(i=0; i<b.length;i++)
		 {
			 b[i]= sc.nextInt();
		 }
		 
		    for(j=1; j<b.length; j++)
			  {
				  if(b[0]<b[j])
				 
					  b[0]=b[j];
			  }
			  System.out.println("Largest no from array: "+b[0]);
		  
		
   }

}
