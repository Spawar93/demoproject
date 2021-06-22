package practice;

public class reversingsame {

	public static void main(String[] args) {
		
		String s= "Hello good morning";
		String a[]=s.split(" ");
		
		String b,c;
		for(int i=0; i<a.length; i++)
		{   b="";
			b= b+a[i];
			c="";
		 for(int j=b.length()-1; j>=0; j--)
		 {
			c=c+ b.charAt(j);
		 }
		 System.out.print(c+" ");
		}
	}

}
