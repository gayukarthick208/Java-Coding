package Collections;

import java.util.HashSet;
import java.util.Set;

//Student Name Management System (HashSet)
public class Stu_hash {
	public static void main(String[] args) {

		// Create a HashSet to store student names.
		HashSet<Object> student = new HashSet<Object>();

		// Add 10 student names.
		student.add("Reshma");
		student.add("Riya");
		student.add("Adharva");
		student.add("Lishaan");
		student.add("Karthick");
		student.add("Sanju");
		student.add("Joshi");
		student.add("Anvi");
		student.add("Krithik");
		student.add("Jashwin");
		System.out.println("Student names:" + student);

		// Try adding duplicate student names.
		student.add("Joshi");// duplicate
		student.add("Simbu");
		student.add("Karthick");// duplicate

		// Display all student names.
		System.out.println("All Student Names:" + student);

		// Display the total number of students.
		System.out.println("Size :" + student.size());

		// Check whether a particular student exists.
		boolean contains = student.contains("Lishaan");
		System.out.println("Contains Lishaan :" + contains);

		// Remove a student by name.
		student.remove("Riya");
		System.out.println("Remove student Riya :" + student);

		// Check whether the HashSet is empty.
		System.out.println("HashSet empty :" + student.isEmpty());

		// Clone the HashSet.
		Object X = student.clone();
		System.out.println("cloned :" + X);

		// Create another HashSet with new student names.
		HashSet<Object> stud = new HashSet<Object>();
		stud.add("Sruti");
		stud.add("Surya");
		stud.add("Siddharth");
		System.out.println("New Student names:" + stud);

		// Merge both sets using addAll().
		boolean M = student.addAll(stud);
		System.out.println(M);
		System.out.println("Merged list : " + student);

		// Check whether all students of the second set exist in the first set.
		boolean A = student.containsAll(stud);
		System.out.println(A);
		System.out.println("Contains All :" + student);

		// Remove all students of the second set.
		boolean R = student.removeAll(stud);
		System.out.println(R);
		System.out.println(student);

		// Retain only the common students between two sets.
		boolean all = student.retainAll(stud);
		System.out.println(all);
		System.out.println(student);

		// Convert the HashSet to an array.
		Object[] arr = stud.toArray();
		System.out.println("Array Elements :");
		for (Object name : arr) {
			System.out.println(name);
		}

		// Clear all student names.
		student.clear();
		System.out.println("Cleared:" + student);
		// Check whether the HashSet is empty after clearing.
		System.out.println("Empty :" + student.isEmpty());
	}

}
