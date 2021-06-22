package practice;

public class mainclass {

	public static void main(String[] args) {
		
		Moverriding2 r = new Moverriding2(); // Method overriding
		
        r.test();
        
    Moverriding1 p = new Moverriding2();  // Runtime polymorphism
		
        p.test(); 
        

	}

}
