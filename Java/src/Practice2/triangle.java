package Practice2;
import java.util.Scanner;
public class triangle {

	public static void main(String[] args) {
		// valid triangle
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the  three angles of triangle");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		System.out.println();
		if(a+b+c==180)
		{
		System.out.println("Triangle is valid");
		}
		else
		{	
			System.out.println("Triangle is invalid");	
		}

	}

}
