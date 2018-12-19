package creditcard;

public class Reward { // * removed implements Comparable<Reward>

	String name;
	private int value;
	String selector;
	
	// Default Constructor
	public Reward() {
		
	}
	
	public Reward(String selector, String name, int value) {
		super();
		this.selector = selector;
		this.name = name;
		this.value = value;
	}



	public void listRewards() {
		System.out.println("\nItem " + selector + ": " + name + "\nRedeem for: " + value + " points");
	}
	
	// Test method to get point value of rewards
	public void test(int rewardValue) {
		System.out.println("reward value is: " + rewardValue);
	}



	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	
	
	
	
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
