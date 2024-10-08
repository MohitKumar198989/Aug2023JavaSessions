package javaCodePractice;

import java.util.HashSet;

public class RemoveDuplicatesHashSet {

	public static void main(String[] args) {


		int[] arr = {1,1,2,2,3,3,4,4};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (Integer num : arr) {
			
			set.add(num);
			
		}
		
		System.out.println(set);

	}

}
