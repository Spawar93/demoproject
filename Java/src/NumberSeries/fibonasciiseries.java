package NumberSeries;

import java.util.Scanner;

public class fibonasciiseries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");  //Taking user input
		int k = sc.nextInt();
		 
		
		int m=0;
		int n=0;
		int p=1, a=0, b=1;
		
		
		System.out.print(a+" "+b+" ");
		
		while(p<=k)
		{
			m = n+p;
			System.out.print(m+ " ");
			
			n=p;
			p=m;
		}
	}

}
  