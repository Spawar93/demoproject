
package string;
import java.util.Scanner;
public class reversewithscanner {

	public static void main(String[] args) {
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		
		String a = sc.nextLine();
	     System.out.println(a);
		String b = "";
		for(i=a.length()-1; i>=0; i--)
		{
			b = b+ a.charAt(i);
		}
		a=b;
		System.out.println(a);

	}

}

