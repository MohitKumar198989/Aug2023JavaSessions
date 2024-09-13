package assignmentIfElseAndSwitchCase;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {

		//int a,b,c,d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		System.out.println("Enter the number:");
		int b =sc.nextInt();
				System.out.println("Enter the number:");
		int c=sc.nextInt();
		System.out.println("Enter the number:");
		int d=sc.nextInt();
		
//		if (a<b)		
//		{
//			if(b<c){
//				if(c<d){
//					System.out.println("Greatest number is"+d);
//				}
//				else {
//					System.out.println("Greatest number is"+c);
//				}
//		}
//		
//		}
		
		if (a<b)
		{
			if (b<c) 
			{
				if(c<d)
				{
					System.out.println("Greater no. is "+d);
				}
				else System.out.println("greater no. is " +c);
			}
			else 
			{
				if (b<d)
				{
				System.out.println("greater no. is " +d);	
				}else
				{
					System.out.println("Greater no. is "+b);
				}
			}
		}
		else {System.out.println("Greater no. is "+a);
		}
		
//		int max= Math.max(Math.max(Math.max(a, b),c), d);
//		System.out.println(max);
	}
}
