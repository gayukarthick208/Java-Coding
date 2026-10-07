package operators;

//Check If a Number is Positive or Negative: Create a Java program to check if a number is positive or negative using the ternary operator. 
public class pos_neg {
	public static void main(String[] args) {
		int number = 25;
		String result = (number > 0) ? "Positive" : "Negative";
		System.out.println( number +  " Number is :" + result);

	}

}
