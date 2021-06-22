package BasicProgramme;
import java.util.Scanner;
public class FibonasciSeries {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a=0, b=1;
		int i=1;
		int j=0;
		int k=0;
		System.out.print(+a+" "+b+" ");
		while(i<n)
		{
			k = j + i;
			
			j=i;
			i=k;
			System.out.print(k+" ");
		}   
		
	}

}
