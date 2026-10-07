package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Understanding ArrayList using Student names.
public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		// Add 5 student names to the list.
		names.add("Joshi");
		names.add("Lishaan");
		names.add("Shreya");
		names.add("Viha");
		names.add("Kavin");
		System.out.println("Student names :" + names);

		// Insert a new student at the beginning of the list.
		names.addFirst("Karthick");
		System.out.println(names);

		// Insert another student at a specific index.
		names.add(3, "gayu");
		System.out.println(names);

		// Display all student names.
		System.out.println("All Student Names :" + names);

		// Display the total number of students.
		System.out.println("no of students:" + names.size());

		// Check whether a particular student exists in the list.

		System.out.println("Contains Lishaan :" + names.contains("Lishaan"));

		// Find the index of a student.
		System.out.println("Joshi's Index :" + names.indexOf("Joshi"));

		// Find the last occurrence of a student name
		System.out.println("Last Ocuurence of Kavin :" + names.lastIndexOf("Kavin"));

		// Retrieve the student name at a given index
		System.out.println("Retrive the student name :" + names.get(3));

		// Replace an existing student name with a new one
		names.set(4, "Yashu");
		System.out.println("Updated :" + names);

		// Remove a student using the index.
		names.remove(6);
		System.out.println("Removed by index :" + names);

		// Remove a student using the object (name).
		System.out.println(names.remove("Viha"));
		System.out.println("After Removing :" + names);

		// Check whether the list is empty.
		boolean X = names.isEmpty();
		System.out.println("Is Empty :" + X);

		// Clone the student list into another ArrayList.
		Object Y = names.clone();
		System.out.println("clone :" + Y);

		// Create another ArrayList with new student names.
		List<String> names1 = new ArrayList<String>();
		names1.add("Mehna");
		names1.add("Lishaan");
		names1.add("Joshi");
		names1.add("Simbu");
		names1.add("Karthick");
		System.out.println("New student names :" + names1);

		// Retain only the common students between two lists.
		boolean retainAll = names.retainAll(names1);
		System.out.println(retainAll);
		System.out.println("Retains :" + names);

		// Merge both lists into a single list.
		boolean A = names.addAll(names1);
		System.out.println(A);
		System.out.println("Merged List :" + names);

		// Check whether all students from the second list exist in the first list.
		boolean containsAll = names.containsAll(names1);
		System.out.println("Check Student from list 2 to list 1 :" + containsAll);

		// Remove all students of the second list from the first list.
		boolean b = names.removeAll(names1);
		System.out.println("removed names1 :" + names);

		// remove common names
		System.out.println(names.remove("Lishaan"));
		System.out.println(names.remove("Karthick"));	
		
		// Convert the ArrayList into an array.
		Object[] array = names1.toArray();
		System.out.println("Array Elements:");
		for (Object arr : array) {
			System.out.println(arr);

		}
		System.out.println("Before Sorted :" + names1);
		
		// Sort the student names in alphabetical order.
		Collections.sort(names1);
		System.out.println("After Sorted :" + names1);

		// Reverse the order of the student names.
		List<String> reversed = names1.reversed();
		System.out.println("Name Reversed : " + reversed);

		// Shuffle the student names randomly.
		Collections.shuffle(names1);
		System.out.println("Shuffled :" + names1);

		// Display a portion of the list using subList().
		System.out.println(names1.subList(0, 4));

		// Clear all student names from the list.
		names1.clear();
		System.out.println("Cleared : " + names1);

		// Check whether the list is empty after clearing it.
		names1.isEmpty();
		System.out.println("Empty :" + names1);

	}
}
