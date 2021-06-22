package starpattern;

public class star10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		 
		for(i=1;i<=5;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(k=1;k<=(6-i);k++)
			{
				System.out.print("*   ");
			}
			System.out.println();	
		}

	}

}
