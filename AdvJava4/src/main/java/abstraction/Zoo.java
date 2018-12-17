package abstraction;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	public static void main(String[] args) {

//		Animal animal = new Animal(); // this doesn't work because marked as abstract
		Animal lion = new Lion();
		Animal dog = new Dog();
		Rabbit rabbit = new Rabbit();
		StuffedAnimal teddy = new StuffedAnimal();
		
		// this marker interface is another viable label
		Petable fluffy = new Dog(); // can't do anything with this
		
		List<Petable> pets = new ArrayList<Petable>();
		pets.add(fluffy);
		pets.add(rabbit);
//		pets.add(dog); doesn't work because dog is labeled as Animal, not Petable Dog
		pets.add(teddy);
		
		
		
		// carnivore methods cannot be seen and neither can the animal
		Herbivore herb = new Dog(); // Herbivore can only eat plants. Java can only do things according to how its labeled, not what it is
		herb.eatPlants();
		
		lion.makeSound();
		dog.makeSound();
	}

}
