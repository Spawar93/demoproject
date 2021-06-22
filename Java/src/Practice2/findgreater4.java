package Practice2;
import java.util.Scanner;

public class findgreater4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		
		if(a>=b && a>=c && a>=d)
		{
			System.out.println(+a);
		}
		if(b>=a && b>=c && b>=d)
		{
			System.out.println(+b);
		}
		if(c>=a && c>=b && c>=d)
		{
			System.out.println(+c);
		}
		if(d>=a && d>=b && d>=c)
		{
			System.out.println(+d);
		}    

	}

}
