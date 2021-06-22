package day2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class demo {
	
	int a;
	float b;
	char c;
	
	     demo()       //  zero constructor
	         {
	    	     a=10;
	    	     b= 20.5f;
	    	     c= 'P';
	         }
	     
	     demo(int m)// Argument constructor
	     {
	    	 a=20;
	    	 b=30.9f;
	    	 c='h';
	     }
	
	
	

	public static void main(String[] args) 
	{
		demo x = new demo();
		System.out.println(x.a);
		
		demo y = new demo();
		System.out.println(y.b);
		
		demo z = new demo();
		System.out.println(z.c);
		
		demo  w= new demo(4);
		System.out.println(w.a);
		
		demo r = new demo(4);
		System.out.println(r.b);
		
		demo t = new demo(4);
		System.out.println(t.c);
		 
		x.a=50;
		System.out.println(x.a);
		
		

	}

}
