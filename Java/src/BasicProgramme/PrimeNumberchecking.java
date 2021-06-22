
package BasicProgramme;

import java.util.Scanner;

public class PrimeNumberchecking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i, count=0;
		
		 for(i=1; i<=n; i++)
		 {
			 if(n%i==0)
				count++;
		 }
		 
		 if(count==2)
		 {
			 System.out.println(n+" is prime number");
		 }
		 else
			 System.out.println(n+" is not prime number");
  }
}
