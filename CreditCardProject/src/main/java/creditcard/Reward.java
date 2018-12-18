package creditcard;

public class Reward { // * removed implements Comparable<Reward>

	String name;
	int value;
	String selector;
	
	
	public Reward(String selector, String name, int value) {
		super();
		this.selector = selector;
		this.name = name;
		this.value = value;
	}



	public void listRewards() {
		System.out.println("Item " + selector + ": " + name + "\nRedeem for: " + value + " points\n");
	}



//	public int getValue() {
//		return value;
//	}
//
//
//
//	public void setValue(int value) {
//		this.value = value;
//	}
	
	
	
	
	
	
	
	// Sort Rewards TreeSet by point value (now using ArrayList so item # and value are in order of input)
//	public int compareTo(Reward r) {
//		
//		if (this.value < r.value) {
//			return -1;
//		}
//		if (this.value > r.value) {
//			return 1;
//		} 
//		return 0;
//	}
	
}
