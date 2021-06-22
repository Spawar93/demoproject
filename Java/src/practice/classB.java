package practice;

public class classB extends classA
{
	
	void test()
	{
		System.out.println("a");
	}
	 void test(char c, int s)
	{
		System.out.println("overloading");
	}
	 static void test(int a)
	{
		System.out.println("hidding");
	}
	      static void demo()
	 {
		 System.out.println("subclass static method");
	 }

	public static void main(String[] args) {
            
		classB x = new classB();
		/*x.test(0);
		x.test();
		x.test('f',10);
		x.test('d');
        classB.test(0);*/
		//x.test();
		//classA y = new classA();
		//y.test();
		//x.test('f',10);
		
		//x.demo();
		//classA.class 
		
		//x.demo();
		classB.demo();
		
		
	}

}
