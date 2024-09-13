package assignmentMethods;

import java.util.Scanner;

public class DisplayGradesLaunch {

	public static void main(String[] args) {

		DisplayGrades n1= new DisplayGrades();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the marks");
		int n2=sc.nextInt();
		n1.Grades(n2);

		
	}

}
