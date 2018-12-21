package practice;

public class Donut {

	static int x = 100;
	int y = 0;
	
	
	// whenever a class is first called, it will be loaded into the runtime and all static blocks with execute
	// only happens once per class
	// static blocks execute in the order in which they are loaded
	static {System.out.println("I am a static block in Donut class");}
	static int glaze_number = Glaze.g;
}
