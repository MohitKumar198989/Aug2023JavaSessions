package assignmentMethods;

import java.util.Scanner;

public class FactorialOfANumberLaunch {

	public static void main(String[] args) {

		FactorialOfANumber n1= new FactorialOfANumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
		int n2=sc.nextInt();
		n1.Factorial(n2);
	}

}
