package Casting;

//downcasting using a Device superclass and Smartphone and Laptop subclasses.  
//Create a superclass Device with a method turnOn(). 
//Create a subclass Smartphone that extends Device and overrides the turnOn() method. 
//Create a subclass Laptop that extends Device and overrides the turnOn() method. 
// Perform upcasting by assigning a Smartphone object to a Device reference. 
//Perform downcasting by casting the Device reference back to a Smartphone reference. 
//Call a Smartphone specific method on the downcasted reference

class Device {
	void turnon() {
		System.out.println("Switch on the device");
	}

}

class Smartphone extends Device {
	@Override
	void turnon() {
		System.out.println("Smartphone connects ");
	}

	void perform() {
		System.out.println("Make a Call");
	}

}

class Laptop extends Device {
	@Override
	void turnon() {
		System.out.println("Laptop Connects");
	}

}

public class device_down {
	public static void main(String[] args) {
		Device d = new Smartphone();
		Smartphone s = (Smartphone) d;
		d.turnon();
		s.perform();

	}

}
