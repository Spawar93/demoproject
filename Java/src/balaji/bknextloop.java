package balaji;

public class bknextloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int k=1;
         for(int a=0;a<4;a++)
         {
        	 System.out.println("");
        	 for(int b=1;b<=4-a;b++)
        	 {
        		 System.out.print(k);
        		 System.out.print("\t");
        		 k++;
        	 }
         }
	}

}
