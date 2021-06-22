package string;

public class practice {

	public static void main(String[] args) {
		
		String a = "veloycity ";
		String b = "Velocity";
		
		String c = new String("Velocity");
		String d = new String(" class");
		
		//System.out.println(d==c);
		
		boolean x = a.equals(c);
		System.out.println(x);
		System.out.println(a.concat(d));
		a= a+ "class";
		 a.concat("Pune");
		System.out.println(a.concat("pune"));
		System.out.println(a.charAt(4));
		System.out.println(a.replace("city", "come"));
		System.out.println(a.startsWith("velo"));
		System.out.println(a.toUpperCase());
		//System.out.println(a.toLowerCase());
		//System.out.println(a.trim());
		System.out.println(a.substring(9, 14));
		System.out.println(a.split(" "));

	}

}
