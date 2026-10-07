package arrays;

//Write a program to reverse the elements of an array
public class Reverse {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Array reversed :");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);

		}

	}
}