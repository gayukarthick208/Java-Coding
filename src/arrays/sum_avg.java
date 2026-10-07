package arrays;

//Find the sum and average of array elements
public class sum_avg {
	public static void main(String[] args) {
		int[] number = { 10, 20, 30, 40, 50, 60 };
		int sum = 0;

		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
		int average = sum / number.length;
		System.out.println("sum of the array :" + sum);
		System.out.println("average of the element :" + average);
	}
}
