package Collections;

import java.util.HashSet;
import java.util.Set;

public class hashsets {
	public static void main(String[] args) {

		// add
		Set<Object> myset = new HashSet<Object>();
		myset.add("pink");
		myset.add("rose");
		myset.add(787);
		myset.add("goat");
		myset.add("purple");
		myset.add(null);
		System.out.println(myset);

		// size
		System.out.println("Size :" +myset.size());
		// array
		Object[] arr = myset.toArray();
		System.out.println("array :");
		for (Object X : arr) {
			
			System.out.println(X);
		}

		// hashcode returns the code
		myset.hashCode();
		System.out.println(myset);

		// remove
		myset.remove(787);
		System.out.println(myset);
		System.out.println(myset.size());

		// contains
		System.out.println(myset.contains("rose"));

		// add all

		Set<Object> myset1 = new HashSet<>();
		myset1.addAll(myset);
		System.out.println(myset1);

		// equals
		System.out.println(myset1.equals(myset1));

		// remove all
		myset1.removeAll(myset);
		System.out.println(myset1);

		// empty
		myset.isEmpty();
		System.out.println(myset1);

		// size
		System.out.println(myset1.size());

	}
}
