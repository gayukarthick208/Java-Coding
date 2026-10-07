package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lhashset {
	public static void main(String[] args) {

		Set<Object> a = new LinkedHashSet<Object>();
		a.add("apple");
		a.add("kiwi");
		a.add("orange");
		a.add("Papaya");
		a.add("Grapes");
		System.out.println("items :" + a);
		System.out.println("Original Size :" + a.size());
		// before size
		// contains
		System.out.println("contains Kiwi: " + a.contains("kiwi"));
		// remove
		a.remove("Grapes");
		a.remove("kiwi");
		System.out.println("Remove :" + a);
		// iterator
		Object[] arr = a.toArray();
		for (Object obj : arr) {
			System.out.println(obj);
		}
		// size
		System.out.println("size after removing :" + a.size());
	}

}
