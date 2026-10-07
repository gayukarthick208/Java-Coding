package polymorphism;

public class Employee_salary {
	void calculatesalary (int salary) {
		System.out.println("salary ="+ salary);
	}
	void calculatesalary (float salary ,int bonus ) {
		System.out.println("salary with bonus =" + (bonus + salary));
		
	}

	public static void main(String[] args) {
		Employee_salary e = new Employee_salary ();
		
				e.calculatesalary(60000);
		e.calculatesalary(60000.00f, 14000);
				
	}
}
