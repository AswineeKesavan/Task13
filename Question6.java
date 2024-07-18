package Task13;

import java.util.Scanner;

public class Question6 {

	    private static final String CORRECT_PASSWORD = "password123"; 
	    
	    public static void login(String username, String password) throws IncorrectPasswordException {
	        if (!password.equals(CORRECT_PASSWORD)) {
	            throw new IncorrectPasswordException();
	        }
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your username: ");
	        String username = scanner.nextLine();
	        
	        System.out.print("Enter your password: ");
	        String password = scanner.nextLine();
	        
	        try {
	            login(username, password);
	            System.out.println("Login successful!");
	            // Proceed with further actions after successful login
	        } catch (Exception e) {
	            System.out.println("Login failed: Incorrect password.");
	        }
	        
	        scanner.close();
	    }
	}

//Custom exception class for incorrect password scenario
class IncorrectPasswordException extends Exception {
 // Optional: You can add additional customization to this exception class if needed
}


