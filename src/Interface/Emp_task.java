package Interface;

//Create an interface Employee with a method work().
//Create an interface Employee.
//Create Developer, Tester and Manager classes
//Implement the work() method. 
//Developer writes code. Tester tests the application. 
//Manager manages the project.
interface Employee {
	void work();
}
	class Developer implements Employee {

		@Override
		public void work() {
			System.out.println("Developer Writes Code");

		}
	}

	class Tester implements Employee {

		@Override
		public void work() {

			System.out.println("Tester test the code");
		}
	}

	class Manager implements Employee {

		@Override
		public void work() {
			System.out.println("Manager manages the project");

		}

	}
public class Emp_task {
	public static void main(String[] args) {
		Employee Developer = new Developer();
		Employee Tester = new Tester();
		Employee Manager = new Manager();
		Developer.work();
		Tester.work();
		Manager.work();
	}
}
