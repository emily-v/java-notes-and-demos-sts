package collectionsfun;

public class City implements Comparable<City>{

	String name;
	int size;
	int population;
	
	
	public City(String name, int size, int population) {
		super();
		this.name = name;
		this.size = size;
		this.population = population;
	}


	@Override
	public String toString() {
		return "City [name=" + name + ", size=" + size + ", population=" + population + "]";
	}
	
	public int compareTo(City c) {
	
		if (this.population < c.population) {
			return -1;
		} else if (this.population > c.population) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
