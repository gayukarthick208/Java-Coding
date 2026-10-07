package Control;

//Bubble Sort - Implement the bubble sort algorithm using nested `for` loops.
public class Bubblesort {
	public static void main(String[] args) {
		int a[] = { 5, 2, 1, 3, 4 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
				}
		System.out.println("Bubble Sort :");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

}
