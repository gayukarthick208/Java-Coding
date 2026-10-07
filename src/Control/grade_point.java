package Control;
//  Grade Point Average Calculation - Create a program that takes a letter grade (A, B, C, D, F)

//and converts it to the corresponding grade point (4.0, 3.0, 2.0, 1.0, 0.0). Include a default
//case for invalid grades.

import java.util.Scanner;

public class grade_point {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your grade ('A','B','C','D','F'): ");
		char Grade = sc.next().toUpperCase().charAt(0);
		switch (Grade) {
		case 'A':
			System.out.println("Grade:4.0");
			break;

		case 'B':
			System.out.println("Grade:3.0");
			break;

		case 'C':
			System.out.println("Grade:2.0");
			break;

		case 'D':
			System.out.println("Grade:1.0");
			break;

		case 'F':
			System.out.println("Grade:0.0");
			break;

		default:
			System.out.println("Invalid Grade");

		}

		sc.close();
	}
}

