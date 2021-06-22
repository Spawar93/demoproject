package NumberSeries;

import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		// Leap year
		int yr;
		Scanner sc= new Scanner(System.in);  //scanner function
		System.out.println("Enter the year");// enter the year input
		yr= sc.nextInt();  //stored value
		

	if ((yr%400==0)||(yr%4==0 && yr%100!=0))
    
   	 System.out.println("yr is leap");
    
     else  
   	 System.out.println("yr is  not leap");
	}
}
