package assignmentMethods;

import java.util.Scanner;

public class ProductTwoDoubleNumLaunch {

	public static void main(String[] args) {

		ProductTwoDoubleNum n1=new ProductTwoDoubleNum();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the first number");
		double num1=sc.nextInt();
		System.out.println("Please enter the second number");
		double num2=sc.nextInt();
		n1.Multiplication(num1, num2);
		
	}

}
