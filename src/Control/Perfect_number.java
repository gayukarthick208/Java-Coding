package Control;

//Check for Perfect Number - Write a program to check 
//if a number is a perfect number using a `for` loop. 
public class Perfect_number {
	public static void main(String[] args) {
		int n = 6;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println("Its a perfect number");
		} else {
			System.out.println("Its not a perfect number");
		}
	}
}
