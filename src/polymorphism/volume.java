package polymorphism;

public class volume {
	void calculate (int area) {
	int  a =area* area* area;
	System.out.println("volume of a cube=" + a);
		
	}
	void calculate(int length,int width,int height) {
		int value=(length* width* height);
		System.out.println("volume of a rectangular prism=" + value);
		
	}
void calculate(int radius,double pie) {
	double values=(1.333*3.14*radius*radius*radius);
	System.out.println("volume of a sphere=" + values);
	
}
public static void main(String[] args) {
	volume v= new volume();
	v.calculate(5);
	v.calculate(5,10, 15);
	v.calculate(6);
}
}
