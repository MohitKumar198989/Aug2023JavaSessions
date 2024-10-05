package javaCodePractice;

import java.util.Arrays;

public class MergeArraysExample {

	public static void main(String[] args) {

//
//		// first array
//        int[] a = { 10, 20, 30, 40 };
//
//        // second array
//        int[] b = { 50, 60, 70, 80 };
//
//        // determines length of firstArray
//        int a1 = a.length;
//      
//        // determines length of secondArray
//        int b1 = b.length;
//      
//        // resultant array size
//        int c1 = a1 + b1;
//
//        // create the resultant array
//        int[] c = new int[c1];
//
//        // using the pre-defined function arraycopy
//        System.arraycopy(a, 0, c, 0, a1);
//        System.arraycopy(b, 0, c, a1, b1);
//
//        // prints the resultant array
//        System.out.println(Arrays.toString(c));
//        
//       
		
		

        // first array
        int a[] = { 30, 25, 40 };
        // second array
        int b[] = { 45, 50, 55, 60, 65 };

        // determining length of first array
        int a1 = a.length;
        // determining length of second array
        int b1 = b.length;

        // resultant array size
        int c1 = a1 + b1;

        // Creating a new array
        int[] c = new int[c1];

        // Loop to store the elements of first
        // array into resultant array
        for (int i = 0; i < a1; i = i + 1) {
            // Storing the elements in 
            // the resultant array
            c[i] = a[i];
        }

        // Loop to concat the elements of second 
        // array into resultant array
        for (int i = 0; i < b1; i = i + 1) {

            // Storing the elements in the 
            // resultant array
            c[a1 + i] = b[i];
        }

        // Loop to print the elements of 
        // resultant array after merging
        for (int i = 0; i < c1; i = i + 1) {
            
            // print the element
            System.out.println(c[i]);
        }
        
		
	}

}
