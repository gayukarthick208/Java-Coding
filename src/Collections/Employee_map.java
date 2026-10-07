package Collections;

import java.util.HashMap;
import java.util.Map;

//Employee Management System
public class Employee_map {
	public static void main(String[] args) {

		// Create a HashMap<Integer, String>.
		Map<Integer, String> emp = new HashMap<Integer, String>();

		// Store Employee ID and Employee Name.
		emp.put(101, "Shreya");
		emp.put(102, "Karthick");
		emp.put(103, "Gayu");
		emp.put(104, "Shara");
		emp.put(105, null);
		emp.put(106, "Lishu");
		emp.put(107, "Isha");
		emp.put(101, "Joshi");// Name modified

		// Display all employees.
		System.out.println("Employee Details :" + emp);

		// Search by Employee ID.
		boolean X = emp.containsKey(102);
		System.out.println(X);
		System.out.println("Employee ID:" + X);

		// Update an employee name.
		emp.put(105, "Ananya");
		System.out.println(emp);

		// Remove an employee.
		System.out.println(emp.remove(107));

		// Display all employee IDs
		System.out.println("Employee ID:" + emp.keySet());

		// Display all employee names.
		System.out.println("Employee name : " + emp.values());

		// Display all key-value pairs.
		System.out.println("Employee Details :" + emp.entrySet());

	}
}
