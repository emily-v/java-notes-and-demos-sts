package exceptional;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PredictedExceptions {

	public static void main(String[] args) {

		File stuff = new File("Users⁩/Emily⁩/⁨Desktop⁩/Desktop photos⁩/⁨Screenshots/me.jpg⁩");
		System.out.println(stuff.exists());
		
		// in a checked exception, Java forces you to handle situations in which the unhappy path occurs
		try {
			FileReader reader = new FileReader(stuff);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.err.println("exception thrown");
		}
		
		try {
			throw new MyException(); // Exceptions need to be caught. RuntimeExceptions don't need to be caught.
		} catch (MyException e) {
			e.printStackTrace();
		}
		
		try {
			readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// if you use 'throws' method be careful.
	// You must handle it because it does not have try/catch
	// think of throws=ducks
	public static void readFile() throws FileNotFoundException{
		
		File stuff = new File("Users⁩/Emily⁩/⁨Desktop⁩/Desktop photos⁩/⁨Screenshots/me.jpg⁩");
		System.out.println(stuff.exists());
		
		// you do not have to immediately handle the exception
		// you can pass along that responsibility to another piece of the code
		
	}
}
