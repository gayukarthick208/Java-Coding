package constructor;

public class Student {
	public Student(int rollno,String name,int marks,int percentage){
		System.out.println("rollno:"+ rollno);
		System.out.println("name:"+name);
		System.out.println("marks:"+ marks);
		System.out.println("percentage:"+percentage);
		
		
	}
	public static void main(String[] args) {
		Student s=new Student(1,"shreya",385,86);
		Student a=new Student(2,"karthick",434,94);
		Student b=new Student(3,"lish",485,98);
		Student c=new Student(4,"josh",448,90);
		
		
		
	}

}
