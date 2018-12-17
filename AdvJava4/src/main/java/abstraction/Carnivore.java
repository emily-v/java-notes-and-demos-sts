package abstraction;

public interface Carnivore {

	public void eatMeat();
	
	// default is how to write a concrete method in an interface
	// it can still be overridden
	public default void chaseAnimal() {
		System.out.println("chasing down an animal");
	}
	
}
