import java.util.Scanner;
public class star2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		 int n = sc.nextInt();
		 
		 int i, j, k;
		 
		 for(i=1; i<=n; i++)
		 {
			 for(j=n; j>i; j--)
			 {
				 System.out.print("  ");
			 }
			 for(k=1; k<=i; k++)
					
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }

	}

}
