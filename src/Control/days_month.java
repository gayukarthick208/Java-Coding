package Control;

//Write a program that takes a month number (1 for
//January, 2 for February, etc.) and prints the number of days in that month. Assume it is not a
//leap year
import java.util.Scanner;

public class days_month {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for month:");
		int months = sc.nextInt();
		switch (months) {

		case 1:
			System.out.println("january - 31 days");
			break;

		case 2:
			System.out.println("febraury - 28 days");
			break;

		case 3:
			System.out.println("maech - 31 days");
			break;

		case 4:
			System.out.println("april - 30 days");
			break;

		case 5:
			System.out.println("may - 31 days");
			break;

		case 6:
			System.out.println("june - 30 days");
			break;

		case 7:
			System.out.println("july - 31 days");
			break;

		case 8:
			System.out.println("august - 31 days");
			break;

		case 9:
			System.out.println("september - 30 days");
			break;

		case 10:
			System.out.println("october - 31 days");
			break;

		case 11:
			System.out.println("november - 30 days");
			break;

		case 12:
			System.out.println("december - 31 days");
			break;

		default:
			System.out.println("Invalid Month");

		}

		sc.close();
	}

}
