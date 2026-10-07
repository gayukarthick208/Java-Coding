package arrays;
//Search for an element in an array (Linear Search)

public class arr_search {
	public static void main(String[] args) {

		int[] a = { 2, 3, 6, 5, 8, 9 };
		int num = 6;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				System.out.println("Element Found");
				System.out.println("Index :" + a[i]);
				break;
			}
			if (i == a[i]) {
				System.out.println("Element Not Found");
			}
		}

	}
}
