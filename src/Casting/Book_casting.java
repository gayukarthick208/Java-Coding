package Casting;
//Practice upcasting and downcasting using a Book superclass and Fiction and NonFiction subclasses.
//1. Create a superclass Book with a method read().
//2. Create a subclass Fiction that extends Book and overrides the read() method.
//3. Create a subclass NonFiction that extends Book and overrides the read() method.
//4. Perform upcasting by assigning a Fiction object to a Book reference.
//5. Perform downcasting by casting the Book reference back to a Fiction reference.
//6. Call a Fiction specific method on the downcasted reference.
class Book {
	void read() {
		System.out.println("Book Details");
	}
}
class Fiction extends Book {
	@Override
	void read() {
		System.out.println("Reading a fiction book");
	}
	void story() {
		System.out.println("Story is Interesting");
	}
	
}
class Nonfiction extends Book {
	@Override
	void read() {
		System.out.println("Reading a non fiction book ");

	}
}
public class Book_casting {
	public static void main(String[] args) {
		Book b = new Fiction();
		Fiction f = (Fiction) b;
		b.read();
		f.story();
	}
}
