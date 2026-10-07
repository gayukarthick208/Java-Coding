package constructor;

//Task 2: Create an Employee Class
//• Create a class Employee with fields name, position, and salary.
//• Use a parameterized constructor to initialize these fields.
//• Add a method displayDetails to print the employee details.
//• Create an object using the parameterized constructor and call the displayDetails method.
public class Employee1 {
	String name = "Joshetha";
	String position = "software Testing";
	double Salary = 65000.00;

	void displayDetails() {
		System.out.println("EMPLOYEE DETAILS:");
		System.out.println("Name :" + name);
		System.out.println("Position :" + position);
		System.out.println("Salary :" + Salary);
	}

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.displayDetails();

	}

}
