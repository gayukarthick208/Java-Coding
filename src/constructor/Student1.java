package constructor;

//Task 1: Create a Student Class
//• Create a class Student with fields name, rollNumber, and grade.
//• Use a parameterized constructor to initialize these fields.
//• Add a method displayDetails to print the student details.
//• Create an object using the parameterized constructor and call the displayDetails method.
public class Student1 {
	String name = "Joshetha";
	int rollno = 5;
	char grade = 'A';

	void displayDetails() {
		System.out.println("Name : " + name);
		System.out.println("Roll_no : " + rollno);
		System.out.println("Grade : " + grade);

	}

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.displayDetails();

	}
}
