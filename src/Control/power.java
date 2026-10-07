package Control;

//Write a program to calculate the power of a number using a `for` loop. 
public class power {
	public static void main(String[] args) {

		int base = 5;
		int exponent = 3;
		int result = 1;

		for (int i = 1; i <= exponent; i++) {
			result = result * base;
		}
		System.out.println(base + " raised to the power" + exponent + "=" + result);
	}
}
