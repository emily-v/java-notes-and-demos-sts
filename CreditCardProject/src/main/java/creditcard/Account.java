package creditcard;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		
		CreditCard card = new CreditCard();
//		card.makePurchase(200);
//		System.out.println(card.getBalance());
//		System.out.println(card.limit);
		
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
        boolean quit = false;	
        // -- END
        
        int menuChoice;
        do {
        	System.out.println("1. Make a Purchase");
            System.out.println("2. Check Balances");
            System.out.println("3. Redeem Rewards");
            System.out.println("0. Quit");  
        	System.out.println("Choose menu item: ");
              menuChoice = input.nextInt(); // TODO catch InputMismatchException
              switch (menuChoice) {
              case 1:
            	  System.out.println("Enter purchase amount");
            	  double price = input.nextDouble();
            	  card.makePurchase(card.balance, price);
            	  card.earnPoints();
                  break;
              case 2:
                  System.out.println("Your credit card balance is: $" + card.balance); // *changed getBalance() to balance
                  System.out.println("Your reward points balance is: " + card.getRewardPoints() + " points");
            	  break;
              case 3:
            	  System.out.println("Reward prize options coming soon");
                  break;
              case 0:
            	  System.out.println("You have quit the program");
            	  quit = true;
            	  break;
              default:
                    System.out.println("Invalid choice.");
              }
        } while (!quit);
        
	}

}
