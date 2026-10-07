package Control;

//Traffic Light System - Create a program that simulates a traffic light system using the colours
// red, yellow, and green
public class traffic_light {
	public static void main(String[] args) {
		String colour = "Red";
		switch (colour) {
		case "Red":
			System.out.println("STOP");
			break;
		case "Yellow":
			System.out.println("GET READY");
			break;
		case "Green":
			System.out.println("GO");
			break;
		default:
			System.out.println("INVALID TRAFFIC SIGNAL");
break;
		}

	}

}
