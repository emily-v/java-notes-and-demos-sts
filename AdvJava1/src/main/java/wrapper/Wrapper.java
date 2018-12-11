package wrapper;

public class Wrapper {

	public static void main(String[] args) {
		
		// Primitive variable. Lives in the stack
		int x = 100;
		// Wrapper class. It is an object that holds a primitive value
		Integer y = 100;
		
		// Primitive / Wrapper
		// int Integer
		// byte Byte
		// short Short
		// long Long
		// float Float
		// double Double
		// char Character
		// boolean Boolean

		// Need to know that comparing a primitive to a wrapper compares the value. The wrapper class is unboxed.
		System.out.println(x==y);
		
		// If you compare wrapper classes it looks for memory address 
		// UNLESS the values of the wrapper objects are within byte range (less than 127)
		Integer i = 1000;
		Integer I = 1000;
		System.out.println(i==I); // false
		
		add(I, I); // works because we are unboxing the wrapper objects
		subtract(i, i); // works because we are auto-boxing the primitive
		
		sort(x); // prefers to invoke method with same data type (primitive vs. wrapper) but will work with either
		
		// Wrappers are object which have their own static and non-static methods
		int k = Integer.parseInt("90");
	}
	
	public static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static void subtract(Integer num1, Integer num2) {
		System.out.println(num1-num2);
	}
	
	// overloaded method
	public static void sort(int num) {
		System.out.println("in the int");
	}
	
	public static void sort(Integer num) {
		System.out.println("in the Integer");
	}

}
