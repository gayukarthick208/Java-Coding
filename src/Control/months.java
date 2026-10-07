package Control;
//Month Names - Write a program that takes an integer representing a month (1 for January, 2
//for February, etc.) and prints the name of the month.
public class months {
	public static void main(String[] args) {
		int months = 5;
		switch (months) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febraury");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		default:
			System.out.println("Invalid ");
			break;
		}
	}

}
