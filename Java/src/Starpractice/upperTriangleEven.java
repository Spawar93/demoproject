package Starpractice;

import java.util.Scanner;


public class upperTriangleEven {

	public static void main(String[] args) {

        int i,j,k,r;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of row");
        
        r= sc.nextInt();
        
        for(i=1; i<=r; i++)
        {
        	for(j=r; j>i; j--)
        	{
        		System.out.print("  ");
        	}
        	
        	for(k=1;k<=i; k++)
        	{
        		System.out.print("*   ");
        	}
        	  System.out.println();
        }
             		

	}

}
