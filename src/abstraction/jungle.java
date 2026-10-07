package abstraction;

public class jungle implements forest {
	public void reptiles() {
		System.out.println("this is a snake");
	}

	public static void main(String[] args) {

		forest f = new jungle();
		f.animals();
		f.reptiles();
		forest.birds();

	}

}
