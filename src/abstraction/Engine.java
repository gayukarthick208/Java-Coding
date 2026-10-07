package abstraction;

 abstract class Evehicles1 {
	abstract void start ();
	
	void stop() {
		System.out.println("Engine stopped");
	}
 }
	class bike extends Evehicles1{
		void start() {
			System.out.println("Engine start");
		}
	}
public class Engine  {
	public static void main(String[] args) {
		bike b = new bike();
		b.start();
		b.stop();
	}

}

