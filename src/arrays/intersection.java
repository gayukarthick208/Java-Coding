package arrays;

//Find the Intersection of Two Arrays - 
//Write a program to find the common elements between two arrays
public class intersection {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, };
		int[] b = { 4, 5, 6, 7, 8 };

		System.out.println("Commen Element of Array:");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {

					System.out.println(a[i]);
				}

			}

		}

	}

}
