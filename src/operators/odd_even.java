package operators;

//Check Even or Odd Number: Write a Java program to Check if a number is even or odd using the ternary operator. 
public class odd_even {
	public static void main(String[] args) {
		int number = 10;

		String result = (number % 2 == 0) ? "even number" : "odd number";

		System.out.println("Number :" + number);
		System.out.println(result);
	}

}
