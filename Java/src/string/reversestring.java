package string;

public class reversestring {

	public static void main(String[] args) {
	  
		String a = "Welcome to India";
		String s[]= a.split(" ");
		String b ; 
		String c;  
		System.out.println(a);
		// convert splitted string array 's' to string 'b'
          for(int i= 0; i<s.length; i++)
          {  
        	  b="";
              b = b+ s[i];   
            
             // Reverse string 'b' each words and store it in string 'c'
              c="";
              for(int k= b.length()-1; k>=0; k--)
              {   
                 c= c+b.charAt(k);
              }
              
              System.out.print(c);
              System.out.print(' ');
           } 
        	
         
     }

}
      

