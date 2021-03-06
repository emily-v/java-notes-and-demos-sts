package stringfun;

import garbage.Book; // importing from garbage package, Book class

public class MemAddress {

	public static void main(String[] args) {
		
		Book b1 = new Book("Frankenstein", 100); // These books are in separate memory locations
		// the new keyword means its a new object that never existed before
		Book b2 = new Book("Frankenstein", 100); // new allocates 'new memory' and another location
		
		int x = 10;
		int y = 10;
		
		// == with primitives checks the value of variables
		System.out.println(x==y); // true
		// == with objects compares the location of the object, not the value
		System.out.println(b1==b2); // false

	}

}
