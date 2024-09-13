package assignmentMethods;

import java.util.Scanner;

public class EvenOddNumberLaunch {

	public static void main(String[] args) {

		EvenOddNumber n1= new EvenOddNumber();
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int n2=sc.nextInt();
		boolean n3=n1.evenOdd(n2);
		System.out.println(n3);
	}

}
