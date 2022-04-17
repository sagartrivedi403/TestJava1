package myfirstjava;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
	
		try {
		System.out.println("Hello Java...");
		int i=1/0;
		System.out.println("Completed");
		}
		catch(Exception exp) {
			System.out.println("Invalid Formula");
			System.out.println("Message is : "+exp.getMessage());
			System.out.println("Cause is : "+exp.getCause());
			exp.printStackTrace();
	}
		finally {
			System.out.println("I am inside finally block");
		}
	
	}

}
