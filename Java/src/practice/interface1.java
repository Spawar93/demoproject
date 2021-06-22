package practice;

public interface interface1 {
	
	void test();
	
	void demo();
	
	static void add()
	{
		System.out.println("static method of interface");
	}
	
	default void sum()
	{
		System.out.println("default method of interface");
	}
	

}
