package arrays;

//Array example
public class marks {
	public static void main(String[] args) {
		int[] marks = { 70, 85, 88, 95, 64 };
		marks[3] = 98;// changing an element
		marks[4] = 88;
		System.out.println(marks[1]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println("size:" + marks.length);// length of an array
	}

}
