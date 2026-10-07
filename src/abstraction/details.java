package abstraction;

public class details implements student {
	public void name() {
		System.out.println("name: gayathri");
	}

	public static void main(String[] args) {
		student s = new details();
		s.name();

	}
}
