package arrays;

//Find the Maximum Element in an Array - 
//Write a program to find the largest element in an array. 

public class Array_large {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int max = arr[0];

		System.out.print("Maximum Element:");

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
		}
		System.out.println(max);
	}
}
