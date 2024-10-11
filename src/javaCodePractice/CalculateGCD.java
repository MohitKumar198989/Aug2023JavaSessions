package javaCodePractice;

public class CalculateGCD {

	public static void main(String[] args) {
		
		/**
		 * For a = 60 and b = 48:

    First Iteration:
        temp = 48
        b = 60 % 48 = 12
        a = 48

    Second Iteration:
        temp = 12
        b = 48 % 12 = 0
        a = 12

    Exit Loop: Now, b is 0, so the loop exits.

Final Output

    The final value of a is 12, which is the GCD of 60 and 48. 
    Therefore, 12 is printed to the console.
		 */
			int a = 60, b = 48;
			while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
			}
			System.out.println(a);
			}




}
