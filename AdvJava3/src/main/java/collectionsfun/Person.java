package collectionsfun;

public class Person implements Comparable<Person>{

	String name;
	int age;
	int height;
	
	
	
	public Person(String name, int age, int height) {
		super(); // super is redundant here
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	public void sayHello() {
		System.out.println("Hello my name is " + this.name);
	}
	
	public int compareTo(Person p) { // compares this object vs. the next object you pass in according to specified property.
		// If this object is less than the other object, return -1. The same return 0. Greater return 1.
		
		if (this.age < p.age) {
			return -1;
		}
		if (this.age > p.age) {
			return 1;
		} 
		return 0;
	}
}
