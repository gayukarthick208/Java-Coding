package encapsulation;

public class Details {
	private String studentname;
	private int rollno;
	private Float marks;
	
	public void setstudentname(String studentname) {
		this.studentname = studentname;
		
	}
	public String getstudentname() {
		return studentname;
		
	}
	public void setrollno(int rollno) {
		this.rollno = rollno;
		
	}
public int getrollno() {
	return rollno;
	
}
public void setmarks(float marks) {
	this.marks = marks;
	
}
public Float getmarks() {
	return marks;
	
}
}

