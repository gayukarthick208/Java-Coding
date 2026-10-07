package arrays;

//Find the First Non-Repeated Character in a String -
//Write a program to find the first non  repeated character in a string. 
public class Non_repeat {
	public static void main(String[] args) {
		String name = "lilly";

		for (int i = 0; i < name.length(); i++) {
			int count = 0;

			for (int j = 0; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					count++;
				}

			}

			if (count == 1) {
				System.out.println("First Non Repeated String :" + name.charAt(i));
				break;
			}

		}

	}
}



