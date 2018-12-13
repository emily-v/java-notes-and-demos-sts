package scan;

import java.util.InputMismatchException;

import java.util.Scanner;

public class ScannerCalculator {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Which operation do you want to perform? Choose from:");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		
			try {
				choice = scan.nextInt();
				if (choice >= 1 && choice <= 4) {
					System.out.println("enter first number");
		    		num1 = scan.nextInt();
		    		System.out.println("enter second number");            		
		    		num2 = scan.nextInt();
		    		switch (choice) {
				        case 1: 
				        	System.out.println("Result: " + add(num1, num2));
				        break;
				        case 2: 
				        	System.out.println("Result: " + subtract(num1, num2));
				        break;
				        case 3: 
				        	System.out.println("Result: " + multiply(num1, num2));
				        break;
				        case 4: 
				        	try {
				        		System.out.println("Result: " + divide(num1, num2) + " (remainder hidden)");
				        	} catch (ArithmeticException ae) {
				        		System.err.println("cannot divide by 0");
				        	}
				        break;
		    		}
				} else {
					System.err.println("choice must be 1, 2, 3 or 4");
				}
			} catch (InputMismatchException im) {
				System.err.println("invalid entry");
			}
			scan.close();
		}
	
	public static int add(int num1, int num2) {

        int result = num1 + num2;
        return result;
    }
	
	public static int subtract(int num1, int num2) {

        int result = num1 - num2;
        return result;
    }
	
	public static int multiply(int num1, int num2) {

        int result = num1*num2;
        return result;
    }
	
	public static int divide(int num1, int num2) {

        int result = num1/num2;
        return result;
    }

    

}
