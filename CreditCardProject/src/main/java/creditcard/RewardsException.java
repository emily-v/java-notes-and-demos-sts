package creditcard;

public class RewardsException extends Exception {

	public RewardsException() {
		System.out.println("\n===== Sorry. Insufficient reward points available.");
		System.out.println("===== Make another purchase to increase your reward points.\n");
	}
}
