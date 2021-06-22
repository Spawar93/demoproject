package day2;

import java.util.Scanner;
import java.lang.Math;

public class Amstrongp {
	
	public static void count()
	{
		 


	}

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 int n = sc.nextInt();
		 
		 int  count=0, m , p, total=0, temp1 =n, temp2=n;
		
		 while(n!=0)
		 {
			count++;
			n= n/10;
		 }
		 System.out.println(count);
		 while(temp1!=0)
		 {
			m= temp1%10;
			
			p=1;
	
		 for(int i=1; i<=count; i++)
			{
			  p = p*m;
			}
			total = total + p;
			temp1 = temp1/10;
			
		 }
		 
		 if(total == temp2)
			 System.out.println(temp2+" is amstrong number");
		 else
			 System.out.println(temp2+" is not amstrong number");
	}

}
