package assignmentIfElseAndSwitchCase;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
				
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int a = sc.nextInt();
			System.out.println("Enter the number");		
			int b =sc.nextInt();
					
			
			if (a>0)
			{
				System.out.println("Input number: "+a +" --positive Number");
			}
			else System.out.println("Input number: "+a +" --negative Number");
			

			if (b>0)
			{
				System.out.println("Input number: "+b +" --positive Number");
			}
			else System.out.println("Input number: "+b +" --negative Number");
		  



	}

}
