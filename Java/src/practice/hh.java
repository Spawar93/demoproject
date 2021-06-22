package practice;
import java.util.Scanner;
public class hh {

	public static void main(String[] args) {
		
		

	         int i, j ;
	         int  c=0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the array size");
	        int n = sc.nextInt(); // Array size declaration
	        
	        int b[]= new int[n];
	        
	        System.out.println("Enter the Array elements");
	        
	          for(i=0; i<b.length; i++)
	          {
	        	b[i]= sc.nextInt(); //storing array elements
	          }
	        
	          System.out.println("Prime number from given array: ");
	          for(i=0; i<b.length; i++) // selecting array elements one by one
	           {
	        	 for(j=2; j<b[i]; j++) // Prime number checking
	        		{
	        			if(b[i]%j==0)
	        			{
	        	          break;
	        			}
	        			else 
	        			{ 
	        			     c++;
	        				if(c==b[i]-2)
	        				{
	        				   System.out.println(b[i]);	
	        				}
	        			}
	        		}
	        		
	        	}
	}
}
