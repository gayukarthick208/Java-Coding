package String;

//Count Vowels and Consonants in a String - 
//Write a program to count the number of vowels and consonants in a string. 
public class Count_vow {

	public static void main(String[] args) {

		String name = "Inheritance";
		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = Character.toLowerCase(name.charAt(i));

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else {
				consonants++;

			}
		}
		System.out.println("Given String :"+ name);
		System.out.println("Vowels :" + vowels);
		System.out.println("Consonants :" + consonants);
	}
	
}



