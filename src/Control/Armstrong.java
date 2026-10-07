package Control;

//Print Armstrong Numbers up to N - 
//Write a program to print all Armstrong numbers up to N using a `for` loop. 
public class Armstrong {
	public static void main(String[] args) {
		int n = 500;
		for (int i = 1; i <= n; i++) {
			int num = i;
			int sum = 0;
			while (num > 0) {
				int rem = num % 10;
				sum = sum + (rem * rem * rem);
				num = num / 10;
			}
			if (sum == i) {
				System.out.println(i);
			}

		}
	}

}
