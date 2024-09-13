package assignmentMethods;

import java.util.Scanner;

public class CircleAreaCircumferenceLaunch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle");
		int n1=sc.nextInt();
		CircleAreaCircumference c1=new CircleAreaCircumference();
		c1.setR(15);
		c1.areaofCicle();
		c1.areaofCicle(15);
		c1.circumfrenceofCicle(5);
		
		c1.setR(n1);
		c1.areaofCicle();
		c1.areaofCicle(n1);
		c1.circumfrenceofCicle(n1);
	}

}
