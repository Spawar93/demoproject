
public  class implememt  implements interface1, interface2{
	
	
	 public void demo1()
	{
		System.out.println(" demo1 method of interface1");
	}
	 
	 public void demo2()
		{
			System.out.println(" demo2 method of interface2");
		}
	 public  void add()
		{
			System.out.println(" Overriden interface Addition");
		}
		public static void main(String[] args) {
	  
	 implememt x = new implememt();
     x.demo1();
     x.demo2();
     x.add();
     interface1.test();
     System.out.println(x.a);
     System.out.println();
		  
		}	  
	  
}