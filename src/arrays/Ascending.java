package arrays;

//Sort an Array in Ascending Order - 
//Write a program to sort the elements of an array in ascending order
public class Ascending {
	public static void main(String[] args) {

		int[] a = { 8, 3, 5, 2, 1, 4, 6, 7 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.println("Ascending Order :");
		for (int i = 0; i < a.length; i++) {
			System.out.println(" " + a[i]);
		}
	}

}




