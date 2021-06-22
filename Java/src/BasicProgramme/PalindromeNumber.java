package BasicProgramme;
 import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		
		int rem, rev=0;
		int temp =n;
		
		 while(n!=0)
		    {
			   rem = n%10;
			   rev= rev*10+rem;
               n = n/10;

      		}
		 
		 if(temp== rev)
		 { 
		
			 System.out.println(temp+" is palindrome number");
		 }
		 else
			 System.out.println(temp+" is not palindrome number");
	}

}
