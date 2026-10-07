package operators;

//Determine If a Year is a Leap Year: Create a Java program to determine if a given year is a leap year using the ternary operator.
public class leap_year {
	public static void main(String[] args) {
		int year = 2025;
		System.out.println(year);
		String result = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "leapyear" : "not a leap year";
		System.out.println(result);
	}

}
