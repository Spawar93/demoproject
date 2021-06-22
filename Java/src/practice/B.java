package practice;

public class B  extends A
{
	
	 static void test()
	{
		System.out.println("Child");
	}
	 
	 static void test2()
		{
			System.out.println("grandchild");
		}
	 

	public static void main(String[] args) {
		
		B x = new B();
		x.test2();
		
		B.test2();
		
          A y= new B();
          y.test2();
          
          A p = new A();
  		p.test();
       
	}

}
