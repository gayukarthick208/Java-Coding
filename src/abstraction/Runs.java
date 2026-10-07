

package abstraction;

public class Runs extends Vechicle {
	public void start() {
		System.out.println("Vechicle starts");
	}

	public static void main(String[] args) {
		Vechicle v = new Runs();
		v.car();
		v.bike();

	}
}
