package garbage;

public class Library {

	public static void main(String[] args) {

		// Literally the most generic thing a thing can be
		Object o = new Object();
		// b returns the overridden toString method
		Object b = new Book("Fahrenheit 451", 200);
		Object b2 = new Book("Heart of Darkness", 200);
		Object b3 = new Book("Frankenstein", 200);
		
		System.out.println(b.toString()); // built in method
		System.out.println(b); // gives same output as above (toString method automatically called when overridden)
		
		
	}

}
