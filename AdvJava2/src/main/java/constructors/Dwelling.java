package constructors;

public class Dwelling {

	// instance variables - fields
	int area; // initial value = 0
	String name; // initial value = null (any object without a given value = null)
	
	// This is the no args default constructor
	// use this in addition to overloaded constructor when a stripped down object is needed
	public Dwelling() {
		// 'this' keyword will use a constructor of the same class
		this(100, "Something place");
		System.out.println("Building a dwelling that has no instructions");
		// this() above takes place of this. below
//		this.area = 100;
//		this.name = "Something place";
	}
	
	// This is a created constructor - default constructor no longer applies
//	public Dwelling(int x) {
//		
//	}

	// overloaded constructor - can overload as much as needed
	public Dwelling(int area, String name) {
		System.out.println("Building a dwelling with instructions");
		
		
		this.area = area;
		this.name = name;
	}
	
	public Dwelling(boolean b) {
		if(b==true) {
			this.area = 200;
			this.name = "Another place";
		} else {
			System.out.println("Building a dwelling with no instructions");
		}
	}
	
	
}
