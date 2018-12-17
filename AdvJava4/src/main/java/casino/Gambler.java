package casino;

public class Gambler {

	public void gamble() {
		
		System.out.println("Going to the casino to win big!");
		double luck = Math.random();
		luck = (int) (luck*100); // casting is performed before arithmetic operations
		try {
			playSlots(luck);
		} catch (LostEverything le) {
			System.out.println("Sell the house");
//			le.printStackTrace();
		} catch (LostMoneyExc e) {
			System.out.println("Cancel fancy dinner reservation");
//			e.printStackTrace();
		} finally { // this will print in any condition
			System.out.println("Lie and say you were working late");
		}
	}
	
	public void playSlots (double luck) throws LostMoneyExc,LostEverything {
		
		if (luck > 90) {
			System.out.println("Congratulations you won some money");
		} else if (luck > 50){
			throw new LostMoneyExc(); // added throws LostMoneyExc to method signature
		} else {
			throw new LostEverything();
		}
		
	}
	
}
