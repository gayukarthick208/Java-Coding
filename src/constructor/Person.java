package constructor;
//Task 2: Create a Person Class
// Create a class Person with fields name and age.
// Use a default constructor to initialize these fields with default values ("Unknown", 0).
//Use a parameterized constructor to initialize these fields with given values.
//Add a method displayDetails to print the person details.
//Create objects using both constructors and call the displayDetails method.
public class Person {
	String name;
	int age;

	Person() {
		String name;
		int age;
	}

	Person(String n, int a) {
		name = n;
		age = a;
	}

	void displayDetails() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Karthick", 32);

		System.out.println("Default Constructor");
		p1.displayDetails();
		System.out.println();
		System.out.println();

		System.out.println("parameterized Constructor");
		p2.displayDetails();
	}
}
