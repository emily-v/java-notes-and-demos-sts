package comparison;

public class Judge {

	public static void main(String[] args) {

		Object orange = new Orange();
		
		
		System.out.println(orange instanceof Fruit); // true
		System.out.println(orange instanceof Object); // true
		
		// We can cast an object to be another object but runs the risk of making a mistake
		Orange orange2 = (Orange) orange; // only works because casted the object (otherwise wouldn't work because orange is an Object not an Orange
		orange2.makeOrangeJuice();
		
		
		Apple a = new Apple();
		a.mass = 130;
		
		Orange o = new Orange();
		o.mass = 130;
		
		System.out.println(a.hashCode());
		
		// returns true because we overrode the equals method in Apple
		System.out.println(a.equals(o));
	}

}
