package arrays;

//Find the Pair of Elements with a Given Sum - Write a program to find all pairs of 
//elements in an array whose sum is equal to a specified number
public class Pairs {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 6;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == sum) {
					System.out.println(a[i] + " + " + a[j] + " = " + sum);

				}
			}
		}
	}

}



