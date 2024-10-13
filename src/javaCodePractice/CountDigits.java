package javaCodePractice;

import java.util.Scanner;

public class CountDigits {
	
public static void CountDigitsMethod(int num) {
		
		int count = String.valueOf(num).length();
		
		System.out.println("Number of digits in " +num + " is " +count );
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int number = scanner.nextInt();
		
		CountDigitsMethod(number);
		

	}

	
}
