package Control;

// Write a Java program to print the day of the week based on a number
//(1 for Monday, 2 for Tuesday, etc.).

public class switch_statement {
	public static void main(String[] args) {
		int day = 3;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		default:
			System.out.println("Invalid");

		}

	}

}
