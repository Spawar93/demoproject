package practice;

public class class3 extends class2 {
	
	
	 public void test3()         // multiple inheritance
	{
		System.out.println("Nonstatic method test3");
	}
	
	public static void demo3()
	{
		System.out.println("Static method demo3");
	}
       
	public static void main(String[] args) {
		
		 class3 p = new class3();
		  p.test1();
		  p.test2();
		  p.test3();
		  p.demo1();
		  p.demo2();
		  p.demo3();
		  class1.demo1();
		  class2.demo2();
		  class3.demo3();
		  
		
	}
}
