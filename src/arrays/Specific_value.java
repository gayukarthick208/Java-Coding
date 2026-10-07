package arrays;

//Check if an Array Contains a Specific Value - 
//Write a program to check if a specific value is present in an array
public class Specific_value {
	public static void main(String[] args) {

		int[] num = { 12, 28, 20, 56, 78, 93 };
		int value = 28;
		int i;

		for (i = 0; i < num.length; i++) {
			if (value == num[i]) {
				System.out.println(value + ":Specific value present");
				break;
			}
		}

		if (i == num.length)
			System.out.println("Not present");
	}

}
