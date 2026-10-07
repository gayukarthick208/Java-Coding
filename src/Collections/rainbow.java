package Collections;

import java.util.HashSet;
import java.util.Set;

public class rainbow {
	public static void main(String[] args) {

		Set<String> colors = new HashSet<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		System.out.println(colors);

		// iterators
		for (String col : colors) {
			System.out.println(col);
		}

	}
}
