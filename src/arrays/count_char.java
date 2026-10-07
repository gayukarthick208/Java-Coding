package arrays;

//Count Characters in a String - Write a program to count the number of characters in a string.
import java.util.Scanner;

public class count_char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String name = sc.nextLine();
		int count = name.length();
		System.out.println("Number of characters in the string:" + count);
		sc.close();
	}

}
