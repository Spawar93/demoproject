package array2;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		int a[]= {8,2,4,5,6};
		
		int b=2;
	try
	   {
		for(int i=0; i<=5; i++)
		{
			System.out.println(a[i]);
			int c= a[i]/b;
			System.out.println(c);
		}
		
		
		
	  }
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
				
		}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array Index Out Of Bounds Exception");
	}
	
	finally
	{
		System.out.println("Finally");
	}

	}

}
