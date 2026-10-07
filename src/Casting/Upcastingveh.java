package Casting;

//Create a superclass Vehicle with a method move(). 
// Create a subclass Car that extends Vehicle and overrides the move() method. 
// Create a subclass Bike that extends Vehicle and overrides the move() method. 
// Perform upcasting by assigning Car and Bike objects to Vehicle references. 
// Call the move() method on the Vehicle references.

class Vehicle {
	void move() {
		System.out.println("vechicle Moves");
	}
}

class car extends Vehicle {
	@Override
	void move() {
		System.out.println("Car Starts");
	}
}

class bike extends Vehicle {
	@Override
	void move() {
		System.out.println("Bike Starts");
	}
}

public class Upcastingveh {
	public static void main(String[] args) {
		Vehicle v = new car();
		Vehicle v1 = new bike();

		v.move();
		v1.move();

	}
}
