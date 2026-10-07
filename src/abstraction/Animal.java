package abstraction;

//Create an abstract class Animal with an abstract method sound(). Create subclasses Dog and Cat that implements the sound() method.
//Create an abstract class Animal. //Add an abstract method sound().
//Call the methods from the main() method. //Expected Output//Dog barks. Cat meows.
public abstract class Animal {
	abstract void sound();

	void dog() {
		System.out.println("Dog Barks");
	}

	void cat() {
		System.out.println("Cat Meows");
	}

}
