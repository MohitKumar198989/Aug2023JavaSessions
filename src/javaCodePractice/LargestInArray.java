package javaCodePractice;

public class LargestInArray {

	public static void main(String[] args) {
		
//		 //Initialize array  
//		// int [] arr = {25, 11, 7, 75, 56}; 
//        int [] arr = new int [] {25, 11, 7, 75, 56};  
//        //Initialize max with first element of array.  
//        int max = arr[0];  
//        //Loop through the array  
//        for (int i = 0; i < arr.length; i++) {  
//            //Compare elements of array with max  
//           if(arr[i] > max)  
//               max = arr[i];  
//        }  
//        System.out.println("Largest element present in given array: " + max);  
//        
        

		int[] arr = {1, 3, 5, 7, 9};
		int largest = arr[0];
		for (int num : arr) {
		if (num > largest) {
		largest = num;
		}
		}
		System.out.println("Largest element present in given array: "+largest);
		
	}

}
