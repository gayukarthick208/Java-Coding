package abstraction;

public class Ani_sound extends Animal {
	public void  sound() {
		System.out.println("Animal Sounds");
	}
	public static void main(String[] args) {
		Animal a = new Ani_sound();
		a.dog();
		a.cat();
	}

}
