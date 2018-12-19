package creditcard;

public class Reward {

	String name;
	private int value;
	String selector;
	
	public Reward(String selector, String name, int value) {
		super();
		this.selector = selector;
		this.name = name;
		this.value = value;
	}

	public void listRewards() {
		System.out.println("\nItem " + selector + ": " + name + "\nRedeem for: " + value + " points");
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
