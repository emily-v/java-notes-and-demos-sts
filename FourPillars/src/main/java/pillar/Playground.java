package pillar;

public class Playground {

	public static void main(String[] args) {
		
		Car steves = new Car("Steve's car", 30, 150);
		Car jims = new Car("Jim's Car", 20, 110);
		
		Car empty = new Car();
		
		System.out.println(empty.hp); // null
		
		// jims.tank = 25; can't do this because tank is private
		jims.setTank(100);
		for(int i=0;i<100;i++) {
			jims.drive();
		}
		
		System.out.println("Is the car moving? " + steves.isMoving);
		
		
		System.out.println("Is the car moving? " + jims.isMoving);
	}
}
