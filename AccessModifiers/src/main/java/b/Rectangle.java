package b;

import a.Shape; // import whenever you pull in a class from another package

public class Rectangle extends Shape{

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		int x = r.pro_number; // protected variables can still be seen from inside the subclass
		int y = r.pub_number;
		
		
	}
}
