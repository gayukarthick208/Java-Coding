package Control;

//Menu-Driven Program - Create a menu-driven program that allows the user to choose from
//different options such as adding, subtracting, multiplying, or dividing two numbers. Include
//an option to exit the program.
import java.util.Scanner;

public class menu_calculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU FOR CALCULATOR");

		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("5.Exit");
		System.out.println("Enter your choice");

		int choice = sc.nextInt();
		if (choice >= 1 && choice <= 4) {

			System.out.println("Enter first number:");
			int number1 = sc.nextInt();
			System.out.println(number1);
			

			System.out.println("Enter second number:");
			int number2 = sc.nextInt();
			System.out.println(number2);

			switch (choice) {

			case 1:
				System.out.println("Addition:" + (number1 + number2));
				break;

			case 2:
				System.out.println("Subtraction:" + (number1 - number2));
				break;

			case 3:
				System.out.println("Multiplication:" + (number1 * number2));
				break;

			case 4:
				System.out.println("Division:" + (number1 / number2));
				break;
			}
		}

		if (choice == 5) {
			System.out.println("Exit");
		} else {
			System.out.println("Program End");

		}
		sc.close();
	}
}
