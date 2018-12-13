package exceptional;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		
		try { // try checks for exceptions
		// runtime exception - Java cannot warn me that this will be a problem until it's already run
//		System.out.println(6/0); // throws ArithmeticException
//		throw new ArithmeticException(); // also throws ArithmeticException
			badMath();
			empty();
		// only one catch block ever executes (the first one that applies). most specific should go first
		} catch (ArithmeticException ae) { // if exception is found, execute code in below block
			ae.printStackTrace(); // shows exception code
			System.out.println("You tried to divide by 0");
		} catch (NullPointerException ne) {
			System.out.println("the object is null");
		} catch (Exception e) { // generic catch for any type of exception. should go at the end of catch statements
			System.out.println("Something went wrong");
		}
		// regardless of anything that happens in the try, the finally block will always execute
		finally {
			System.out.println("This finally block will always execute");
		}
		System.out.println("Hello");
		
		
	}
	
	// this will throw an exception
	public static void badMath() {
		try {
			// this threw an exception
			int x = 5/0;
		}catch (ArithmeticException ae){
			// it was caught before execution in main
			System.out.println("You cannot divide by 0");
		}
	}
	
	public static void empty() {
		String s = null;
		// trying to perform and instance method on an object that doesn't exist
		// null pointer exception
		System.out.println(s.length());
	}

}
