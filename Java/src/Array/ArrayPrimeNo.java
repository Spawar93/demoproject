
package Array;
import java.util.Scanner;

public class ArrayPrimeNo {

	public static void main(String[] args) {

         int i,j ;
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
        	  int count=0;
              for(j=1; j<=b[i]; j++) 
        		{  
        		  if(b[i]%j==0)
        		     count++;
        		 }
                 if(count==2)
            	  System.out.println(+b[i]);
        
        		
                 
        	}
         
          
        
	}

}
