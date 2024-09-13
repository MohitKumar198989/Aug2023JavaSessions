package assignmentMethods;

import java.util.Scanner;

public class MaximumMinimumNumberLaunch {

	public static void main(String[] args) {

		MaximumMinimumNumber n1=new MaximumMinimumNumber();
		System.out.println("Enter the first numbers");
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		System.out.println("Enter the second numbers");
		int num2=sc.nextInt();
		System.out.println("Enter the third numbers");
		int num3=sc.nextInt();
		n1.max(num1, num2, num3);
		n1.mini(num1, num2, num3);
		int n4=n1.max1(num1, num2, num3);
		System.out.println("The maximum number is : "+n4);
		int n5=n1.mini1(num1, num2, num3);
		System.out.println("The maximum number is : "+n5);
	}

}
