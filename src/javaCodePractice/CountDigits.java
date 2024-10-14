package javaCodePractice;

import java.util.Scanner;

public class CountDigits {
	
public static void CcountDigitsMethod(int num) {
		
		int count = String.valueOf(num).length();
		
		System.out.println("Number of digits in " +num + " is " +count );
		
	}

	public static void countDigitsMethod1(int number) {
		
		int count = 0; // Initialize digit count
        int temp = number; // Temporary variable to manipulate the number

        // Check if the number is 0
        if (number == 0) {
            count = 1; // 0 has one digit
        } else {
            // Loop to count digits
            while (temp != 0) {
                temp /= 10; // Remove the last digit
                count++; // Increment count
            }
        }

        System.out.println("Number of digits: " + count); // Output the count
        
		
	}
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int number = scanner.nextInt();
		
		CcountDigitsMethod(number);
		countDigitsMethod1(number);
		
		scanner.close(); // Close the scanner
	}

	
}
