     package Array;
 import java.util.Scanner;
public class LargestNo {

	public static void main(String[] args) {
		
        int i, j, k ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int b[] = new int[n];
        System.out.println("Enter the Array elements");
        try
        {
        for(i=0; i<b.length; i++)
        {
        	b[i]= sc.nextInt();
        }
        
       
           for(j=1; j<=b.length; j++) // checking largest number
           {
        	   if(b[0]<b[j])
        		 {
        		    b[0]=b[j];
        		    
        		  }
            }
           
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
           System.out.println("Array Index OutOfBounds Exception");
        }  
        System.out.println("Largest number of Array is: "+b[0]); 
           
	}

}
