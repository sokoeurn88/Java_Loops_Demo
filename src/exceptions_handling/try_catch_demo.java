package exceptions_handling;

public class try_catch_demo {

	public static void main(String[] args) {
		
		//try{}catch(){}
		try {
			int i = 20;
			System.out.println(i/0);
			
		} catch(ArithmeticException e) {
			System.out.println( e.getMessage());
		}
		System.out.println("The result after division is :");
		
		
		//supose you don't know any kinds of exceptions use try{}catch(Exception e){} : handle all kinds of exceptions
		

	}

}
