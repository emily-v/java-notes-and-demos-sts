package creditcard;

public class CreditCard {

	private double balance = 0;
	private int rewardPoints = 0;
	double limit = 1000;

	
	// constructor with params
	public CreditCard(double balance, int rewardPoints, double limit) {
		super();
		this.balance = balance;
		this.rewardPoints = rewardPoints;
		this.limit = limit;
	}

	// default constructor
	public CreditCard() {
		
	}

	
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double makePurchase (double balanceParam, double priceParam) {
		double attemptedBalance = balanceParam + priceParam;
		if (attemptedBalance <= limit) {
			this.balance = attemptedBalance;
			System.out.println("Purchase Approved\n");
		} else {
			System.out.println("Purchase Denied: Spending over limit\n");
		}
		return this.balance;
	}
	
	public int earnPoints() {
		this.rewardPoints = (int) (this.balance*.1);
		return this.rewardPoints;
	}
	
	public int redeemPoints(String choice) {
		int val = 0;
		
		switch (choice) {
      	case "A":
      		val = 20;
      		break;
      	case "B":
      		val = 150;
      		break;
      	case "C":
      		val = 250;
      		break;
      	default:
      		System.out.println("Invalid choice.");
	  }
		if (val > this.rewardPoints) {
			System.out.println("Insufficient reward points available\n");
		} else {
			this.rewardPoints = this.rewardPoints - val;
			System.out.println("You've redeemed your reward!\n");
		}
		
		return this.rewardPoints;
	}
	
//	public int redeemPoints(String choice) {
//		switch (choice) {
//      	case "A":
//      		this.rewardPoints = this.rewardPoints - 20;
//      		break;
//      	case "B":
//      		this.rewardPoints = this.rewardPoints - 150;
//      		break;
//      	case "C":
//      		this.rewardPoints = this.rewardPoints - 250;
//      		break;
//      	default:
//      		System.out.println("Invalid choice.");
//	  }
//		
//		return this.rewardPoints;
//	}

	
	public int getRewardPoints() {
		return this.rewardPoints;
	}
	
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	
	
}
