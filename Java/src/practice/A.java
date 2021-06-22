package practice;

public class A {
  /*   private  int pass;
    private static String s;
	public static void test2()
		{
          s="usermane";
          System.out.println(s);
          throw new ArithmeticException("Maths error");
		}   */
	 
	public static void main(String[] args) {
		
	
	 
	 try {
		 System.out.println("hiii");
		 
		 try {
			 System.out.println("hello");
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("exception");
		 }
	 }
		 
	 
	 
	 catch(Exception e)
	 {
		 System.out.println("exception");
		 
		 try {
			 System.out.println("hello");
		 }
		 
		 catch(Exception e2   )
		 {
			 System.out.println("exception");
		 }
	 }
	
  }
}