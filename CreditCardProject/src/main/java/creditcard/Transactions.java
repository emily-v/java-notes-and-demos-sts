package creditcard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Transactions {

	public static void main(String[] args) {
		
		CreditCard card = new CreditCard();
		
		// -- Creating Rewards as ArrayList rewardsMenu -- * don't need to have separate arguments *
		Reward ride = new Reward("A","$20 Uber Credit", 20);
		Reward hotel = new Reward("B", "$150 Hotel Credit", 150);
		Reward airfare = new Reward("C", "$250 Airfare Credit", 250);
		
//		Set<Reward> rewardsMenu = new TreeSet<Reward>();
		List<Reward> rewardsMenu = new ArrayList<Reward>();

		rewardsMenu.add(ride);
		rewardsMenu.add(hotel);
		rewardsMenu.add(airfare);
		// -- END 
		
		
		Scanner input = new Scanner(System.in);

		// -- trying to implement press Y to start - program ended after 1st menu choice
//        boolean quit = true;
//		System.out.println("Press Y to start the program"); // TODO implement start on Y input
//        String start = input.next().toLowerCase();
//        if (start == "y") {
//        	quit = false;	
//        } 
		// -- END
		
        
		// -- start up working with any character key + ENTER
		System.out.println("Press any character key to start the program"); // TODO implement start on Y input
        String start = input.next().toLowerCase();
        card.clearRewards();
        boolean quit = false;	
        // -- END
        
        int menuChoice;
        do {
        	System.out.println("1. Make a Purchase");
            System.out.println("2. Check Balances");
            System.out.println("3. Redeem Rewards");
            System.out.println("0. Quit");  
        	System.out.println("Choose menu item: ");
        	try {
//        		if (input.hasNextInt() == true) {
//        			menuChoice = input.nextInt();
//        		} else {
//        			System.out.println("invalid entry type");
//        		}
	        	menuChoice = input.nextInt(); // TODO catch InputMismatchException
	    		switch (menuChoice) {
	    			case 1:
	    				System.out.println("Enter purchase amount");
	    				double price = input.nextDouble();
	    				card.approvePurchase(card.getBalance(), price);
	    				card.makePurchase(card.getBalance(), price);
	    				card.earnPoints(price);
	    				card.writeRewards(card.getRewardPoints());
	    				break;
	    			case 2:
	    				System.out.println("Your credit card balance is: $" + card.getBalance());
	    				System.out.println("Your reward points balance is: " + card.readRewards() + " points\n"); // changed card.getRewardPoints() to card.readRewards()
	    				break;
	    			case 3:
	    				for(Reward r : rewardsMenu) {
	    					r.listRewards();
	    				}
	    				System.out.println("Choose your reward!");
	    				System.out.println("You currently have " + card.readRewards() + " reward points to redeem.");
	    				String rewardChoice = input.next().toUpperCase();
	    				card.redeemPoints(rewardChoice);
	    				card.writeRewards(card.getRewardPoints());
	    				break;
	    			case 0:
	    				System.out.println("You have quit the program");
	    				quit = true;
	    				break;
	    			default:
	                System.out.println("Invalid choice. Please try again.\n");
	         	}
        	} catch (InputMismatchException im) {
        		System.out.println("Invalid entry type. Please try again.\n");
        		input.next();
        	}
		} while (!quit);
	}
}
