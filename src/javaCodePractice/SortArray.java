package javaCodePractice;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int[] arr = {5,4,7,9,2,1};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sort of the Array : ");
		System.out.println(Arrays.toString(arr));

	}

}
