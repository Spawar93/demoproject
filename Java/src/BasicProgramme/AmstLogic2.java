package BasicProgramme;
import java.util.Scanner;
public class AmstLogic2 {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n = sc.nextInt();
         int count=0, temp1=n, temp2=n, total=0, remd, c;
          
         while(n!=0) // No. of digits calculation
         {
        	 count++;
        	 n=n/10;
         }
         
         while(temp1!=0) // Actual amstrong number calculation
         {
            remd = temp1%10;
        	c = (int) Math.pow(remd,count);
        	total = total + c;
        	temp1 = temp1/10;
         }
         //Amstrong number checking
         if(total==temp2)
         {
        	 System.out.println(temp2+" is Amstrong number");
         }
         else
        	 System.out.println(temp2+" is not amstrong number");
        	 
	}

}
