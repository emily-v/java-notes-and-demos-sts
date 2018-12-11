package inheritanceypolymorphism;

// parent class
public class Animal {
	
	// eat method is being OVERLOADED in this class. 
	// same method name but different parameters.
	public void eat() {
		System.out.println("The animal is eating");
	}
	
	public void eat(String food) {
		System.out.println("The animal is eating " + food);
	}
	
	

}
