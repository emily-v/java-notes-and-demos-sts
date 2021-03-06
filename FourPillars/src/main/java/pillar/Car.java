package pillar;

// main method is in Playground.java

public class Car {

	// fields
	String name;
	int mpg;
	int hp;
	private double tank;
	double miles;
	boolean isMoving;
	
	// constructor builds an instance of the class aka and object
	
	public Car(String nameParam, int mpgParam, int hpParam) {
		
		this.name = nameParam;
		this.mpg = mpgParam;
		this.hp = hpParam;
	}
	
	public Car() {
		// this is the default constructor (no params)
	}
	
	public void drive() {
		setTank(getTank()-5);
		if (getTank()>0) {
			this.isMoving = true;
			System.out.println(this.name + " is driving");			
		} else {
			this.isMoving = false;
			System.out.println("Out of gas");
		}
	}
	
	public void drive(double distance) { // overloaded drive methods. Java uses the correct one based on parameters
		this.miles = this.miles + distance;
		double gasUsed = this.miles/this.mpg;
		this.tank = this.tank - gasUsed;
		setTank(this.tank);
	}
	
	public void stop() {
		this.isMoving = false;
		System.out.println("The car is stopped");
	}
	
	public void setTank(double tankParam) {
        this.tank = tankParam;
        if (tankParam <= 0) {
            this.tank = 0;
        } else {
        	this.tank = tankParam;
        }
    }
	
	public double getTank() { // necessary to see/print set value of private variable
        return this.tank;
    }
}
