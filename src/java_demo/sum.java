package java_demo;

//sum of 5 numbers
public class sum {
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
