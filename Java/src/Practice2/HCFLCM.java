package Practice2;

public class HCFLCM {

	public static void main(String[] args) {
		
		int a=12, b=16;
		int hcf=0, lcm=0;
		
		
		for(int i=1; i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
			  hcf= i;
			}
		}
          System.out.println(hcf);
          
          lcm= (a*b)/hcf;
          System.out.println(lcm);
          
	}

}
