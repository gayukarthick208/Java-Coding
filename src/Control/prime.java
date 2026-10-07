package Control;

// Write a program to check if a number is prime using a `for`
//loop.
public class prime {
	public static void main(String[] args) {
		int number = 15;
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;

			}

		}
		if (count == 2) {
			System.out.println("Its a prime number");
		} else {
			System.out.println("Its not a prime number");
		}
	}
}
