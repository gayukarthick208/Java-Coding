package Control;

//Find the Largest of Two Numbers - Use `if-else` to find the largest of two numbers provided
//by the user
import java.util.Scanner;
public class largest_num {
	public static void main(String[] args) {
		Scanner sc = new  Scanner (System.in);
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		System.out.println("enter second number:");
		int num2=sc.nextInt();
		if (num1 > num2) {
			System.out.println("Largest Number:" + num1);

		}
		else {
			System.out.println("Largest Number:" + num2);
		}
sc.close();
	}

}
