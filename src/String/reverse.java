package String;

//Reverse Each Word in a Sentence - 
//Write a program to reverse each word in a sentence
public class reverse {
	public static void main(String[] args) {

		String str = "Java Programming Language";

		String[] rev = str.split(" ");

		for (int i = 0; i < rev.length; i++) {

			String words = rev[i];

			for (int j = words.length() - 1; j >= 0; j--) {
				System.out.println(words.charAt(j));

			}
			System.out.println(" ");

		}
	}

}



