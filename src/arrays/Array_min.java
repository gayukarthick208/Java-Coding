package arrays;

//Find the Minimum Element in an Array - 
// a program to find the smallest element in an array. 
public class Array_min {
	public static void main(String[] args) {

		int[] arr = { 25, 49, 12, 6, 88, 64 };
		int min = arr[0];

		System.out.print("Smallest element : ");

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}
		}

		System.out.println(min);

	}

}
