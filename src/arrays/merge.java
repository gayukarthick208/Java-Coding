package arrays;

//Merge Two Arrays - Write a program to merge two arrays into one. 
public class merge {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };

		int[] merge = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			merge[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			merge[a.length + i] = b[i];
		}
		System.out.println("Merged Array:");

		for (int num : merge) {

			System.out.println(num + " ");
		}
	}

}
