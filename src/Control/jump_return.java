package Control;

//Write a method to check if a number is positive, negative, or zero, and return a
//corresponding message using the return statement.
public class jump_return {
	String Chechnum(int num) {
		if (num > 0) {
			return "Positive";

		} else if (num < 0) {
			return "Negative";

		} else {
			return "Zero";
		}

	}

	public static void main(String[] args) {

		jump_return j = new jump_return();
		String result = j.Chechnum(-6);

		System.out.println("Result:" +result);

	}

}
