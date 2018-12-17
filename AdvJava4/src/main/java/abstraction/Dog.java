package abstraction;

// You can use multiple interfaces for a single class
public class Dog extends Animal implements Herbivore,Carnivore,Petable {
	
	@Override
	public void makeSound() {
		System.out.println("Bark Bark Woof");
	}

	public void eatMeat() {
		// TODO Auto-generated method stub
		System.out.println("the dog tears at it with its canines");
		
	}

	public void eatPlants() {
		// TODO Auto-generated method stub
		System.out.println("the dog crunches on some carrots");
	}

}
