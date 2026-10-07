package Control;

//Find LCM of Two Numbers - Write a program to find the least common multiple (LCM) of
//two numbers using a `for` loop. 
public class Lcm {
	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 15;
		int LCM;
		for (int i = 1;; i++) {
			if ((num1 * i) % num2 == 0) {
				LCM = (num1 * i);
				System.out.println("LCM of  " + num1 + " and " + num2 + " is  " + LCM);
				break;
			}
		}

	}
}
