package assignmentMethods;

import java.util.Scanner;

public class CalculationsLaunch {

	public static void main(String[] args) {

		CalculationsTwoNumber c1=new CalculationsTwoNumber();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select the choice Addition,Subtraction,multiplication,division ");
		String s1=sc.next();
		System.out.println("Please enter the first number");
		int num1=sc.nextInt();
		System.out.println("Please enter the second number");
		int num2=sc.nextInt();
		switch (s1)
		{
		case "Addition":
		{
			c1.addition(num1, num2);
			break;
		}
		case "Subtraction":
		{
			c1.subtraction(num1, num2);
			break;
		}
		case "Multiplication":
		{
			c1.multiplication(num1, num2);
			break;
		}
		case "Division":
		{
			c1.division(num1, num2);
		}
		}
		
		
	}

}
