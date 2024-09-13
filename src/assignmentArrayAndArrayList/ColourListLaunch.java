package assignmentArrayAndArrayList;

import java.util.ArrayList;

public class ColourListLaunch {

	public static void main(String[] args) {
		//ColourList c1=new ColourList<"Blue","Red","green","yellow";
		ColourList c1= new ColourList();
		//c1.setColours("blue","red");
		//System.out.println(c1.getColours());
		c1.colours.add("Blue");
		c1.colours.add("Red");
		c1.colours.add("Green");
		c1.colours.add("Yellow");
		//int count=0;
		for (String c:c1.getColours()){
			System.out.println(c);//1
//			System.out.println(c+""+c[count]);
//		
//			//count++;
			
		}
		System.out.println(c1.getColours());
		
		System.out.println(c1.colours.get(0));//2
		System.out.println("-----");
		//c1.colours.add(1, "Yellow");
		c1.colours.set(1, "Yellow");//
		System.out.println(c1);
		System.out.println(c1.getColours());
		c1.colours.remove(3);
		System.out.println(c1.getColours());
		
		String searchcolour="Blue";
		for (String c:c1.getColours()) //5
		//for(int i=0;i<=c1.colours.size()-1;i++) it is not working 
		
		{
			System.out.println("hi");
			if (c.equals(searchcolour))
			{
				System.out.println("found "+searchcolour);
				break;
			}
		}
		ArrayList<String> c3=c1.getColours();
		System.out.println(c3.size());
		
		for (int i=c3.size()-1;i>=0;i--)
		{
			System.out.println(c3.get(i)); //6
		}
		
	}
}
