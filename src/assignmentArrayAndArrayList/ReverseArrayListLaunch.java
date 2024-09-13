package assignmentArrayAndArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseArrayListLaunch {

	public static void main(String[] args) {

		ReverseArrayList r1=new ReverseArrayList();
		r1.StudentName.add("varun");
		r1.StudentName.add("Reena");
		r1.StudentName.add("Naveen");
		r1.StudentName.add("Robin");
		r1.StudentName.add("Peter");
		
		System.out.println(r1.StudentName);
//		for (int i=r1.StudentName.size()-1;i>=0;i--)
//		{
//			//System.out.println(r2.get(i)); //6
//			//String r3=r1.get(i);
//			//System.out.println(r1.StudentName.indexOf(i));
//			
//			
//			System.out.print(r1.StudentName.get(i)+",");
//		
//		}
//		
		ArrayList<String> r2=r1.StudentName;
		
		for (int i=r2.size()-1;i>=0;i--)
		{
			//System.out.println(r2.get(i)); //6
			String r3=r2.get(i);
			//System.out.println(r1.StudentName.indexOf(i));
			
			System.out.println(r3);
			//System.out.println(r3.toString());
		
		}
		System.out.println("------");
		Collections.reverse(r2);
		System.out.println(r2);
	}

}
