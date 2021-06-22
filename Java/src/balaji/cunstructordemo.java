package balaji;

public class cunstructordemo {
         
	public cunstructordemo ()
	{
		System.out.println("i am constructor");
		System.out.println("i am constructor lecture 1");
	}
	public  cunstructordemo (int a ,int b)
	{
		System.out.println("i am para constructor");
		int c=a+b;
		System.out.println(c);
		//System.out.println("i am constructor lecture 1");
	}
	public  cunstructordemo (String str)
	{
		System.out.println(str);
		
	}
	public void getdata()
	{
		System.out.println("i am methode");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cunstructordemo abc =new cunstructordemo();
		cunstructordemo abc =new cunstructordemo("hello");
		cunstructordemo ab =new cunstructordemo(4,5);
		//abc.getdata();
	}

}
