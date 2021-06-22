package BasicProgramme;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count=0;
		int temp=n;
		int p = n;
		int  d;
		int sum=0;
		while(n!=0) //counting the number of digits 
		{
			count++; 
			n= n/10;
		}
		
		while(temp!=0) 
		{
			d= temp%10;
			 int m=1;          // Initializing the m value 1 in very loop
			for(int i=1; i<=count;i++)
			{
				 m= m*d;    // for loop for caculating the power of given digits
			}
			sum= sum+m;
			temp= temp/10;
		}
		if(p== sum)
			System.out.println(p+" is Amstrong number");
		else
			System.out.println(p+" is not Amstrong number");
			
		

	}

}
