package upcasting;

public class abc implements inter1 {
	
	public void test()
	 {
		 System.out.println("superclass test");
	 }
	   public void demo()
	 {
		 System.out.println("superclass demo");
	 }
	   
	   
	   public static void main(String[] args) {
		   
		   inter1 x = new abc();
		   x.demo();
		   x.test();
	}

}
