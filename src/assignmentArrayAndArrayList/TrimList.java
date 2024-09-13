package assignmentArrayAndArrayList;

import java.util.ArrayList;

public class TrimList {

	public static void main(String[] args) {

	       ArrayList<String> colors = new ArrayList<>(10);
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        
	        colors.trimToSize();
	        System.out.println(colors.size());
	   
	}

}
