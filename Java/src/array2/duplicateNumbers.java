package array2;

import java.util.Scanner;

public class duplicateNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int a[]= new int[n];
		
		System.out.println("Enter the elements");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("duplicate Numbers:");
		 for(int j=0; j<a.length; j++)
		 {
			 for(int k=j+1; k<a.length; k++)
			 {
				 if(a[j]==a[k])
				 System.out.println(a[j]);
			 }
		 }

	}

}
