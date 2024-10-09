package javaCodePractice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		
		  // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Read the input number
        int sum = 0; // This will hold the sum of the cubes of the digits
        int temp = num; // A temporary variable to manipulate the number

        // Loop to calculate the sum of the cubes of the digits
        while (temp != 0) {
            // Extract the last digit
            int digit = temp % 10;

            // Add the cube of the digit to sum
            sum += Math.pow(digit, 3);

            // Remove the last digit from temp
            temp /= 10;
        }

        // Check if the sum of the cubes equals the original number
        if (num == sum) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
		
	}

}
