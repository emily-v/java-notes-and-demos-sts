package creditcard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreditCard {
	
	private double balance;
	private int rewardPoints;
	
	double limit;
	boolean approve;

	
	// Constructor
	public CreditCard(double balance, int rewardPoints, double limit) {
		super();
		this.balance = balance;
		this.rewardPoints = rewardPoints;
		this.limit = limit;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getRewardPoints() {
		return this.rewardPoints;
	}
	
	public void clearRewardsFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("../CreditCardProject/src/main/resources/rewards.txt"));
			writer.write("Rewards Balance History (last value is current balance)\n");
			writer.close();
		} catch (IOException e) {
			System.out.println("Rewards record not found! Please call customer service");
		}
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
	
	// to Make a Purchase
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
	
	// to Make a Payment
	public double updateCardBalance (double paymentParam) {
		this.balance = this.balance - paymentParam;
		System.out.println("\n===== Success! Thank you for your payment. Onward!\n");
		return this.balance;
	}
	
	// to Earn Points
	public int updatePointsBalance(double purchaseAmount) {
		if (approve == true) {
			this.rewardPoints = this.rewardPoints + ((int) (purchaseAmount*.1));	
		} 
		return this.rewardPoints;
	}
	
	// to Redeem Points
	public int updatePointsBalance(int val) throws RewardsException {
		if (val > this.rewardPoints) {
			throw new RewardsException();
		} else {
			this.rewardPoints = this.rewardPoints - val;
			System.out.println("\n===== You've redeemed your reward!\n");
		}
	return this.rewardPoints;
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
}
