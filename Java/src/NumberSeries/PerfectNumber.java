package NumberSeries;

public class PerfectNumber {

	public static void main(String[] args) {
		
        // Using For loop check number is perfect number or not
     int n=28,i, sum=0; 


    for(i=2; i<=n; i++)
   {
     if(n%i==0)
     {	
      sum=sum+ n/i;
     }
   }

    if(sum==n)
    {  
      System.out.println(n+" is perfect number");
    }	
    else
    {
      System.out.println(n+" is not perfect number");

    }

 }

}
