package inheritanceypolymorphism;

// child class
public class Lion extends Animal {

	// eat method is inherited without having to be defined in this class
	
	public void roar() {
		System.out.println("Rawr!");
	}
	
	// this method has the same signature as the parent method
	// therefore this method has been OVERRIDDEN in the subclass
	public void eat() {
		System.out.println("The animal is eating a big zebra");
	}
	
}
