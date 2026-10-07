package abstraction;

//Create an abstract class Shape with an abstract method calculateArea(). 
//Create subclasses that calculate the area of different shapes.
//Create an abstract class Shape.//Add an abstract method calculateArea().
//Create square and Rectangle classes. //Use the area calculation.
//Display the area in the main() method for each class//Expected Output
//Area of Circle = 78.5 Area of Rectangle = 50

public abstract class Shape {
	abstract void calculateArea();

	void circle() {
		int radius = 5;
		double area1 = 3.14 * radius * radius;
		System.out.println("Area of a Circle :" + area1);

	}

	void Rectangle() {
		int length = 10;
		int width = 5;
		int area2 = length * width;
		System.out.println("Area of a Rectangle : " + area2);
	}

}
