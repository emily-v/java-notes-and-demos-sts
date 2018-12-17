package comparison;

public class Apple implements Fruit {

	int mass;
	String company;
	
	
	// hashing is usually a pretty good way to determine if an object's values are unique
	// we are not comparing memory addresses
	// objects with the same has number but are not the same values is called a hash collision
	@Override
	public int hashCode() {
//		final int prime = 31;
		int result = 1;
//		result = prime * result + ((company == null) ? 0 : company.hashCode());
//		result = prime * result + mass;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		// deleted generated code
		
		Orange o = (Orange) obj; // will break if passed anything other than an Orange
		if(o.mass == this.mass) {
			return true;
		}
		
		return false;
	}

	
	
}
