package scope;

public class Warehouse {

	public static void main(String[] args) {
		
		Box a = new Box();
		a.value = 1000;
		
		Box b = new Box();
		b.value = 2000;
		
		a.printValue();
		b.printValue();
		
		// always shared because it is the static value
		a.static_value = 20; // value is always shared in static variables so better to use the below
		Box.static_value = 40000; // better to use this class name for static variables - this is what is applied
		
		// these are the same but makes less sense than the below
		a.printStaticValue(); // output = 40000
		b.printStaticValue(); // output = 40000
		
		// makes more sense than the above
		Box.printStaticValue(); 
		
	}
	
	public static void hello() {
		// This variable is initialized in a method, therefore it is METHOD SCOPE
		// It cannot leave this method
		// method scope is second most specific
		String name = "Michelle";
		
		// Java also has BLOCK SCOPE - cannot leave {block}
		// block scope is most specific
		if(true ) {
			int blocko = 10;
		}
//		blocko = 20; does not work
	}
}
