package BasicProgramme;
import java.util.Scanner;
public class HCF { // HCF and LCM calculation of two numbers

	public static void main(String[] args) {
		
		int i ;
		 int hcf= 0;  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a= sc.nextInt();
		int b = sc.nextInt();
	
	   for (i=1; (i<=a && i<=b); i++)
		  {     
			    if(a%i==0 && b%i==0)
			    {
			        hcf=i;
			    }
           }
		  System.out.println("HCF of "+a+" & "+b+" is: "+hcf);
		  
		  int lcm= (a*b)/hcf;
		  System.out.println("LCM of "+a+" & "+b+" is: "+lcm);
	}

}

