package java_loops_demo;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname = "sokoeurn";
		String lastname = "chhay";
		
		//concat
		System.out.println(firstname.length());
		System.out.println(firstname+" "+lastname);
		System.out.println(firstname.concat(" "+lastname));
		
		//equals
		System.out.println(firstname.equals(lastname));
		
		//contains
		System.out.println(firstname.contains("oe"));
		System.out.println(lastname.contains("hh"));
		
		//substring
		System.out.println( firstname.subSequence(0, 8));
		System.out.println( lastname.subSequence(0, 5));
		
		System.out.println( firstname.substring(0));
		System.out.println(lastname.substring(0, 5)); 
		
		//replace
		System.out.println( firstname.replace("o", "a"));
		System.out.println(lastname.replace("chh", "ch"));
		

	}

}