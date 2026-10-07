package Collections;

import java.util.TreeSet;

public class Tree {
	public static void main(String[] args) {
		TreeSet<Integer> num = new TreeSet<>();
		num.add(10);
		num.add(65);
		num.add(32);
		num.add(24);
		num.add(98);
		num.add(45);
		num.add(76);
		System.out.println("numbers :" + num); // ascending order
		System.out.println("First number :" + num.getFirst());
		System.out.println("Last number :" + num.getLast());
		System.out.println("Higher number than 50 :" + num.higher(50));
		System.out.println("Lower number than 50  :" + num.lower(50));
		System.out.println("Ceiling number  of 30  :" + num.ceiling(30));
		System.out.println("Floor number of  50  :" + num.floor(30));
		System.out.println("Poll First: " +num.pollFirst());
		System.out.println("After Poll First: " + num);

		System.out.println("Poll Last: " + num.pollLast());
		System.out.println("After Poll Last: " + num);

	}

}
