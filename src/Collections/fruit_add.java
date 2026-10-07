package Collections;

import java.util.ArrayList;

public class fruit_add {
	public static void main(String[] args) {
		ArrayList<String> f = new ArrayList<String>();
		// add
		
		f.add("Apple");
		f.add("Orange");
		f.add("Banana");
		System.out.println(f);

		// add more items

		f.add(3, "Mango");
		f.add(4, "Guava");
		System.out.println(f);


		// size

		System.out.println(f.size());

		// get iteration 3

		System.out.println(f.get(3));

		// set

		f.set(0, "Kiwi");
		f.set(1, "Grapes");
		System.out.println(f);

		// remove iteration

		f.remove(4);
		System.out.println(f);
		
		f.removeLast();
		System.out.println(f);
		Object g = f.clone();
		System.out.println(g);
		//array
		Object[] a = f.toArray();
		for(Object h:a) {
			System.out.println(h);
			
		}
		
		

	}
}
