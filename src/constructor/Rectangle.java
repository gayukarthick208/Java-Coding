package constructor;
//Create a Rectangle Class

// Create a class Rectangle with fields length and width.
//Use a default constructor to initialize these fields to 1.
//Use a parameterized constructor to initialize these fields with given values.
//Add a method calculateArea to return the area of the rectangle.
//Create objects using both constructors and print the area using the calculateArea method.

public class Rectangle {
	int length;
	int width;

	Rectangle() {
		int length = 1;
		int width = 1;
	}

	Rectangle(int l, int w) {
		length = l;
		width = w;
	}

	int calculateArea() {
		return length * width;
	}

	public static void main(String[] args) {

		Rectangle r = new Rectangle(1, 1);

		Rectangle r1 = new Rectangle(15, 80);

		System.out.println("Default Constructor");
		System.out.println("Length :" + r.length);
		System.out.println("Width :" + r.width);
		System.out.println("Area of a rectangle() :" + r.calculateArea());

		System.out.println();

		System.out.println("Parameterized Constructor");
		System.out.println("Length :" + r1.length);
		System.out.println("Width :" + r1.width);
		System.out.println("Area of a rectangle() :" + r1.calculateArea());

	}

}
