package Task13;
import java.util.Scanner;

/*
 * Write a java program that reads user input for two integers and performs division. handle the exception 
 * that is thrown when the second number is zero, and display an error message to the user?
 */

public class Question4 {

	public static int divideNumbers(int numerator, int denominator) {

		return numerator / denominator;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt user to enter two integers
		System.out.print("Enter the first integer: ");
		int numerator = scanner.nextInt();

		System.out.print("Enter the second integer: ");
		int denominator = scanner.nextInt();

		try {
			int result = divideNumbers(numerator, denominator);
			System.out.println("Result of division: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		}

		scanner.close();
	}
}
