package Task13;

import java.util.Scanner;

public class Question7 {

	    private static final int age=18; // Replace with actual correct password
	    
	    public static void Age(int value) throws InvalidAgeException {
	        if (value>=age) {
	            throw new InvalidAgeException();
	        }
	    }
	    
	    public static void main(String[] args)  {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your age: ");
	        int value = scanner.nextInt();
	        
	        try {
				Age(value);
				System.out.println("Age is lesser than 18");
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid age exception");
			}
	        scanner.close();
	    }
	}

//Custom exception class for incorrect password scenario
class InvalidAgeException extends Exception {
 // Optional: You can add additional customization to this exception class if needed
}
