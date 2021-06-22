package balaji;

public class bkoveride {
         
	public void getdata(int a)
	{
		System.out.println(a);
	}
	public void getdata(String a)
	{
		System.out.println(a);
	}
	public void getdata (int a,int b )
	{
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bkoveride h=new bkoveride();
		h.getdata(10);
		h.getdata("jai");
		h.getdata(10, 20);
		
		
	} 

}
