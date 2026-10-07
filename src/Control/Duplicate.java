package Control;

//Remove Duplicates from Array - Write a program to remove 
//duplicates from an array using a `for` loop.
public class Duplicate {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 4, 4, 5 };
		System.out.println("Remove Duplicates :");
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				System.out.println(a[i] + " ");
			}
		}
		System.out.println(a[a.length - 1]);
	}

}
