package fileiofun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) {

		write(); // overwrites the file - open file to see
		
	}
	
	
	
	public static void read() {

		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("../AdvJava3/src/main/resources/test.txt"));
			// good practice to use relative paths
			
//			boolean finished = false;
			while(true) { // loop allows it to read beyond the first line in the file
				
				String s = reader.readLine();
				
				if(s == null) {
//					finished = true;
					break;
				}
				
				System.out.println(s);
				
			}
			
			reader.close();
			
			
		} catch (FileNotFoundException e){
			System.out.println("file not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void write() {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("../AdvJava3/src/main/resources/test.txt"));
			writer.write("I am being written in from Java");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
