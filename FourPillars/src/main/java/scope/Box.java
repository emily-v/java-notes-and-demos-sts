package scope;

public class Box {
	
	// Java does NOT have global variables
	
	// 'this' variable is attached to one and only one object
	// INSTANCE SCOPE because it belongs to one object aka one instance
	// instance scope is second most generic
	int value = 0;
	
	// the static value belongs to the class and therefore to every object of this class
	// STATIC (CLASS) SCOPE because it is shared by every object and belongs to the class
	// static/class scope is most generic
	static int static_value = 100;
	
	
	public void printValue() {
		System.out.println("The value of the box is " + this.value);
	}
	
	public static void printStaticValue() {
		System.out.println(Box.static_value);
	}

}
