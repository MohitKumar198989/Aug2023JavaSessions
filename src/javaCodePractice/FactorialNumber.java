package javaCodePractice;

public class FactorialNumber {

	public static void main(String[] args) {

		//The Factorial of a whole number 'n' is defined as 
		//the product of that number with every whole number less than or 
		//equal to 'n' till 1. For example, 
		//the factorial of 4 is 4 × 3 × 2 × 1, which is equal to 24.
		
		int num = 5, factorial = 1;
		for (int i = 1; i <= num; i++) {
		factorial *= i;
		}
		System.out.println(factorial);
		
		
	}

}
