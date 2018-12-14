package collectionsfun;

// import from java.util almost always
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExampleIterator {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>(); // ArrayList is designed to hold strings
		
		Person adam = new Person("Adam", 19, 120);
		Person darryl = new Person("Darryl", 29, 150);
		Person mark = new Person("Mark", 15, 90);
		Person john = new Person("John", 41, 170);
		
		// List can have multiple of the same object. The order is preserved.
		people.add(john);
		people.add(mark);
		people.add(adam);
		people.add(darryl);
		people.add(adam);
//		System.out.println(people); // maintains order of insertion
		
		// Set cannot have duplicates and the order of entry is not preserved
		Set<Person> peeps = new TreeSet<Person>(); // doesn't work as TreeSet right away because it expects Strings so sort alphabetically
			// use compareTo in Person to tell it how to sort the tree
		
//		peeps.add(mark);
//		peeps.add(mark);
//		peeps.add(darryl);
//		peeps.add(john);
		peeps.addAll(people);
		
		System.out.println(peeps);
		
		// Do not have [] like with arrays. Use get() method
		Person adam2 = people.get(2);
//		System.out.println(adam2);
		
		// people.contains(o) Collections have a variety of built-in functions
		
		Iterator<Person> iter = people.iterator(); // <Person> is the 'generic'. Necessary to be able to run methods on the iterator. Otherwise defaults to 'Object'
		

		// check to see if there is another element before executing the code again
//		while(iter.hasNext()) { // when people has another item next, keep executing. Like a for loop where you check the length
//			
//			Person p = iter.next(); // sets p as next person in List
//			p.sayHello(); // prints for each Person
//			
//		}
		
		// enhanced for loop - can use instead of while loop
		for(Person p : people) {
			p.sayHello();
		}

	}

}
