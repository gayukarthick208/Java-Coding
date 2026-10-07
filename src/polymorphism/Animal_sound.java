package polymorphism;

public class Animal_sound {
	void dog() {
		System.out.println("dog says bow bow");
	}

static class cat extends Animal_sound  {
	@Override
	void dog() {
		super.dog();
		System.out.println("cat says meow meow");
	}
	}
	static class cow extends Animal_sound  {
		@Override
		void dog() {
			super.dog();
			System.out.println("cow says moo moo");
			
		}
	}

	public static void main(String[] args) {
		cat c = new cat();
		c.dog();
		cow w= new cow();
		w.dog();
	}

	}

