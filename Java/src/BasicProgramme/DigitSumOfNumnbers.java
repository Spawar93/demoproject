package BasicProgramme;
import java.util.Scanner;
public class DigitSumOfNumnbers {

	public static void main(String[] args) {
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int temp =n;
		while(n!=0)
		{
			i = i+ n%10 ;
			n = n/10;
		}
          System.out.println("Sum of digits of "+temp+" is= "+i);
	}

}
