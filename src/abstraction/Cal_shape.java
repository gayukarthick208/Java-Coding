package abstraction;

public class Cal_shape extends Shape {
	public void CalculateArea() {
		System.out.println("calculate area for the shapes");
	}

	public static void main(String[] args) {
		Shape s = new Cal_shape();

		s.circle();
		s.Rectangle();
	}

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		
	}
}
