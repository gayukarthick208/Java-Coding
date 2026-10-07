package Casting;

//Practice upcasting and downcasting using a Computer superclass and Desktop and Laptop subclasses.
//
//1. Create a superclass Computer with a method compute().
//2. Create a subclass Desktop that extends Computer and overrides the compute()method.
//3. Create a subclass Laptop that extends Computer and overrides the compute()method.
//4. Perform upcasting by assigning a Desktop object to a Computer reference.
//5. Perform downcasting by casting the Computer reference back to a Desktopreference.
//6. Call a Desktop specific method on the downcasted reference.

class Computer {
	void compute() {
		System.out.println("Computer Computes");
	}
}

class Desktop extends Computer {
	@Override
	void compute() {
		System.out.println("desktop Computes");
	}

	void perform() {
		System.out.println("Perform operations");
	}
}

class Lap extends Computer {
	@Override
	void compute() {
		System.out.println("Laptop Computes");

	}

}

public class Comp_casting {
	public static void main(String[] args) {
		Computer c = new Desktop();
		Desktop d = (Desktop) c;

		c.compute();
		d.perform();

	}

}
