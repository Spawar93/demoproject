package Practice2;

public class Fibonasciiseries {

	public static void main(String[] args) {
		
		int n=100;
		int a=0, b=0;
		int c=0, d=1;
		System.out.print(+c+","+d+",");
		for(int i=1; i<=n;i=a)
		{
			a= b+i;
			b=i;
			System.out.print(a+",");
			
		}
		

	}

}
