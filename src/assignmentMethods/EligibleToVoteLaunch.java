package assignmentMethods;

import java.util.Scanner;

public class EligibleToVoteLaunch {

	public static void main(String[] args) {

		EligibleToVote n1=new EligibleToVote();
		System.out.println("Please enter the age");
		Scanner sc= new Scanner(System.in);
		int n2= sc.nextInt();
		boolean n3=n1.e1(n2);
		System.out.println("Eligible To Vote : "+n3);
		System.out.println(n3);
		
		}

}
