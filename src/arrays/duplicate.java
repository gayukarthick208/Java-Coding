package arrays;

//Remove Duplicates from an Array - 
//Write a program to remove duplicate elements from an array.
public class duplicate {
	public static void main(String[] args) {

		int[] num = { 1, 3, 2, 3, 5, 5, 7, 7, 6 };

		System.out.println("Duplicate Elements");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}

			}

		}
	}

}
