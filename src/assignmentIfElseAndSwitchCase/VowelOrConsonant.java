package assignmentIfElseAndSwitchCase;

import java.util.Scanner;

public class VowelOrConsonant {
	
		
	public void swtichvowel()
	{
		
	
	
	//char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the charachter");
	
	char ch= sc.next().charAt(0);
	//Char ch= sc.nextChar();
	switch(ch){	
	
	case 'a':
		System.out.println("Vowel");
	
		break;
		
	case 'e':
	{
	System.out.println("Vowel");
	}
	
	break;
	
	case 'i': 
		{
			System.out.println("Vowel");
		}
	break;
	case 'o':
		{
			System.out.println("Vowel");
		}
		break;
	case 'u':
		{
			System.out.println("Vowel");
		}
		break;
	case 'A':
		{
			System.out.println("Vowel");
		}
		break;
	case 'E':
		{
			System.out.println("Vowel");
		}
		break;
	case 'I':
		{
			System.out.println("Vowel");
		}
		break;
	case 'O':
		{
			System.out.println("Vowel");
		}
		break;
	case 'U': 
		{
			System.out.println(ch+" is Vowel");
		}
			
	default:
			System.out.println(ch+" is Consotant");
		
	}
	}
}
