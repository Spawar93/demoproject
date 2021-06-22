package program;
 import java.util.Scanner;
public class star3q { // third quadrants

	public static void main(String[] args) {
		
		int i, j, k;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the numbers");
		int n = sc.nextInt();
		
        for(i=1; i<=n; i++)
        {
        	for(j=1; j<i; j++)
        	{
        		System.out.print("  ");
        	}
        	for(k=n; k>=i; k--)
        	{
        		//System.out.print("* ");
        		//System.out.print(k+" ");
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
	}

}
