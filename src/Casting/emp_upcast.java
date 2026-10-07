package Casting;

//Practice upcasting using an Employee superclass and Manager and Developer subclasses.
//Create a superclass Employee with a method work().
// Create a subclass Manager that extends Employee and overrides the work() method.
// Create a subclass Developer that extends Employee and overrides the work() method.
//Perform upcasting by assigning Manager and Developer objects to Employee references.
//Call the work() method on the Employee references

class Employee {
	void work() {
		System.out.println(" Employee Working Details");
	}
}

class Manager extends Employee {
	@Override
	void work() {
		System.out.println("Manager manages the team ");
	}
}

class Developer extends Employee {
	@Override
	void work() {
		System.out.println("Developer Writes the code");
	}
}

public class emp_upcast {
	public static void main(String[] args) {
		Employee e = new Manager();
		Employee f = new Developer();
		e.work();
		f.work();
	}

}
