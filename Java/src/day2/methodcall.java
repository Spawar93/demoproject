package day2;

import practice.class1;
import practice.gen1;

public class methodcall {
     
	
	 public static int demo()
	 {
		 System.out.println("a");
		 System.out.println("b");
		 return 100;
	 }
	 public static void main(String[] args) {
		int x;
		
		 System.out.println("c");
		x= demo();
		System.out.println(x);
		System.out.println("d");
		demo();
		 gen1 y = new gen1(4);
         System.out.println(y.m);
         
         System.out.println(class1.a);
 		
 		class1 p= new class1();
 		
	}
	
}
