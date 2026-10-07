package operators;
//Absolute Value: Calculate the absolute value of a number using the ternary operator.

public class absolute {
	public static void main(String[] args) {

		int number = -50;
		System.out.println("Number :" + number);
		int absolute = (number < 0) ? -number : number;
		{
			System.out.println("absolute value :" + absolute);
		}

	}
}
