package Control;
//Vowel or Consonant - Check if a given character is a vowel or consonant using `if-else`.
public class vowels {
	public static void main(String[] args) {
		char Letter = 'a';
		if(Letter=='a' || Letter == 'e' ||Letter == 'i'|| Letter == 'o'|| Letter == 'u') {
			System.out.println( Letter + " : Character is a Vowel" );
		}
		else
		{
			System.out.println(Letter + " : Characeter is a Consonant");
		}
	}
	

}
