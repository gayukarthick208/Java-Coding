package polymorphism;

public class Area {
	void calculatearea(int radius) {
		double a = 3.14 * radius * radius;
		System.out.println(" area of circle=" + a);
	}
void calculatearea(int length,int breadth) {
	int area = length*breadth;
	
	System.out.println("area of rectangle=" + area);
	}
void calculatearea(double base, double height ) {
double value = 0.5 * base*height ;
System.out.println("area of triangle=" + value);
}
public static void main(String[] args) {
	Area a= new Area();
	a.calculatearea(6);
	a.calculatearea(25,10);
	a.calculatearea(9.0f,4.0f);
	
	
}
}
