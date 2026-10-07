package Collections;

import java.util.ArrayList;
import java.util.List;
public class demo {
	public static void main(String[] args) {
		List<Object> a = new ArrayList<>();

		a.add("Isha");

		a.add(767);
		a.add("Lish");
		a.add("Joshu");
		a.add("Shreya");
		System.out.println(a);

		// update
		a.set(1, "Yash");
		System.out.println(a);

		ArrayList<Object> b = new ArrayList<>();
		b.add("Isha");
		b.add("Yash");
		b.add("Lish");
		b.add("Joshu");
		b.add("Shreya");
		System.out.println(b);

		// checking condition
		System.out.println(a.containsAll(b));
		b.remove(0);
		System.out.println(b);
		System.out.println(a.contains(b));

		// index
		System.out.println(b.lastIndexOf("Shreya"));

		// clear

		a.clear();
		System.out.println(a);
		// empty

		System.out.println(a.isEmpty());

	}
}