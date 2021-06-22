package Starpractice;
  import java.util.Scanner;
public class equilateralTriangleOdd {

	public static void main(String[] args) {
		int i,j,k,r;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows in upper triangle");
		 r= sc.nextInt();
		
		
		for(i=1;i<=r;i++)
		{
			for(j=r; j>i;j--)
			{
				System.out.print("  ");
			}
			for(k=1;k<=(2*i-1);k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(i=1;i<=(r-1);i++)
		{
			for(j=1; j<=i;j++)
			{
				System.out.print("  ");
			}
			for(k=2*r-3;k>=(2*i-1);k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
