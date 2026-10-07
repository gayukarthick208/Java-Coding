package arrays;

//Remove duplicate elements from an array
public class Rem_duplicate {
	public static void main(String[] args) {
		int[] x = { 2, 1, 3, 3, 4, 2, 5, 7, 6, 8, 7, 9, 6, 1 };
	

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					x[j] = 0;
				}
			}
		}
		System.out.println("Array after removing Duplicates :");
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				System.out.println(x[i] + "  ");
			}
		}
	}
}
