package pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaPalace {

	static Scanner scan = new Scanner(System.in);
	
	public static void main (String [] args) {
	
		Order o = new Order();
		Pizza p = o.makePizza();
		o.makePizza();
		
		System.out.println(o.pizzas); // only prints 1st pizza made -- check github code **
		System.out.println(o);
		System.out.println(p);
		
		scan.close();
	}
	
}
