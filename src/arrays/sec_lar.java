package arrays;

//Find the Second Largest Element in an Array - 
//Write a program to find the second largest element in an array. 
public class sec_lar {
	public static void main(String[] args) {
		int[] a = { 10, 25, 54, 88, 96, 69 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		System.out.println("Second largest Element :" + a[a.length - 2]);

	}
}
