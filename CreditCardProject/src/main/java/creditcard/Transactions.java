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
		Reward ride = new Reward("A","$20 Uber Credit", 300);
		Reward hotel = new Reward("B", "$150 Hotel Credit", 1500);
		Reward airfare = new Reward("C", "$250 Airfare Credit", 2500);
		
//		Set<Reward> rewardsMenu = new TreeSet<Reward>();
		List<Reward> rewardsMenu = new ArrayList<Reward>();

		rewardsMenu.add(ride);
		rewardsMenu.add(hotel);
		rewardsMenu.add(airfare);
		// -- END 
		
		
		Scanner input = new Scanner(System.in);
        
		// -- start up working with any character key + ENTER
		System.out.println("Welcome to the VoyageMax credit card!\n");
		System.out.println("** Press any character key to activate your card."); // TODO implement start on Y input
        input.next().toLowerCase(); // start
        card.clearRewards();
        boolean quit = false;	
        // -- END
        
        int menuChoice;
        do {
        	System.out.println("1. Make a Purchase - Where will you go next?");
            System.out.println("2. Check Balances - No surprises here!");
            System.out.println("3. Redeem Rewards - No FOMO!");
            System.out.println("4. Make a Payment - So you can keep exploring...");
            System.out.println("5. test");
            System.out.println("0. Quit - Trip ended, welcome home.");  
        	System.out.println("\n** Choose your path: ");
        	try {
	        	menuChoice = input.nextInt();
	    		switch (menuChoice) {
	    			case 1:
	    				System.out.println("\n** Enter purchase amount.");
	    				double price = input.nextDouble();
	    				card.approvePurchase(card.getBalance(), price);
	    				card.updateCardBalance(card.getBalance(), price);
	    				card.earnPoints(price);
	    				card.writeRewards(card.getRewardPoints());
	    				break;
	    			case 2:
	    				System.out.println("\n===== Your credit card balance is: $" + card.getBalance());
	    				System.out.println("===== Your reward points balance is: " + card.readRewards() + " points\n");
	    				break;
	    			case 3:
	    				for (Reward r : rewardsMenu) {
	    					r.listRewards();
	    				}
	    				System.out.println("\n** Which reward would you like to redeem?");
	    				System.out.println("===== Travel Notice: You currently have " + card.readRewards() + " reward points to redeem.");
	    				
	    				String rewChoice = input.next().toUpperCase();
	    				int rewVal = 0;
	    				boolean invalid = false;
	    				switch (rewChoice) {
		    		      	case "A":
		    		      		rewVal = ride.getValue();
		    		      		break;
		    		      	case "B":
		    		      		rewVal = hotel.getValue();
		    		      		break;
		    		      	case "C":
		    		      		rewVal = airfare.getValue();
		    		      		break;
		    		      	default:
		    		      		System.out.println("\n===== Travel delay! Invalid choice.");
		    		      		invalid = true;
		    		    }
	    				try {
	    					if (invalid == false) {
	    						card.redeemPoints(rewVal);
	    					}
	    				} catch (RewardsException e) {
	    					// no other message needed
	    				}
	    				
//	    				String rewardChoice = input.next().toUpperCase();
//						try {
//							card.redeemPoints(rewardChoice);
//						} catch (RewardsException e) {
//							// no other message needed
//						}
	    				card.writeRewards(card.getRewardPoints());
	    				break;
	    			case 4:
	    				System.out.println("\n** How much would you like to pay?");
	    				System.out.println("===== Travel Notice: Your credit card balance is: $" + card.getBalance());
	    				double payment = input.nextDouble();
	    				card.updateCardBalance(payment);
	    				break;
	    			case 5:
//	    				for (Reward r : rewardsMenu) {
//	    					System.out.println(r.getValue());
//	    				}
	    				//System.out.println(rewardsMenu.get(0).getValue());
//	    				String rewChoice = input.next().toUpperCase();
//	    				int rewVal = 0;
//	    				boolean invalid = false;
//	    				switch (rewChoice) {
//		    		      	case "A":
//		    		      		rewVal = ride.getValue();
//		    		      		break;
//		    		      	case "B":
//		    		      		rewVal = hotel.getValue();
//		    		      		break;
//		    		      	case "C":
//		    		      		rewVal = airfare.getValue();
//		    		      		break;
//		    		      	default:
//		    		      		System.out.println("\n===== Travel delay! Invalid choice.");
//		    		      		invalid = true;
//		    		    }
//	    				try {
//	    					if (invalid == false) {
//	    						card.redeemPointsTest(rewVal);
//	    					}
//	    				} catch (RewardsException e) {
//	    					// no other message needed
//	    				}
	    				break;
	    			case 0:
	    				System.out.println("\n===== You have quit the program. Thank you for using the VoyageMax credit card. We'll see you next time!");
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
        input.close();
	}
}
