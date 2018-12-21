package singleton;

// There should only ever be one Car
// The Singleton design pattern is to ensure there is only ever one object of a class

public class Car {

	String name;
	int tank;
	
	// The class has a car object that is null
	// static means it belongs to the class not to the instance of an object
	// this is just adding an object to a class
	// if NOT static, it NEEDS and object to exist
	public static Car car = null;
	
	// private constructor for the object
	private Car(String name, int tank) {
		this.name = name;
		this.tank = tank;
	}
	
	// Guarantees that Car will only be made once - either an existing Car or a new one
	// fancy getter
	public static Car getCar (String name, int tank) {
		if (car == null) {
			car = new Car(name, tank);			
		}
		return car;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", tank=" + tank + "]";
	}
	
	
	
}
