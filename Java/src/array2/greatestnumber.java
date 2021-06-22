package array2;
import java.util.Scanner;
public class greatestnumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int a[]= new int[n];
		
	System.out.println("enter the numbers");
	     for(int i =0; i<a.length; i++)
	     {
	    	 a[i]= sc.nextInt();
	     }
	     int max = a[0];
	     for(int j=0; j<a.length; j++)
	     {
	    	 if(max<a[j])
	    	   max=a[j];
	      }
	     System.out.println("greatest number is:"+max);
	}

}
