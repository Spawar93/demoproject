package practice;

public class class2 extends class1  // single level inheritance
{
	
	 void test1()
	{
		System.out.println("Nonstatic method test2");
	}
	
	   void demo1()
	{
		System.out.println("static method demo2");
	}
    	   public static void main(String[] args) {
			
		
    	/*   class2 x= new class2();
    	     x.test1();// inheritance call
    	     x.test2();
    	     x.demo2();
    	     class2.demo2();
    	     x.demo1();  // inheritance call
    	     class1.demo1();
    	     
    	     
    	     
    	    class1 r = new class1(); // Normal calls
    	     r.demo1();
    	     r.test1();
    	     class1.demo1();  */
    	    
    	
    	   class2 r= new class2();
    	   r.demo1();
    	  
    	    class1.demo1();   
    	   //  class2.demo1();
    	  
	}

	
}
