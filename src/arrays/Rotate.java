package arrays;

//Rotate an Array - Write a program to rotate the 
//elements of an array to the right by a given number of positions. 
public class Rotate {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int rotate = 2;

		for (int r = 0; r < rotate; r++) {
			int last = a[a.length - 1];

			for (int i = a.length - 1; i > 0; i--) {
				a[i] = a[i - 1];

			}

			a[0] = last;
		}
		System.out.println("Array after rotation:");

		for (int num : a) {
			System.out.print(num + " ");

		}
	}
}
