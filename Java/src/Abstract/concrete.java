
package Abstract;

public  class concrete extends Abstract1 {
	
	
	public void test()
	{
		System.out.println("abstract method test");
	}

	public static void main(String[] args) {
		 concrete x= new concrete();
		 x.test();
	     x.add();
		 Abstract1.demo();
		 System.out.println(x.a);

	}

}
