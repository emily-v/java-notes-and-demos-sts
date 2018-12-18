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
		Reward ride = new Reward("A","$20 Uber Credit", 200);
		Reward hotel = new Reward("B", "$150 Hotel Credit", 1500);
		Reward airfare = new Reward("C", "$250 Airfare Credit", 2500);
		
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
		System.out.println("Welcome to the Voyage Max credit card!\n");
		System.out.println("** Press any character key to activate your card."); // TODO implement start on Y input
        String start = input.next().toLowerCase();
        card.clearRewards();
        boolean quit = false;	
        // -- END
        
        int menuChoice;
        do {
        	System.out.println("1. Make a Purchase - Where will you go next?");
            System.out.println("2. Check Balances - No surprises here!");
            System.out.println("3. Redeem Rewards - No FOMO!");
            System.out.println("4. Make a Payment - So you can keep exploring...");
            System.out.println("0. Quit - Trip ended, welcome home.");  
        	System.out.println("\n** Choose your path: ");
        	try {
//        		if (input.hasNextInt() == true) {
//        			menuChoice = input.nextInt();
//        		} else {
//        			System.out.println("invalid entry type");
//        		}
	        	menuChoice = input.nextInt();
	    		switch (menuChoice) {
	    			case 1:
	    				System.out.println("\n** Enter purchase amount.");
	    				double price = input.nextDouble();
	    				card.approvePurchase(card.getBalance(), price);
	    				card.updateCardBalance(card.getBalance(), price); // changed method from makePurchase
	    				card.earnPoints(price);
	    				card.writeRewards(card.getRewardPoints());
	    				break;
	    			case 2:
	    				System.out.println("\n===== Your credit card balance is: $" + card.getBalance());
	    				System.out.println("===== Your reward points balance is: " + card.readRewards() + " points\n"); // changed card.getRewardPoints() to card.readRewards()
	    				break;
	    			case 3:
	    				for(Reward r : rewardsMenu) {
	    					r.listRewards();
	    				}
	    				System.out.println("\n** Which reward would you like to redeem?");
	    				System.out.println("===== Travel Notice: You currently have " + card.readRewards() + " reward points to redeem.");
	    				String rewardChoice = input.next().toUpperCase();
						try {
							card.redeemPoints(rewardChoice);
						} catch (RewardsException e) {
							// no other message needed
						}
	    				card.writeRewards(card.getRewardPoints());
	    				break;
	    			case 4:
	    				System.out.println("\n** How much would you like to pay?");
	    				double payment = input.nextDouble();
	    				card.updateCardBalance(payment); // changed method from makePayment (not written yet - trying to override)
	    				break;
	    			case 0:
	    				System.out.println("\n===== You have quit the program. Thank you for using Voyage Max credit card. We'll see you next time!");
	    				quit = true;
	    				break;
	    			default:
	                System.out.println("\n===== Invalid choice. Please try again.\n"); // prints when int outside of switch cases is entered
	         	}
        	} catch (InputMismatchException im) {
        		System.out.println("\n===== Invalid entry type. Please try again.\n"); // prints when non-int is entered
        		input.next();
        	}
		} while (!quit);
	}
}
