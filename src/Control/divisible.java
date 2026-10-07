package Control;

//Check Divisibile by 5 - Write a program that checks if a number is divisible by 5 using `ifelse`. 
public class divisible {
	public static void main(String[] args) {
		int num = 255;
		if (num % 5 == 0) {
			System.out.println(num + ": its divisible by 5");
		} else {
			System.out.println(num + ": its not divisible by 5");
		}

	}
}
