
package NumberSeries;

public class totaldigits {

	public static void main(String[] args) {
		
		int i, n=1245;
		int count=0;
		
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println("No of digits= "+count);
	}

}
  