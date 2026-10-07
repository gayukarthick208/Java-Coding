package operators;

//2. Logical OR (||): Write a Java program to check if at least one of two conditions is true. 
public class logical_or {
	public static void main(String[] args) {
		int age = 28;
		boolean voterID = true;
		System.out.println("Age of the Person :" + age);
		System.out.println("Person had VoterID : " + voterID);
		if (age >= 18 || voterID) {
			System.out.println("Eligible to Vote");
		} else
			System.out.println("Not Eligible to Vote");

	}

}
