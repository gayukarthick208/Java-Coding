package arrays;
// Find the smallest element in an array

public class arr_small {
	public static void main(String[] args) {
		int[] a = { 20, 40, 60, 10, 30, 50 };
		int smallest = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < smallest) {
				smallest = a[i];

			}
		}
		System.out.println("smallest array element :" + smallest);
	}

}
