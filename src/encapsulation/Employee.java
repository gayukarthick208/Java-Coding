package encapsulation;

public class Employee {
	private String EmployeeName;
	private int Emp_id;
	private float Salary;

	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}

	public String getEmployeeName() {
		return EmployeeName;

	}

	public void setEmp_id(int Emp_id) {
		this.Emp_id = Emp_id;
	}

	public int getEmp_id() {
		return Emp_id;

	}

	public void setSalary(float Salary) {
		this.Salary = Salary;

	}

	public float getSalary() {
		return Salary;

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmployeeName("karthick");
		e.setEmp_id(4089);
		e.setSalary(89758.83f);
		Employee e2 = new Employee();
		e2.setEmployeeName("Simbu");
		e2.setEmp_id(6375);
		e2.setSalary(78310.83f);
		{
			System.out.println(e.EmployeeName);
			System.out.println(e.Emp_id);
			System.out.println(e.Salary);
			System.out.println(e2.EmployeeName);
			System.out.println(e2.Emp_id);
			System.out.println(e2.Salary);

		}

	}

}
