package String;

//Check if a String is a Palindrome - 
//Write a program to check if a given string is a palindrome
public class Palindrome {
	public static void main(String[] args) {
		String a = "Madam";
		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {

			rev = rev + a.charAt(i);
		}

		if (a.equalsIgnoreCase(rev)) {

			System.out.println("Palindrome");

		} else {
			System.out.println("Not a palindrome");

		}

	}

}
