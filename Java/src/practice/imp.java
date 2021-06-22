package practice;

public class imp extends Abstract {
	
   public void demo()
   {
	   System.out.println("implementation to abstract method demo");
   }
	
	public void method()
	{
		System.out.println("implementation to abstract method method");
	}
	
	public static void main(String[] args) {
		
		
		imp x = new imp();
		x.demo();
		x.method();
		x.test();
	}

}
