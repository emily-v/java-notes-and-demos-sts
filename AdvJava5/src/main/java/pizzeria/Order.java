package pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

	List<Pizza> pizzas = new ArrayList<Pizza>();
	
	// Pizza object is the return type
	public Pizza makePizza() {
		
		List<Topping> toppings = new ArrayList<Topping>();
		
		System.out.println("you have chosen to make a new pizza");
		System.out.println("what do you want on your pizza?");
		
		
		// in general, use while loop (instead of for loop) when you don't know how many times you're going to loop through
		while (true) {
			System.out.println("1 for pepperoni");
			System.out.println("2 for meatball");
			System.out.println("3 for spinach");
			
			int choice = PizzaPalace.scan.nextInt();
				switch(choice) {
				case 1: toppings.add(new Topping ("Pepperoni", 2.00));
				break;
				case 2: toppings.add(new Topping ("Meatball", 1.00));
				break;
				case 3: toppings.add(new Topping ("Spinach", 2.50));
			}
				
			System.out.println("Are you finished with your order? Press 0 if complete.");
			try {
				choice = PizzaPalace.scan.nextInt();
			} catch (Exception e) {
				System.out.println("that was invalid choice");
			}
			
			if (choice == 0) {
				int size = sizeChoice();
				//PizzaPalace.scan.close();
				return new Pizza (size, toppings);
			}
		}
		
	}
	
	public int sizeChoice() {
		System.out.println("what size pizza do you want?");
		System.out.println("1 for small, 2 for med, 3 for large");
		//Scanner scan = new Scanner(System.in);
		
		int choice = PizzaPalace.scan.nextInt();
		PizzaPalace.scan.nextLine(); // makes sure the scanner doesn't get messed up
		//PizzaPalace.scan.close();
		return choice;
	}
	
}
