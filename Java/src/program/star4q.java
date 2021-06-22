package program;
import java.util.Scanner;
public class star4q {
	public static void main(String[] args) {
		 
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the no of rows");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++)
		{
			for(j=n; j>=i; j--)
			{
				System.out.print("* ");
				//System.out.print(j+" ");
				//System.out.print(i+" ");
			}
			System.out.println();
	}
	
	
	}
	

}
