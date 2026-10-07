package operators;

//Logical AND (&&): Write a Java program to Check if two conditions are both true
public class logical_and {
	public static void main(String[] args) {
		int attendance = 90;
		int marks = 75;

		System.out.println("Attendance :" + attendance);
		System.out.println("marks :" + marks);
		if (attendance > 75 && marks > 35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}
}
