package Abstract;

public class B extends A {
	int a=20;
	void test()
	{
	   System.out.println(super.a);
	  System.out.println(a);	
	}
   
	public static void main(String[] args) {
		
		
		B r = new B();
		r.test();
	System.out.println(r.a);
	
		A x = new A();
		x.test();
	
		
		
		

	}

}
