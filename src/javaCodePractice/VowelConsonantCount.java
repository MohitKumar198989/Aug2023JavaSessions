package javaCodePractice;

public class VowelConsonantCount {

	public static void main(String[] args) {

		//for String
		String str = "Automation";
		System.out.println(str);
		int vowels = 0, consonants = 0;
		for (char c : str.toCharArray()) {
		if ("aeiouAEIOU".indexOf(c) != -1) {
		vowels++;
		} else if (Character.isLetter(c)) {
		consonants++;
		}
		}
		System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);

		//for char
		Vowel_Or_Consonant('W'); 
		
        Vowel_Or_Consonant('I'); 
       
		
		
	}

	static void Vowel_Or_Consonant(char y)  { 
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                || y == 'u' || y == 'A' || y == 'E' || y == 'I'
                || y == 'O' || y == 'U') 
        		
                System.out.println(y +" " + "It is a Vowel." ); 
            else
                System.out.println(y +" " + "It is a Consonant."); 
        } 
      
}
