package NumberSeries;
 import java.util.Scanner;

public class Amstrongnumber2 {
	
	public static void main(String[] args) {
		
		   int digit = 0, k , a= 0, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");  //Taking user input
		n = sc.nextInt();
		
		int temp=n; //Temp variable required at the time of comaparison
		int m=n;  //Temp variable required at the time of amstrong number calculation
		
		
		
		while(n!=0)   // To count number digits in given number
		{
			digit++;
			n= n/10;
		}
		 
		 System.out.println("No. of digits= "+digit);
		
		 while(m!=0)     // Amstrong number calculation
		  {
			k= m%10;   
			
			int r = digit ; // Temp variable 'r' to store number of digits of given number
			int p =1;   
			while(r!=0)    // To calculate exponential power of each digits
			{
				p= p*k;
		    	r --;
			}
			
			a = a + p;
			m= m/10;
			
		 }
		 System.out.println("a= "+a);
      
         if(temp == a )  // comparison
        	 System.out.println(temp+" is amstrong number");
         else
        	 System.out.println(temp+" is not amstrong number");
	}

}
