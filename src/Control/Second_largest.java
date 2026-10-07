package Control;

//Find Second Largest Element in an Array - 
//Write a program to find the second largest element in an array using a `for` loop. 

public class Second_largest {
	public static void main(String[] args) {
		int num[] = { 36, 49, 13, 95, 81, 28, 32, 80, 7 };
		int largest = num[0];
		int secondlargest = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] > secondlargest && num[i] < largest) {
				secondlargest = num[i];
			}
		}

		System.out.println("largest element :" + largest);
		System.out.println("Secondlargest element :" + secondlargest);

	}

}
