package Casting;
//using an Instrument superclass and Guitar and Piano subclasses.  
//1. Create a superclass Instrument with a method play(). 
//2. Create a subclass Guitar that extends Instrument and overrides the play() method. 
//3. Create a subclass Piano that extends Instrument and overrides the play() method. 
//4. Perform upcasting by assigning a Guitar object to an Instrument reference. 
//5. Perform downcasting by casting the Instrument reference back to a Guitar reference. 
//6. Call a Guitar specific method on the downcasted reference

class Instrument {
	void play() {
		System.out.println("Instrument List");
	}
}
class Guitar extends Instrument {
	@Override
	void play() {
		System.out.println("Guitar Plays");
	}
	void perform() {
		System.out.println(" Guitar Tunes Music  ");
	}
}
class Piano extends Instrument {
	@Override
	void play() {
		System.out.println("Piano Plays");
	}
}
public class Instr_down {
	public static void main(String[] args) {
		Instrument i = new Guitar();
		Guitar g = (Guitar) i;
		i.play();
		g.perform();
	}
}
