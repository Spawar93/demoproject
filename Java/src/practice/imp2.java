package practice;

public class imp2 implements interface1 {
	
     public void test()
     {
    	 System.out.println("test method");
     }
     
	
	public void demo()
	{
		System.out.println("demo method");
	}
	

	public void race()
	{
		System.out.println("method of implementation class");
	}
	public static void main(String[] args) {
		interface1.add();
	}

}
