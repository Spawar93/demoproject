package day2;

import java.util.Scanner;

public class fibonasciiseries {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		
		int i=1, m=0, p=0;
		int n1=0, n2=1;
		System.out.println("fibonasciiseries");
		System.out.print(n1+" "+n2+" ");
		while(i<n)
		{
			p= m +i;
			m=i;
			i=p;
			System.out.print(p+" ");		
		}

	}

}
