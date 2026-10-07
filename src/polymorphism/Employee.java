package polymorphism;

public class Employee {
	void name() {
		System.out.println("no name here");
	}

	void name(char initial) {
		System.out.println("initial=" + initial);
	}

	void name (String name, int age) {
	 System.out.println("Name = " + name + ", Age = " + age);
	}
	void name (float salary,int emp_id, String designation ) {
		System.out.println("salary = " +salary);
		System.out.println("emp_id = " + emp_id);
		System.out.println("designation = " + designation);
		
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name();
		e.name('K');
		e.name("joshi", 25);
		e.name(55876.78f, 65876, "software testing");

	}

}
