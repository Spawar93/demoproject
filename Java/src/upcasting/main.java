package upcasting;

public class main {

	public static void main(String[] args) {
		// Upcasting
		abc a = new pqr();
		 a.test();
		 a.demo();
		 
		 // Normal subclass object
		 pqr b = new pqr();
		 b.test();
		 b.demo();
		 b.pqrmethod();
		 
		// Normal superclass object
		 abc c = new abc();
	     c.test();
		 c.demo();
				 
		 

	}  

}
