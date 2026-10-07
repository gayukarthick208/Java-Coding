package operators;

// Grade Assignment Based on Score: Write a Java program to assign grades based on a score using nested ternary operators. 
public class grade {
	public static void main(String[] args) {
		int marks = 85;
		System.out.println("marks :" + marks); 
	
		char grades = (marks >= 90) ? 'A' : (marks >= 75) ? 'B' : (marks >= 60) ? 'C' : 'D';

		System.out.println("Grades :" + grades);

	}

}
