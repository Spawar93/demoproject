package Array;

import java.util.Scanner;

public class Missingnumber {

	public static void main(String[] args) {
/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int a[]= new int[n];
		int sum =0;
	int total = (n*n-1)/2 ;
		
	System.out.println("enter the numbers");
	
	     for(int i =0; i<a.length; i++)
	     {
	    	 a[i]= sc.nextInt();
	     }  */
		  int sum=0;
		  int total = 0;
		  total= (10*11)/2;
	     int a[]= {1,2,3,5,6,7,8,9,10};
	     for(int i=0; i<a.length; i++)
	     {
	    	 sum= sum+a[i];
	     }
            System.out.println("Missing number");
            System.out.println(total-sum);
	}

}
 

