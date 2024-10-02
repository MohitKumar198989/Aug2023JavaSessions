package javaCodePractice;

public class PalindromeNumber {

	public static void main(String[] args) {

		/**
		 * the string is same after it is reverse.
		 */
		String str = "madam";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(reversed));

	}

}
