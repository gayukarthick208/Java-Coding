package Control;

//Print Prime Numbers up to N - Write a program to print all prime 
//numbers up to N using nested `for` loops. 
public class prime_nested {
	public static void main(String[] args) {
		int N = 20;
		System.out.println("prime number:");
		for (int i = 2; i <= N; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2) {
				System.out.println(i);

			}
		}
	}
}
