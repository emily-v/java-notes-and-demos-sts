package inheritanceypolymorphism;

public class Jungle {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		a.eat();
		
		// made a lion and called it a lion
		Lion l = new Lion();
		l.eat(); // Lion inherits method from Animal
		l.roar();
		
		// made a lion and called it an animal
		Animal l2 = new Lion();
		l2.eat();
//		l2.roar(); not available because l2 declared as Animal type. Java will only recognize Animal methods here
		
//		Lion a2 = new Animal(); does not work because not all animals are lions
		
		Mouse m = new Mouse(); // same output if Animal m = new mouse()
		// the object's child method is always used (more specific) instead of parent class's method (more generic)
		m.eat("cheese");
	}

}
