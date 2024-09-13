package assignmentArrayAndArrayList;

import java.util.Arrays;

public class RemoveNumber {
	public void arrayRemove(int[] p)
	
	{
		
		int[] a = new int[p.length-1];
		 
		 int j=0;
		 for (int i=0;i<p.length;i++){
			 if (p[i]!=22){
				 a[j]=p[i];
		 j++;
			}
			 }
		 System.out.println(Arrays.toString(a));
		
		
	

}
}
