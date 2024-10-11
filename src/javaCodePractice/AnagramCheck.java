package javaCodePractice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		
//		String str1= "listen";
//		String str2= "silent";
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the first String value");
		String str = s1.next();
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the second String value");
		String s3 = s2.next();
		numberIsAnagram(str, s3);
		

	}

	public static void numberIsAnagram(String str, String s3) {
		char[] arr1 = str.toCharArray();
		char[] arr2 = s3.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		 if (Arrays.equals(arr1, arr2)) {
			 System.out.println("String "+ str +" "+ "and " + s3 + " is a Anagram String");
			
		}else {
			 System.out.println("String is not a Anagram String");
		}
	}
}
