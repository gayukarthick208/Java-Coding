package constructor;

//Task 1: Create a Book Class
//• Create a class Book with fields title, author, and price.
//• Use a default constructor to initialize these fields with default values ("Unknown",
//"Unknown", 0.0).
//• Add a method displayDetails to print the book details.
//• Create an object using the default constructor and call the displayDetails method.
public class book {
	String Title = "unknown";
	String Author = "unknown";
	double Price = 0.0;

	void displaydetails() {
		System.out.println("title :" + Title);
		System.out.println("author :" + Author);
		System.out.println("price :" + Price);
	}

	public static void main(String[] args) {
		book b = new book();
		b.displaydetails();

	}

}
