package BasicProgramme;

import java.util.Scanner;

public class dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the array size");
	    int n = sc.nextInt();
	     int b[]= new int[n];
	     
	     System.out.println("Enter the array elements");
	     
	      
	     for(i=0; i<b.length; i++)
	     {
	    	  b[i]= sc.nextInt();
	     }
	     System.out.println("Duplicate numbers");
	     	
	     for(i=0; i<(b.length); i++)
	     {
	    	 for(j=0; j<(b.length); j++)
	    	 {
	    	   if( b[i] == b[j]);
	    	   {
	    	      System.out.println(b[i]);
	    	   }
	    	 }	 
	    	 
	     }
	}

}
