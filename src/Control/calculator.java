package Control;
//Simple Calculator - Implement a simple calculator using a `switch` statement to perform
//addition, subtraction, multiplication, or division.

public class calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		String operation = "Multiplication";
		switch (operation) {

		case "Addition":
			System.out.println("Addition: " + (a + b));
			break;

		case "Subtraction":
			System.out.println("Subtraction:" + (a - b));
			break;
			
		case "Multiplication":
			System.out.println("Multiplication:" + (a * b));
			break;
			
		case "Division":
			System.out.println("Division:" + (a / b));
			break;
			
		default:
			System.out.println("Invalid");
			break;

		}
	}
}
