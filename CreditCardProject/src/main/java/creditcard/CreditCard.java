package creditcard;

public class CreditCard {

	private double balance = 0;
	double limit = 1000;

	
	// constructor with params
	public CreditCard(double balance, double limit) {
		super();
		this.balance = balance;
		this.limit = limit;
	}

	// default constructor
	public CreditCard() {
		
	}

	public double makePurchase (double price) {
		this.balance = balance + price;
		return this.balance;
	}



	
	// will use get & set once I set variable to private
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
}
