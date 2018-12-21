package singleton;

public class Playground {

	public static void main(String[] args) {
		
		// Can't make object if constructor is private
//		Car c = new Car("Sam's car", 20);
//		Car d = new Car("Mel's car", 25);
		
		
		// Not directly calling the constructor. Instead, calling the method that calls the constructor
		Car a = Car.getCar("Andy's car", 100);
		
		// this does not actually make a car because the method does not allow it
		Car j = Car.getCar("Jene's car", 50);
		
		System.out.println(a);
		System.out.println(j);

	}

}
