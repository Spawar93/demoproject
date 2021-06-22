package starpattern;

public class star6 {

	public static void main(String[] args) {
		
		int i, j, k ;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			  for(k=1;k<=i;k++)
			  {
				  System.out.print("* ");
			  }
			  System.out.println();
		}
		
		
		for(i=1;i<=4;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			  for(k=1;k<=5-i;k++)
			  {
				  System.out.print("* ");
			  }
			  System.out.println();
		}

	}

}
