package abstraction;

//Create an abstract class Vehicle with an abstract method start(). Each vehicle should have its own way of starting.
//Create an abstract class Vehicle. Create subclasses: car and Bike
//Override the start() method. Call the methods from the main() method.
//Car starts with a key. Bike starts with a self-start button.
public abstract class Vechicle {
	abstract void start();

	void car() {
		System.out.println("Car starts with a key");
	}

	void bike() {
		System.out.println("Bike starts with self-start button");

	}
}
