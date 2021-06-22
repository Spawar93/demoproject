package Starpractice;
    import java.util.Scanner;

public class ReverseTriangle {

	public static void main(String[] args) {
		                         
		// Reverse triangle programme with odd values of star
		
		int i,j,k,r;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of rows ");
		 r= sc.nextInt();   
		 
		 for(i=1; i<=r; i++)
		 {
			 for(j=1; j<i; j++)
			 {
				 System.out.print("  ");
			 }
			 
			 for(k=(2*r-1); k>=(2*i-1); k--)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }

	}

}
