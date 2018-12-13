package constructors;

public class House extends Dwelling {

	int walls;
	
	// Java provides a default super with no arguments - don't need to type it
	public House() {
//		super();
		System.out.println("Building a house with no instructions");
		this.walls = 4;
	}
	
	public House(int area, String name, int walls) {
		super(area, name); // calls constructor from immediate parent class (super can only go 1 class up)
		this.walls = walls;
		System.out.println("built a house with instructions");
	}
	
}
