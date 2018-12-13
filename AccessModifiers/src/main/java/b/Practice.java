package b;

import a.Shape;

public class Practice {

	public static void main(String[] args) {

		Shape s = new Shape();
		int x = s.pub_number; // public variable is available anywhere even in another package
		// other variables still exist but can't be accessed programmatically
		
		System.out.println("Practice class");
		System.out.println(s);
	}

}
