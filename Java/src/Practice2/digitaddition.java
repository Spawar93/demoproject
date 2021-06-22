package Practice2;

public class digitaddition {

	public static void main(String[] args) {
		
		int n=123;
		
		int sum=0;
	/*	while(n!=0)
		{
			sum= sum+n%10;
			n=n/10;
		} */
		
		for(int i=234; i>0; i=i/10)
		{	
			sum= sum+i%10;
		}
		System.out.println(sum);

	}

}
