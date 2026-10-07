package abstraction;

public class Enfield extends Ride {
	public void bike() {
		System.out.println("Royal Enfield:");
		}
	public static void main(String[] args) {
		Ride r=new Enfield ( );
		r.bike();
		r.start();
		r.stop();
		
		
	}
	

}
