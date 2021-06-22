package string;

public class stringtoarray {

	public static void main(String[] args) {
		 String a = "Velocity";
		 int n = a.length();
		 char b[]= new char[n];
		 
		 for(int i=0; i<n; i++)
		 {
			 b[i]= a.charAt(n-1-i); // storing the string data into array
			
		 }
		 String c= "";
		 for(int j=0 ; j<b.length; j++)
		 {
			 c= c+b[j];
		 }
		 
		 System.out.println("Reverse string: "+c);

	}

}
