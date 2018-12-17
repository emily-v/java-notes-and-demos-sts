package creditcard;

public class CreditCard {

	double balance = 0; // *removed private
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

	
	// *removing getter and setter
//	public double getBalance() {
//		return this.balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
	
	public double makePurchase (double balanceParam, double priceParam) { // TODO fix doubling balance
		double attemptedBalance = balanceParam + priceParam;
		if (attemptedBalance < limit) {
			this.balance = attemptedBalance;			
		} else {
			System.out.println("Purchase Denied: Spending over limit\n");
			//this.balance = balance;
		}
		return this.balance;
	}
	
	public int earnPoints () {
		this.rewardPoints = (int) (this.balance*.1); // * changed from makePurchase(balance)
		return this.rewardPoints;
	}
	
//	public int earnPoints (double price) {
//		this.rewardPoints = (int) (rewardPoints + price*.1);
//		return this.rewardPoints;
//	}
	
	public int getRewardPoints() {
		return this.rewardPoints;
	}
	
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	
	
}
