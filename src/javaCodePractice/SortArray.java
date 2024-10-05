package javaCodePractice;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		
//		
//		int[] arr = {5,4,7,9,2,1};
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println("Sort of the Array : ");
//		System.out.println(Arrays.toString(arr));

		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		n=sc.nextInt();  
		//creates an array in the memory of length 10  
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Sort elements of the Array : ");
		System.out.println(Arrays.toString(array));
		
		// ascending order.
		//creating an instance of an array  
		int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
		System.out.println("Array elements before sorting:"+Arrays.toString(arr));
		System.out.println("Array elements after sorting:");  
		//sorting logic  
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		//prints the sorted element of the array 
		System.out.println(arr[i]);  
	
		}
		
	}

}
