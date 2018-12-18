package creditcard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreditCard {

	private double balance = 0;
	private int rewardPoints = 0;
	private double limit = 10000;
	boolean approve;

	
	// constructor with params
//	public CreditCard(double balance, int rewardPoints, double limit) {
//		super();
//		this.balance = balance;
//		this.rewardPoints = rewardPoints;
//		this.limit = limit;
//	}

	// default constructor
	public CreditCard() {
		
	}

	
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean approvePurchase (double balanceParam, double priceParam) {
		double attemptedBalance = balanceParam + priceParam;
		if (attemptedBalance <= limit) {
			approve = true;
		} else {
			approve = false;
		}
		return approve;
	}
	
	// previously makePurchase
	public double updateCardBalance (double balanceParam, double priceParam) {
		double attemptedBalance = balanceParam + priceParam;
		if (approve == true) {
			this.balance = attemptedBalance;
			System.out.println("\n===== Purchase Approved! You're on your way!\n");
		} else {
		System.out.println("\n===== Purchase Denied: Your card balance limit is $" + this.limit + ". Make a payment to continue your adventure.\n");
		}
		return this.balance;
	}
	
	// aka makePayment
	public double updateCardBalance (double paymentParam) {
		this.balance = this.balance - paymentParam;
		System.out.println("\n===== Success! Thank you for your payment. Onward!\n");
		return this.balance;
	}
	
	
	public int earnPoints(double purchaseAmount) {
		if (approve == true) {
			this.rewardPoints = this.rewardPoints + ((int) (purchaseAmount*.1));	
		} 
		return this.rewardPoints;
	}
	
//	public int earnPoints() {
//		this.rewardPoints = (int) (this.balance*.1);
//		return this.rewardPoints;
//	}
	
	public void clearRewards() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("../CreditCardProject/src/main/resources/rewards.txt"));
			writer.write("Rewards Balance History (last value is current balance)\n");
			writer.close();
		} catch (IOException e) {
			System.out.println("Rewards record not found! Please call customer service");
		}
	}
	
	public void writeRewards(Integer pointBalance) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("../CreditCardProject/src/main/resources/rewards.txt", true));
			writer.newLine();
			writer.write(pointBalance.toString());
			writer.close();
		} catch (IOException e) {
			System.out.println("Rewards record not found! Please call customer service");
		}
	}
	
	public String readRewards() {
		String tempLast = null;
		String lastLine = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("../CreditCardProject/src/main/resources/rewards.txt"));
			while ((tempLast = reader.readLine()) != null) {
				lastLine = tempLast;
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Rewards record not found! Please call customer service");
		}
		return lastLine;
	}
	
	public int redeemPoints(String choice) throws RewardsException {
		boolean invalid = false;
		int val = 0;
		switch (choice) {
	      	case "A":
	      		val = 200;
	      		break;
	      	case "B":
	      		val = 1500;
	      		break;
	      	case "C":
	      		val = 2500;
	      		break;
	      	default:
	      		System.out.println("\n===== Travel delay! Invalid choice.");
	      		invalid = true;
	    }
		if (invalid == false) {
			if (val > this.rewardPoints) {
				throw new RewardsException();
			} else {
				this.rewardPoints = this.rewardPoints - val;
				System.out.println("\n===== You've redeemed your reward!\n"); // TODO prevent this line from printing if Invalid Choice
			}
		}
		return this.rewardPoints;
	}
	
	public int getRewardPoints() {
		return this.rewardPoints;
	}
	
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	
	
}
