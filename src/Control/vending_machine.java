package Control;

//Simple Vending Machine - Create a simple vending machine program that allows the user to
//select a product (1 for Chips, 2 for Soda, 3 for Candy) and outputs the selected product
//name.
import java.util.Scanner;

public class vending_machine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("        Enter your choice        ");
		System.out.println("1.chips");
		System.out.println("2.Soda");
		System.out.println("3.Candy");

		int snacks = sc.nextInt();
		switch (snacks) {
		case 1:
			System.out.println("you choose: chips");
			break;

		case 2:
			System.out.println("you choose: Soda");
			break;

		case 3:
			System.out.println("you choose: candy ");
			break;

		default:
			System.out.println("Invalid Product");

		}
		
		sc.close();

	}
}