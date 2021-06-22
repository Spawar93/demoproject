package NumberSeries;
import java.util.Scanner;
public class primeNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
        int i;
        int c=1;
        
        if(n==0|| n==1)
        {
        	System.out.println(n+" is not prime number");
        }
        if(n==2)
        {
        	System.out.println(n+" is prime number");
        }
        else 
         {	
        
          for(i=2; i<n; i++) // checking the prime number     
          {  
        	if(n%i==0)
        	{
              System.out.println(n+" is not prime number");
              break;
        	}
        	  else
        	   {
        		  c++;
        		  if(c== n-1)
        		  System.out.println(n+" is prime number");
        		  
        	   }   
        	
           }
        }  
       
    	
     }

}
