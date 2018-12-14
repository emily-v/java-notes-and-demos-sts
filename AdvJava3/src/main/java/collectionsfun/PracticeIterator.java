package collectionsfun;

import java.util.Set;
import java.util.TreeSet;

public class PracticeIterator {

	public static void main(String[] args) {
		
		City javaville = new City("Javaville", 50, 500);
		City jstown = new City("JSTown", 65, 1000);
		City styledale = new City("Styledale", 40, 425);

		Set<City> cities = new TreeSet<City>();
		
		cities.add(javaville);
		cities.add(jstown);
		cities.add(styledale);
		
		System.out.println(cities);

	}

}
