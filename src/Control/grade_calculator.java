package Control;

//Grade Calculator - Write a program that assigns a letter grade based on a numerical score.
public class grade_calculator {
	public static void main(String[] args) {
		int marks = 70;
		switch (marks / 10) {
		case 10:
		case 9:
			System.out.println("your grade is: A ");
			break;
		case 8:
			System.out.println("your grade is :B");
			break;
		case 7:
			System.out.println("your grade is :C");
			break;
		case 6:
			System.out.println("your grade is :D");
			break;
		case 5:
			System.out.println("your grade is :E");
			break;
		default:
			System.out.println("Fail ");

		}
	}
}
