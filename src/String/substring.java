package String;

//Find All Substrings of a String - 
//Write a program to find and print all substrings of a given string
public class substring {

	public static void main(String[] args) {
		String str = "Josh";

		System.out.println("Substrings for given string:");
		System.out.println();

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {

				System.out.println(str.substring(i, j));
			}
		}

	}

}


