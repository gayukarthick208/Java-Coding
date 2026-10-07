package Collections;

import java.util.*;
import java.util.HashSet;

public class eg_set {
	public static void main(String[] args) {
		Set<Object> values = new HashSet<Object>();

		// add elements
		values.add("apple");
		values.add(9887);
		values.add("lishaan");
		values.add("joshu");
		values.add(345);
		values.add("null");
		values.add("joshu"); // doesn't allow duplicate values
		System.out.println(values);

		// size
		System.out.println(values.size());

		// remove
		values.remove(345);
		System.out.println(values);

		// contains
		System.out.println(values.contains("lishaan"));

		// iteration
		System.out.println("values:");
		for (Object value1 : values) {
			System.out.println(value1);

		}

		// change set into list
		System.out.println();
		ArrayList<Object> list = new ArrayList<Object>(values);
		System.out.println(list);

		// set
		list.set(2, "karthick");
		System.out.println(list);

		// add
		list.add(3, "gayu");
		System.out.println(list);

		// retains// keep only common elements.
		System.out.println("values:" + values);
		System.out.println("list :" + list);
		list.retainAll(values);
		System.out.println("after retains :" + values);

		// clear
		list.clear();
		System.out.println(list);

		// size
		System.out.println(list.size());

		// empty
		System.out.println(list.isEmpty());

	}

}
