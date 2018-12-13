package constructors;

public class Playground {
	
	public static void main(String[] args) {
		
//		Dwelling d1 = new Dwelling();	
//		Dwelling d2 = new Dwelling(120, "Emily's Place");
//		Dwelling d3 = new Dwelling(false);
		
		// The dwelling constructor is called first
		// Before there is a House there is a Dwelling
//		House h1 = new House();
//		
//		Mansion m1 = new Mansion(); // Dwelling created first, then House, then Mansion
		
		House h2 = new House(300, "Fred's House", 6);
	}
}
