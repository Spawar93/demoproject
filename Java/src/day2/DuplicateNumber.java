package day2;
import java.util.Scanner;
public class DuplicateNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int n = sc.nextInt();
		int b[]= new int[n];
		int i, j;
		System.out.println("Enter the array elements");
		for(i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
			
		}
		   System.out.println("Duplicate numbers in array are: ");
		   for(i=0; i<b.length; i++)
		   {
			   for(j=i+1; j<b.length; j++)
			   {
				   if(b[i]==b[j])
					   System.out.println(b[i]);
			   }
		   }
          
		  /* for(i=0; i<b.length; i++)
		   {
			   for(j=i+1; j<b.length;j++)
			   {   
				   if(b[i]<b[j])
				   {   
				     int temp = b[i];
				     b[i]=b[j];
				     b[j]=temp;
				   }
			   }
		   }
		   System.out.println("Descending order");
		   for(i=0; i<b.length; i++)
		   {
			  System.out.println(+b[i]); 
		   }
		   System.out.println("Ascendeing order");
		   for(i=b.length-1; i>=0; i--)
		   {
			   System.out.println(b[i]);
		   }
		   */
	}

}
