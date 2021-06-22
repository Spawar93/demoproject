package Practice2;
import java.util.Scanner;

      //Profit loss
public class userinput {

	public static void main(String[] args) {
		int cp,sp,loss,profit;
	 Scanner sc = new Scanner(System.in);
       System.out.println("Enter the cp");
       cp = sc.nextInt();
       System.out.println("Enter the sp");
       sp = sc.nextInt();
       if(sp>cp)
       {
    	 profit = sp-cp;
    	 
         System.out.println("sellar has made profit:"+profit);
       }
         else if(cp>sp)
         {
        	 loss = cp-sp;
        	 System.out.println("sellar has made loss:"+loss);
         }
         else
        	 
        	 System.out.println("No profit no loss");
	}

}









