package array2;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int a[]= new int[n];
		
	System.out.println("enter the numbers");
	     for(int i =0; i<a.length; i++)
	     {
	    	 a[i]= sc.nextInt();
	     }
	     
	     System.out.println("Reverse array");
	     for(int i=a.length-1; i>=0; i--)
	     {
	    	 System.out.println(a[i]);
	     }

	}

}

