

package NumberSeries;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		
		int i ;
	   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a= sc.nextInt();
		int b = sc.nextInt();
		int n;
		
		
		if(a>b)
		{	
		  for (n=a; n>=a; n++)
		  {     // n must be divisible by both a & b
			    if(n%a==0 && n%b==0)
			    {
			      System.out.println("LCM of "+a+" & "+b+" is: "+n);
			      break; 
			    }
           }
		}
		else
		{	
			 for (n=b; n>=b; n++)
			  {
				  if(n%a==0 && n%b==0)
				  {
				    	
					System.out.println("LCM of "+a+" & "+b+" is: "+n);
				    break;
				  }
			  }	 
		}	 
	}    

}
