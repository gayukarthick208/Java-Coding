package arrays;

//Count even and odd numbers
public class count_ev_od {
	public static void main(String[] args) {
		int[] numbers = { 21, 4, 35, 20, 15, 62, 38, 6 };
		int even = 0;
		int odd = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				even++;

			} else {
				odd++;

			}
		}
		System.out.println("Count even number :" + even);

		System.out.println("Count odd number :" + odd);
	}

}
