package arrays;

import java.util.Arrays;

//Check if Two Strings are Anagrams - 
//Write a program to check if two given strings are anagrams of each other. 
public class Anagrams {
	public static void main(String[] args) {
		String a = "Heart";
		String b = "Earth";

		System.out.println("Before sort: ");
		a = a.toUpperCase();
		System.out.println(a);
		b = b.toUpperCase();
		System.out.println(b);
		if (a.length() != b.length()) {
			System.out.println("Not Anagram");
		} 
		else {
			char[] x = a.toCharArray();
			char[] y = b.toCharArray();

			System.out.println("After Sort: ");
			Arrays.sort(x);
			System.out.println(x);
			Arrays.sort(y);
			System.out.println(y);

			if (Arrays.equals(x, y)) {
				System.out.println("It's Anagram");
			}

			else {
				System.out.println("Its Not an Anagram");
			}

		}
	}

}
