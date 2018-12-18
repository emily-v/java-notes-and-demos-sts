package creditcard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreditCard {

	private double balance = 0;
	private int rewardPoints = 0;
	double limit = 1000;
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
	
	public double makePurchase (double balanceParam, double priceParam) {
		double attemptedBalance = balanceParam + priceParam;
		if (approve == true) {
			this.balance = attemptedBalance;
			System.out.println("Purchase Approved\n");
		} else {
		System.out.println("Purchase Denied: Spending over limit\n");
		}
		return this.balance;
	}
	
//	public double makePurchase (double balanceParam, double priceParam) {
//		double attemptedBalance = balanceParam + priceParam;
//		if (attemptedBalance <= limit) {
//			this.balance = attemptedBalance;
//			System.out.println("Purchase Approved\n");
//		} else {
//			System.out.println("Purchase Denied: Spending over limit\n");
//		}
//		return this.balance;
//	}
	
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
			System.out.println("rewards file not found");
		}
	}
	
	public void writeRewards(Integer pointBalance) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("../CreditCardProject/src/main/resources/rewards.txt", true));
			writer.newLine();
			writer.write(pointBalance.toString());
			writer.close();
		} catch (IOException e) {
			System.out.println("rewards file not found");
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
			System.out.println("rewards file not found");
		}
		return lastLine;
	}
	
	public int redeemPoints(String choice) {
		boolean invalid = false;
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
      		invalid = true;
	  }
		if (invalid == false) {
			if (val > this.rewardPoints) {
				System.out.println("Insufficient reward points available\n");
			} else {
				this.rewardPoints = this.rewardPoints - val;
				System.out.println("You've redeemed your reward!\n"); // TODO prevent this line from printing if Invalid Choice
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
