package Array;
   import java.util.Scanner;
public class AscendDescend {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        
        int n = sc.nextInt();
        int b[]= new int[n];
        System.out.println("Enter the numbers ");
        for(int i=0; i<b.length; i++)
       	 {
       		  b[i]= sc.nextInt(); // elements storing
       	 }
		   for(int i=0 ; i<b.length; i++)
			   
		    {   
			   for(int j=i+1; j<b.length; j++)  
		    
		        {   
				   if(b[i]>b[j])
		          {
			        int temp = b[i];  //Swapping 
			        b[i] = b[j];
			        b[j] = temp ; 
		          } 
			  
			      }
			   
		    }
		       System.out.println("Ascending order:");
		       for(int i=0; i<b.length; i++) // Printing the array
		       {
		    	   System.out.println(b[i]);
		       }
		       
		       System.out.println("Descending order:");
		       for(int i=b.length-1; i>=0; i--) // Printing the array
		       {
		    	   System.out.println(b[i]);
		       }
	}

}
