package NumberSeries;
import java.util.Scanner;
public class palindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		int temp = n;
        int r=0;
	
		while(n!=0)
		{
             r = r*10 + n%10;
             n= n/10;
		}  
		
		System.out.println("Reverse number is ="+r);
		
		if(temp==r)
		{
			System.out.print("Number is Palindrome");
			
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
		
		

	}

}
