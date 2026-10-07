package Control;

// Print the first 10 numbers in the Fibonacci series using a `for` loop.
public class fibonacci {
	public static void main(String[] args) {
		int n = 10;
		int First = 0;
		int Second = 1;
		System.out.println("First 10 Fibonacci Numbers:");
		for (int i = 1; i <= n; i++) {
			System.out.println(First + " ");
		
		int next = First + Second;
		First = Second;
		Second = next;

	}
	}
}
