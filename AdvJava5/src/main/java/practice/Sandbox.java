package practice;

public class Sandbox {

	// everything you wanted to know about static but were too afraid to ask
	
	// the static block executes the moment that a class is loaded
	static {System.out.println("Hello this is in sandbox");}
	
	// static means unmoving. for java, it is the memory location that is static or unchanging
	public static void main(String[] args) {

		// doesn't need a Donut object instantiated to print static int x
		System.out.println(Donut.x); // also runs static blocks in class
		
		Glaze.sayHello(); // works without Glaze object instantiated first because it's static
		
		Glaze g = Glaze.glaze;
		g.digaHola();

	}

}
