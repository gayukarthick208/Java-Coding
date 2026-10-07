package constructor;

//Task 2: Create a Car Class
//• Create a class Car with fields make, model, and year.
//• Use a default constructor to initialize these fields with default values ("Unknown",
//"Unknown", 0).
//• Add a method displayDetails to print the car details.
//• Create an object using the default constructor and call the displayDetails method.
public class car {
	String make = "unknown";
	String model = "unknown";
	double year = 0.0;

	void displaydetails() {
		System.out.println("make :" + make);
		System.out.println("model :" + model);
		System.out.println("year :" + year);
	}

	public static void main(String[] args) {
		car c = new car();
		c.displaydetails();
	}

}
