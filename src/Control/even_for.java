package Control;

// Sum of Even Numbers - Use a `for` loop to find the sum of all even numbers up to a given
//number. 
public class even_for {
	public static void main(String[] args) {
		int i;
		int num = 20;
		int sum = 0;
		for (i = 2; i <= num; i = i + 2) {
			sum = sum + i;

		}
		System.out.println("sum of even numbers:" + sum);
	}

}
