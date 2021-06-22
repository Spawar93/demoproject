package practice;

public class gen1 {
	
	public static int m;
    int n;
     char r;
     String s;
    
   private gen1()
    {
       m= 35; r= 'p'; s ="Sunil Pawar";
       System.out.println(m+" "+r+" "+s);
    }
    
   public  gen1(int f)
    {
       m=56;
    }
    gen1( int f, char h)
    {
       m=67;
    }
    gen1(int f, char h, float j)
    {
       m=34;
    }

    
    
    

	public static void main(String[] args) {

         
          gen1 x= new gen1();
          System.out.println(x.m);
          
          gen1 y = new gen1(4);
          System.out.println(y.m);
          
          gen1 r= new gen1(4,'s');
          System.out.println(r.m);
          
          
          gen1 t= new gen1( 4,'s', 10.9f);
	      System.out.println(t.m);
          
          
          gen1 s = new gen1();
          System.out.println(s.m);
	}

}
