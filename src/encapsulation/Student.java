package encapsulation;

public class Student {
	public static void main(String[] args) {
		Details d = new Details();
		d.setstudentname("Isha");
		d.setrollno(21);
		d.setmarks(461.00f);
		Details d1 = new Details();
		d1.setstudentname("Lish");
		d1.setrollno(28);
		d1.setmarks(485.00f);
		Details d2 = new Details();
		d2.setstudentname("Josh");
		d2.setrollno(24);
		d2.setmarks(490.00f);
		
		{
		System.out.println("Student Name :"+ d.getstudentname());
		System.out.println("Roll No:" + d.getrollno());
		System.out.println("Mark:" + d.getmarks());
		System.out.println("Student Name :"+ d1.getstudentname());
		System.out.println("Roll No:" + d1.getrollno());
		System.out.println("Mark:" + d1.getmarks());
		System.out.println("Student Name :"+ d2.getstudentname());
		System.out.println("Roll No:" + d2.getrollno());
		System.out.println("Mark:" + d2.getmarks());
		
	}
	}
}
