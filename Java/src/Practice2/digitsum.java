package Practice2;
import java.util.Scanner;
public class digitsum {

	public static void main(String[] args) { //sum of digits of given number
		// TODO Auto-generated method stub
           int i,sum=0;
           Scanner sc= new Scanner(System.in);
           System.out.println("enter the number");
           
           i= sc.nextInt();
           
           while(i!=0)
           {
        	   sum=sum+(i%10);
        	   i=i/10;
           }
        	   System.out.println("Sum of digits= "+sum);
               
           
        	   
           
	}

}
