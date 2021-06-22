package Practice2;

public class Amstrongnumber {

	public static void main(String[] args) {
		
		    int n=9;
		    int count=0;
		    int digit=0;
		    int amst, total=0;
		    int temp1=n, temp2=n;
		    
		    for(int i=n; i>0; i=i/10)
		    {
		    	count++;
		    }
		    
		    for(int i=temp1; i>0; i=i/10)
		    {
		    	digit=i%10;
		    	amst= (int)Math.pow(digit, count);
		    	total= total+ amst;
		    }
		    if(total==temp2)
		    {
		    	System.out.println(temp2+" is amstrong number");
		    }
		    else
		    {
		    	System.out.println(temp2+" is not amstrong number");
		    }

	}

}
