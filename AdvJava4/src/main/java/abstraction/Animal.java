package abstraction;

//mark abstract when it doesn't make sense to "make"  an instance of the parent object
// can only make Animal's subclasses, not Animal itself
// can have both abstract and concrete methods in abstract class, or all or none
public abstract class Animal { 

	String name;
	int age;
	boolean alive;
	
	// choosing to make makeSound() abstract 
	// because class is abstract so it will never actually run - see format below
//	public void makeSound() {
//		System.out.println("I make an animal sound");
//	}
	
	// format for abstracted method - including it here so that it MUST be overridden in subclass
	public abstract void makeSound();
	
	// valid for every single animal - doesn't need to be overridden to be more specific
	public void isAlive() {
		if (alive == true) {
			System.out.println("I am alive");
		}
	}
}
