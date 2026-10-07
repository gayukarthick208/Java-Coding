package Control;
//Print Day of the Week - Use a `switch` statement to print the name of the day based on a
//number input (1 for Monday, 2 for Tuesday, etc.).

public class week {
	public static void main(String[] args) {
		int day = 4;
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
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid");

		}

	}

}
