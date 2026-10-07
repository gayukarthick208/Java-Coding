package String;

//Check if a String Contains a Substring - 
//Write a program to check if a given substring is present in a string. 
public class Substring_check {

	public static void main(String[] args) {
		String a = "Java Programming";
		String b = "Java";

		System.out.println(a);
		System.out.println(b);

		if (a.contains(b)) {
			System.out.println("Substring is Present");
		} else {
			System.out.println("Substring not Present");
		}

	}

}
