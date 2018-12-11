package stringfun;

public class StringFun {

	public static void main(String[] args) {
		
		// To make a string you don't have to use the new keyword
		String s1 = "Hello";
		String s2 = "Hello";
		// These two strings are exactly the same
		// This is called the String pool - when strings with same value have the same address
		
		// Always compares the memory address for objects
		// These strings have the same address because didn't use "new" when creating
		System.out.println(s1==s2); // true
		// Java recognizes when you make strings of exactly the same value so they will share the same memory address (saves memory)
		
		// force Java to make new memory for same string with "new" keyword
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println(s3==s4); // false because declared with the "new" keyword so different memory address
		System.out.println(s3.equals(s4)); // true because .equals checks the value not the memory address
		
		// -----
		
		// Strings are immutable objects. They cannot be changed once created.
		System.out.println(s1);
		System.out.println(s1.concat(" Everyone")); 
		System.out.println(s1); // concatenation did not save because Strings cannot be changed
		
		// StringBuilder is a mutable version of string
		StringBuilder sb = new StringBuilder("Timothy");
		System.out.println(sb);
		System.out.println(sb.append(" Everyone")); 
		System.out.println(sb); // append saved because StringBuilders can be changed
		
		// Use StringBuilder when we anticipate changing the string often. It is faster and more efficient.
		// Use String to save memory in the application but not concerned about speed.
	}

}
