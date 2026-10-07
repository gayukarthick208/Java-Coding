package Control;

//Day to Activity Planner - Write a program that suggests activities based on the day of the
//week (1 for Monday, 2 for Tuesday, etc.).
import java.util.Scanner;
public class activity_planner {
public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	System.out.println("enter  the number for week days:");
	int day=sc.nextInt();
	switch(day) {
	case 1:
		System.out.println("Monday-Dance class ");
		break;
	case 2:
		System.out.println("Tuesday-Play outdoor games ");
		break;
	case 3:
		System.out.println("Wednesday-Hindi class");
		break;
	case 4:
		System.out.println("Thursday- phonics");
		break;
	case 5:
		System.out.println("Friday-Tennis class");
		break;
	case 6:
		System.out.println("Saturday-park and play");
		break;
	case 7:
		System.out.println("Sunday -Funtime with family ");
		break;
		default:
			System.out.println("Invalid - enter the number correctly");
	}
	sc.close();
}
}
