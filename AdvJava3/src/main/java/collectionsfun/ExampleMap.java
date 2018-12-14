package collectionsfun;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExampleMap {

	public static void main(String[] args) {

		Person adam = new Person("Adam", 19, 120);
		Person darryl = new Person("Darryl", 29, 150);
		Person mark = new Person("Mark", 15, 90);
		Person john = new Person("John", 41, 170);
		
		Map<String,Integer> phoneBook = new HashMap<String,Integer>();
		
		String tareks = "Tarek";
		String mcdonalds = "Mcdonalds";
		Integer t_num = 555666;
		Integer m_num = 111222;
		
		// Maps store object as key value pairs
		// You cannot iterate over a Map
		phoneBook.put(tareks, t_num);
		phoneBook.put(mcdonalds, m_num);
		
//		System.out.println(phoneBook);
//		System.out.println(phoneBook.get("Tarek")); // get key, output value
		
		Map<Person,String> description = new TreeMap<Person,String>(); // HashMap doesn't sort, TreeMap sorts according to compareTo
		
		description.put(john, "John is cool"); // john is key, "John is cool" is value
		description.put(mark, "Mark is cooler");
		description.put(darryl, "Darryl is the coolest");
		
		System.out.println(description);
		System.out.println(description.get(mark)); // gets value of mark - "Mark is cooler"
		
		
	}

}
