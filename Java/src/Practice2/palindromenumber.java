package Practice2;

public class palindromenumber {

	public static void main(String[] args) {
		
		int n=12322;
		int a=0;
		
		for(int i=n; i>0; i=i/10)
		{
			a=a*10+ i%10;
			
		}
		System.out.println(n);
		System.out.println("Reverse number : "+a);
		if(n==a)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}

	}

}
