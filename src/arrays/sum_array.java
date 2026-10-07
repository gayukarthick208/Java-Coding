package arrays;

//Find the Sum of Array Elements - Write a program to calculate the sum of all elements in an array.
public class sum_array {
	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50 };
		int sum = 0;
		System.out.print("sum of arrayed Elemnts :");

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}
		System.out.println(sum);
	}

}
