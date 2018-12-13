package scan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
//		System.out.println("pick a number 0,1,2, or 3");
//		Scanner scan = new Scanner(System.in); // type values into console
//		int choice = scan.nextInt();
//		System.out.println("enter first number");
//		double first = scan.nextDouble();
//		System.out.println("enter second number");
//		double second = scan.nextDouble();
//		decider(choice, first, second); 

//		try { 
//			decider(choice, first, second);
//		} catch (ArithmeticException ae) { 
//			System.out.println("You tried to divide by 0");
//		} catch (NullPointerException ne) {
//			System.out.println("the object is null");
//		} catch (Exception e) { // generic catch for any type of exception. should go at the end of catch statements
//			System.out.println("Something went wrong");
//		}
		
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		double num1 = 0;
		double num2 = 0;
		boolean isValid;
		
		System.out.println("enter number 1 or 2");
		
		try {
			choice = scan.nextInt();
			isValid = true;
		} catch (InputMismatchException im) {
			System.out.println("enter a valid integer 1-2. run again."); // write conditional for if choice is not 1-4
			isValid = false;
		}
		
		if (isValid == true) {
			try {
	    		System.out.println("enter first number");
	    		num1 = scan.nextDouble();
	    		System.out.println("enter second number");            		
	    		num2 = scan.nextDouble();
	    	} catch (InputMismatchException im) {
	    		System.out.println("please enter valid number");
	    	}
		} 
		
		
		switch (choice) {
	        case 1: 
	        	System.out.println("Addition");
	        	System.out.println(add(num1, num2));
//	        	try {
//	        		System.out.println("enter first number");
//	        		num1 = scan.nextDouble();
//	        		System.out.println("enter second number");            		
//	        		num2 = scan.nextDouble();
//	        		System.out.println(add(num1, num2));
//	        	} catch (InputMismatchException im) {
//	        		System.out.println("please enter valid number");
//	        	}
	        break;
	        case 2: 
	        	System.out.println("Subtraction");
	        	System.out.println(subtract(num1, num2));
//	        	try {
//	        		System.out.println("enter first number");
//	        		num1 = scan.nextDouble();
//	        		System.out.println("enter second number");            		
//	        		num2 = scan.nextDouble();
//	        		System.out.println(subtract(num1, num2));
//	        	} catch (InputMismatchException im) {
//	        		System.out.println("please enter valid number");
//	        	}
	        	break;
	        //case 3: System.out.println(multiply(num1,num2)); break;
	        //case 4: System.out.println(divide(num1,num2)); break;
	        //default: System.out.println("please input a correct number");
		}
		
	}

    
    public static double add(double num1, double num2) {

        double rem = num1 + num2;
        return rem;

    }
	
	public static double subtract(double num1, double num2) {

        double rem = num1 - num2;
        return rem;

    }

    public static double divide(double num1, double num2) {

        double result = num1/num2;
        return result;
    }

    public static double multiply(double num1, double num2) {

        double result = num1*num2;
        return result;
    }
}
// make calculator where you can select whether to add, multiply, subtract, divide 2 numbers
// handle exception if invalid value entered