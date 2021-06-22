
public interface interface1 {
	 int a =12;
	static void test()
	{
		System.out.println("static method of interface");
	}
	
	void demo1();
	
	default void add()
	{
		System.out.println("  interface Addition");
	}
	

}
