package javaCodePractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

//		int num = 11;
//		boolean isPrime = true;
//		for (int i = 2; i <= Math.sqrt(num); i++) {
//			if (num % i == 0) {
//				isPrime = false;
//				break;
//				/**
//				 * For this specific example where num = 11:
//				 * 
//				 * The loop runs with i values: i = 2: 11 % 2 equals 1 (not divisible,
//				 * continue). i = 3: 11 % 3 equals 2 (not divisible, continue).
//				 * 
//				 * The loop does not run for i = 4 since 1111
//				 * 
//				 * ​ is approximately 3.32, and the loop stops at 3.
//				 * 
//				 * Since no divisors were found, isPrime remains true.
//				 * 
//				 * The output will be:
//				 * 
//				 * 11 is a prime number.
//				 */
//			}
//		}
//		// System.out.println(isPrime);
//		if (isPrime) {
//			System.out.println(num + " is a prime number.");
//		} else {
//			System.out.println(num + " is not a prime number.");
//		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
	
		boolean isPrime = true;

		if (num <= 1) {
			isPrime = false; // Numbers less than or equal to 1 are not prime
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false; // Found a divisor, not prime
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}

		scanner.close();

	}

}
