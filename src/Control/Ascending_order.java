package Control;

//Sort Array in Ascending Order - Implement a program to sort an array in 
//ascending order using a sorting algorithm and a `for` loop. 

public class Ascending_order {
	public static void main(String[] args) {
		int a[] = { 5, 9, 3, 8, 1, 4, 6, 2, 7 };
		// before sorting
		System.out.println("Before Sorting: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		System.out.println();
		// after sorting
		System.out.println("ascending order: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

}
