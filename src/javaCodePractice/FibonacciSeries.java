package javaCodePractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		// the Fibonacci sequence is a sequence in which each number is the sum 
		//of the two preceding ones. Numbers that are part of the Fibonacci sequence
		//are known as Fibonacci numbers, commonly denoted Fₙ.
		// Fibonacci of 5 = 
		int n = 10, num1 = 0, num2 = 1;
		System.out.print("Fibonacci Series: " + num1 + ", " + num2);
		for (int i = 2; i < n; i++) {
		int num3 = num1 + num2;
		System.out.print(", " + num3);
		num1 = num2;
		num2 = num3;
		}
		
//		 Scanner scanner = new Scanner(System.in);
//	        
//	        System.out.print("Enter the number of terms in the Fibonacci series: ");
//	        int terms = scanner.nextInt();
//	        
//	        int firstTerm = 0, secondTerm = 1;
//	        
//	        System.out.println("Fibonacci Series up to " + terms + " terms:");
//
//	        for (int i = 1; i <= terms; i++) {
//	            System.out.print(firstTerm + " ");
//
//	            // Compute the next term
//	            int nextTerm = firstTerm + secondTerm;
//	            firstTerm = secondTerm;
//	            secondTerm = nextTerm;
//	        }
//
//	        scanner.close();

	}

}
