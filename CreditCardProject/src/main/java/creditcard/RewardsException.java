package creditcard;

public class RewardsException extends Exception {

	public RewardsException() {
		System.out.println("Sorry. Insufficient reward points available. Make another purchase to increase your reward points");
	}
}
